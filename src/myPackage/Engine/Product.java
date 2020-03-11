package myPackage.Engine;

public class Product
{

    private String name;
    private String category;
    private double price;
    private int quantity;
    private String description;

    public Product()
    {
        name = "";
        category = "";
        price = 0;
        quantity = 0;
        description = "";
    }

    public Product(String name, String category, double price, int quantity, String description)
    {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public String getName()
    {
        return name;
    }

    public String getCategory()
    {
        return category;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public String getDescription()
    {
        return description;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

}
