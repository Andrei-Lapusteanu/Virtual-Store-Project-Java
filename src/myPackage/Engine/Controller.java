package myPackage.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import myPackage.UI.MainUI;

public class Controller
{
    private final  Model model = new Model();
    private   List<Product> listOfProducts = new ArrayList<>();
    private   List<Product> listOfPrecommands = new ArrayList<>();
    private   List<Product> listOfCommands = new ArrayList<>();
    
    public Controller()
    {
        listOfProducts = model.getProductList();
        listOfPrecommands = model.getPrecommandsList();
        listOfCommands = model.getCommandsList();
    }
    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

  
    public List<Product> getListOfPrecommands() {
        return listOfPrecommands;
    }

    
    public List<Product> getListOfCommands() {
        return listOfCommands;
    }
    
    public void RereadPrecommands()
    {
        model.ReadPrecommands();
    }
    
    public void DisplayProducts()
    {
        getListOfProducts().forEach((product) ->
        {
            System.out.println(product.getName() + " | Pret: " + product.getPrice() + " RON | Cantitate disponibila: " + product.getQuantity() + " | Descriere: " + product.getDescription());
        });
    }
    
    public String CheckLogin(String username, String password)
    {
        String returnAnswer = "Invalid";
        List<User> listOfUsers = new ArrayList<>();
        listOfUsers = model.getUserList();

        for (User user : listOfUsers)
        {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword()))
            {
                returnAnswer = user.getType();
            }

        }
        return returnAnswer;
    }

    public void AddProduct(String name, String category, Double price, int quantity, String description)
    {
        Product dummy = new Product(name, category, price, quantity, description);
        listOfProducts.add(dummy);
        //MainUI.productsList.add(dummy);
        
    }

    public void DeleteProduct(String name)
    {
        for (ListIterator<Product> iter = getListOfProducts().listIterator(); iter.hasNext();)
        {
            Product auxProduct = iter.next();
            if (auxProduct.getName().equals(name))
            {
                iter.remove();
            }
        }
    }

    public void PlacePreCommand(Product product, int quantity)
    {
        Product dummy = product;
        dummy.setQuantity(quantity);
        //listOfPrecommands.add(dummy);
        MainUI.preOrdersList.add(dummy); 
    }

    public void PlaceCommand(Product product, int preOrderTableIndex)
    {
        int i = 0;
        boolean found = false;
        while (i < getListOfProducts().size() && found == false)
        {
            if (product.getName().equals(getListOfProducts().get(i).getName()))
            {
                getListOfProducts().get(i).setQuantity(getListOfProducts().get(i).getQuantity() - product.getQuantity());
                found = true;
            }
            i ++;
        }
        
        /*
        for (ListIterator<Product> iter = getListOfPrecommands().listIterator(); iter.hasNext();)
        {
            Product auxProduct = iter.next();
            if (auxProduct.getName().equals(product.getName()))
            {
                iter.remove();
            }
        }
        */
        
        listOfPrecommands.remove(preOrderTableIndex);
        
        MainUI.productsList = getListOfProducts();
        MainUI.ordersList.add(product);
        MainUI.preOrdersList = getListOfPrecommands();
        
        model.PlaceCommand(product);      
    }

    public void SaveToDB()
    {
        model.SaveListOfProducts(getListOfProducts());
        model.SaveListOfPrecommands(getListOfPrecommands());
    }

    public void AddProduct(String name, Object category, String price, Object quantity, String description) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
