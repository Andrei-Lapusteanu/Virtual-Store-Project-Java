/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage.UI;
import myPackage.Engine.Product;

import java.util.List;
import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Andrei
 */
public final class MainUI extends javax.swing.JFrame {

    public static List<Product> productsList = LoginUI.controller.getListOfProducts();
    public static List<Product> preOrdersList = LoginUI.controller.getListOfPrecommands();
    public static List<Product> ordersList = LoginUI.controller.getListOfCommands();
    
        
    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
        
        LoginUI.uiLogic.Query(MainTableItems, productsList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainToolbar = new javax.swing.JToolBar();
        MainButtonAddItem = new javax.swing.JButton();
        MainButtonRemoveItem = new javax.swing.JButton();
        MainButtonShoppingCart = new javax.swing.JButton();
        MainButtonPlaceOrder = new javax.swing.JButton();
        MainButtonPreOrders = new javax.swing.JButton();
        MainButtonLogout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MainTableItems = new javax.swing.JTable();
        MainMenuBar = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Application");
        setMinimumSize(new java.awt.Dimension(300, 310));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        MainToolbar.setBackground(new java.awt.Color(204, 204, 204));
        MainToolbar.setFloatable(false);
        MainToolbar.setOrientation(javax.swing.SwingConstants.VERTICAL);
        MainToolbar.setRollover(true);
        MainToolbar.setMaximumSize(new java.awt.Dimension(143, 59));
        MainToolbar.setMinimumSize(new java.awt.Dimension(143, 59));

        MainButtonAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/UI/Images/plus2.png"))); // NOI18N
        MainButtonAddItem.setText("Add item");
        MainButtonAddItem.setFocusable(false);
        MainButtonAddItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MainButtonAddItem.setMaximumSize(new java.awt.Dimension(90, 60));
        MainButtonAddItem.setMinimumSize(new java.awt.Dimension(90, 60));
        MainButtonAddItem.setPreferredSize(new java.awt.Dimension(90, 60));
        MainButtonAddItem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MainButtonAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainButtonAddItemActionPerformed(evt);
            }
        });
        MainToolbar.add(MainButtonAddItem);

        MainButtonRemoveItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/UI/Images/cross2.png"))); // NOI18N
        MainButtonRemoveItem.setText("Remove item");
        MainButtonRemoveItem.setEnabled(false);
        MainButtonRemoveItem.setFocusable(false);
        MainButtonRemoveItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MainButtonRemoveItem.setMaximumSize(new java.awt.Dimension(90, 60));
        MainButtonRemoveItem.setMinimumSize(new java.awt.Dimension(90, 60));
        MainButtonRemoveItem.setPreferredSize(new java.awt.Dimension(90, 60));
        MainButtonRemoveItem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MainButtonRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainButtonRemoveItemActionPerformed(evt);
            }
        });
        MainToolbar.add(MainButtonRemoveItem);

        MainButtonShoppingCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/UI/Images/shopping cart.png"))); // NOI18N
        MainButtonShoppingCart.setText("Shopping Cart");
        MainButtonShoppingCart.setFocusable(false);
        MainButtonShoppingCart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MainButtonShoppingCart.setMargin(new java.awt.Insets(0, 0, 0, 0));
        MainButtonShoppingCart.setMaximumSize(new java.awt.Dimension(90, 60));
        MainButtonShoppingCart.setMinimumSize(new java.awt.Dimension(90, 60));
        MainButtonShoppingCart.setPreferredSize(new java.awt.Dimension(90, 60));
        MainButtonShoppingCart.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MainButtonShoppingCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainButtonShoppingCartActionPerformed(evt);
            }
        });
        MainToolbar.add(MainButtonShoppingCart);

        MainButtonPlaceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/UI/Images/place order2.png"))); // NOI18N
        MainButtonPlaceOrder.setText("Place order");
        MainButtonPlaceOrder.setEnabled(false);
        MainButtonPlaceOrder.setFocusable(false);
        MainButtonPlaceOrder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MainButtonPlaceOrder.setMaximumSize(new java.awt.Dimension(90, 60));
        MainButtonPlaceOrder.setMinimumSize(new java.awt.Dimension(90, 60));
        MainButtonPlaceOrder.setPreferredSize(new java.awt.Dimension(90, 60));
        MainButtonPlaceOrder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MainButtonPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainButtonPlaceOrderActionPerformed(evt);
            }
        });
        MainToolbar.add(MainButtonPlaceOrder);

        MainButtonPreOrders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/UI/Images/PreOrders.png"))); // NOI18N
        MainButtonPreOrders.setText("Pre-orders");
        MainButtonPreOrders.setFocusable(false);
        MainButtonPreOrders.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MainButtonPreOrders.setMaximumSize(new java.awt.Dimension(90, 60));
        MainButtonPreOrders.setMinimumSize(new java.awt.Dimension(90, 60));
        MainButtonPreOrders.setPreferredSize(new java.awt.Dimension(90, 60));
        MainButtonPreOrders.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MainButtonPreOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainButtonPreOrdersActionPerformed(evt);
            }
        });
        MainToolbar.add(MainButtonPreOrders);

        MainButtonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/UI/Images/logout2.png"))); // NOI18N
        MainButtonLogout.setText("Log Out");
        MainButtonLogout.setFocusable(false);
        MainButtonLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MainButtonLogout.setMaximumSize(new java.awt.Dimension(90, 60));
        MainButtonLogout.setMinimumSize(new java.awt.Dimension(90, 60));
        MainButtonLogout.setPreferredSize(new java.awt.Dimension(90, 60));
        MainButtonLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MainButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainButtonLogoutActionPerformed(evt);
            }
        });
        MainToolbar.add(MainButtonLogout);

        MainTableItems.setAutoCreateRowSorter(true);
        MainTableItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Price", "Category", "Stock Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MainTableItems.setAutoscrolls(false);
        MainTableItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MainTableItemsMouseReleased(evt);
            }
        });
        MainTableItems.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MainTableItemsKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(MainTableItems);

        jMenu3.setText("File");
        MainMenuBar.add(jMenu3);

        jMenu4.setText("Edit");
        MainMenuBar.add(jMenu4);

        setJMenuBar(MainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainToolbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainButtonAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainButtonAddItemActionPerformed
        
        AddNewItemUI aniFrame = new AddNewItemUI();
       
        aniFrame.setVisible(true);
        
        LoginUI.uiLogic.ClearCheckQuery(MainTableItems, MainButtonPlaceOrder, MainButtonRemoveItem, productsList);
    }//GEN-LAST:event_MainButtonAddItemActionPerformed

    private void MainButtonRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainButtonRemoveItemActionPerformed

        String selectedItem = (String) getMainTableItems().getValueAt(getMainTableItems().getSelectedRow(), 0);
        
        LoginUI.controller.DeleteProduct(selectedItem);
        
        productsList = LoginUI.controller.getListOfProducts();
 
        LoginUI.uiLogic.ClearCheckQuery(MainTableItems, MainButtonPlaceOrder, MainButtonRemoveItem, productsList);
    }//GEN-LAST:event_MainButtonRemoveItemActionPerformed

    private void MainButtonPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainButtonPlaceOrderActionPerformed
       
        Product selectedItem;
        
        selectedItem = LoginUI.uiLogic.GetSelectedTableItem(getMainTableItems());
        
        int stock = (int) getMainTableItems().getValueAt(getMainTableItems().getSelectedRow(), 4);
        
        LoginUI.uiLogic.ClearCheckQuery(MainTableItems, MainButtonPlaceOrder, MainButtonRemoveItem, productsList);
        
        CreateAndLoadAddItemFrame(selectedItem, stock);
    }//GEN-LAST:event_MainButtonPlaceOrderActionPerformed

    private void MainButtonPreOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainButtonPreOrdersActionPerformed

        PreOrdersUI preOrdersFrame = new PreOrdersUI();
        
        preOrdersFrame.setVisible(true);
        
        LoginUI.uiLogic.ClearCheckQuery(MainTableItems, MainButtonPlaceOrder, MainButtonRemoveItem, productsList);
    }//GEN-LAST:event_MainButtonPreOrdersActionPerformed

    private void MainButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainButtonLogoutActionPerformed

        LoginUI.controller.SaveToDB();
        
        LoginUI loginFrame = new LoginUI();

        ShoppingCartUI.productsInCart = new ArrayList<>();
        
        loginFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_MainButtonLogoutActionPerformed
    
    private void MainTableItemsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainTableItemsMouseReleased
        
        LoginUI.uiLogic.CheckTableSelectionValidity(getMainTableItems(), MainButtonPlaceOrder, MainButtonRemoveItem);
        
        //System.out.println(MainTableItems.getSelectedRow());
    }//GEN-LAST:event_MainTableItemsMouseReleased

    private void MainButtonShoppingCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainButtonShoppingCartActionPerformed
        
        ShoppingCartUI cartFrame = new ShoppingCartUI();
        
        cartFrame.setVisible(true);
        
        LoginUI.uiLogic.ClearCheckQuery(MainTableItems, MainButtonPlaceOrder, MainButtonRemoveItem, productsList);
    }//GEN-LAST:event_MainButtonShoppingCartActionPerformed

    private void MainTableItemsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MainTableItemsKeyReleased
        
        LoginUI.uiLogic.CheckTableSelectionValidity(getMainTableItems(), MainButtonPlaceOrder, MainButtonRemoveItem);
    }//GEN-LAST:event_MainTableItemsKeyReleased

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        LoginUI.uiLogic.ClearCheckQuery(MainTableItems, MainButtonPlaceOrder, MainButtonRemoveItem, productsList);
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
       //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
       try {
            // Set cross-platform Java L&F (also called "Metal")
        UIManager.setLookAndFeel(
            UIManager.getCrossPlatformLookAndFeelClassName());
    } 
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
       // handle exception
    }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainButtonAddItem;
    private javax.swing.JButton MainButtonLogout;
    private javax.swing.JButton MainButtonPlaceOrder;
    private javax.swing.JButton MainButtonPreOrders;
    private javax.swing.JButton MainButtonRemoveItem;
    private javax.swing.JButton MainButtonShoppingCart;
    private javax.swing.JMenuBar MainMenuBar;
    private javax.swing.JTable MainTableItems;
    private javax.swing.JToolBar MainToolbar;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
 
    public void RenderAsAdmin()
    {
        MainToolbar.remove(MainButtonPlaceOrder);
        MainToolbar.remove(MainButtonPreOrders);
        MainToolbar.remove(MainButtonShoppingCart);
    }
    
    public void RenderAsUser()
    {
        MainToolbar.remove(MainButtonAddItem);
        MainToolbar.remove(MainButtonRemoveItem);
        MainToolbar.remove(MainButtonPreOrders);   
    }
    
    public void RenderAsOperator()
    {
        MainToolbar.remove(MainButtonAddItem);
        MainToolbar.remove(MainButtonRemoveItem);
    } 

    public void CreateAndLoadAddItemFrame(Product selectedItem, int stock)
    {
        PlacePreOrderUI placeOrderFrame = new PlacePreOrderUI();
        
        placeOrderFrame.setVisible(true);       

        placeOrderFrame.setNameText(String.copyValueOf(LoginUI.uiLogic.RemoveUnderline(selectedItem.getName())));
        placeOrderFrame.setDescriptionText(String.copyValueOf(LoginUI.uiLogic.RemoveUnderline(selectedItem.getDescription())));       
        placeOrderFrame.setPriceText(String.valueOf(selectedItem.getPrice()));       
        placeOrderFrame.setCategoryName(String.copyValueOf(LoginUI.uiLogic.RemoveUnderline(selectedItem.getCategory())));       
        placeOrderFrame.SetStockText(String.valueOf(stock));
    }

    public javax.swing.JTable getMainTableItems() {
        return MainTableItems;
    }
}