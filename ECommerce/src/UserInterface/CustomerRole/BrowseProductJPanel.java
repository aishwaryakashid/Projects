/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;


import Business.Business;
import Business.Person.PersonDirectory;
import Business.Order.MasterOrderCatalog;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.Organization;
import Business.Organization.SalesOrganization;
import Business.Organization.SupplierOrganization;
import Business.Person.Customer;
import Business.Person.Person;
import Business.Person.Supplier;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderRequests;

import java.awt.CardLayout;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Praneet
 */
public class BrowseProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BrowseProductJPanel
     */
    private JPanel userProcessContainer;
    private SupplierOrganization supplierOrg;
    // private Customer customer;
    Business business;
    UserAccount ua;
    private Customer customer;
    private boolean isCheckedOut = false;
    private Order order;
    MasterOrderCatalog masterOrderCatalog;
    PersonDirectory personDir;

    public BrowseProductJPanel(JPanel upc, SupplierOrganization org,Customer c,MasterOrderCatalog moc, PersonDirectory personDirectory, UserAccount ua, Business business) {
        initComponents();
        this.userProcessContainer = upc;
        this.personDir = personDirectory;
        this.supplierOrg = org;
        this.customer = c;
        supplierJCombo.removeAllItems();
        this.business = business;
        masterOrderCatalog = moc;
        this.ua = ua;
        for (Person supplier : personDirectory.getPersonList()) {
            supplierJCombo.addItem(supplier);
        }

        if (isCheckedOut == false) {
            order = new Order();
        }
        
        customerNameTxt.setText(customer.getFirstName());
        populateProductTable();
    }

    public void populateProductTable() {

        int rowCount = productJTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel) productJTable.getModel();

        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }

        Supplier supplier = (Supplier)supplierJCombo.getSelectedItem();

        if (supplier == null) {
            return;
        }

        for (Product product : supplier.getProductCatalog().getProductCatalog()) {
            Object row[] = new Object[4];
            row[0] = product;
            row[1] = product.getModelNumber();
            row[2] = product.getPrice();
            row[3] = product.getAvailability();
            dtm.addRow(row);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void populateOrderItemTable()
    {
        int rowCount = orderJTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)orderJTable.getModel();
        for(int i = rowCount -1; i>=0; i--)
        {
            dtm.removeRow(i);
        }
        
        for(OrderItem orderItem : order.getOrderItemList())
        {
            Object row[] = new Object[4];
            row[0] = orderItem;
            row[1] = orderItem.getProduct();
            row[2] = orderItem.getQuantity();
            row[3] = orderItem.getSalesPrice()*orderItem.getQuantity();
            dtm.addRow(row);
                    
                    }
        
    }
    
    public void populateProductTable(String productName)
    {
       int rowCount = productJTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)productJTable.getModel();
        for(int i = rowCount -1; i>=0; i--)
        {
            dtm.removeRow(i);
        }
       for(Person supplier : personDir.getPersonList())
       {
          for (Product product: ((Supplier)supplier).getProductCatalog().getProductCatalog())
          {
              if(product.getProdName().equals(productName))
              {
                  Object row[] = new Object[4];
                  row[0] = product;
                  row[1] = product.getModelNumber();
                  row[2]= product.getPrice();
                  row[3] = product.getAvailability();
                  dtm.addRow(row);
              }
          }
           
       }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        supplierJCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        productJTable = new javax.swing.JTable();
        viewProdDetailsJBtn = new javax.swing.JButton();
        quantityJSpinner = new javax.swing.JSpinner();
        addCartJBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        viewItemJBtn = new javax.swing.JButton();
        modifyJBtn = new javax.swing.JButton();
        newQuantityTxt = new javax.swing.JTextField();
        checkOutJBtn = new javax.swing.JButton();
        removeJBtn = new javax.swing.JButton();
        backJBtn = new javax.swing.JButton();
        refreshJBtn = new javax.swing.JButton();
        searchTxt = new javax.swing.JTextField();
        searchJBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customerNameTxt = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Welcome to Easy Buy");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 20, 127, 28));

        jLabel2.setText("Supplier");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        supplierJCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        supplierJCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierJComboActionPerformed(evt);
            }
        });
        add(supplierJCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, -1, -1));

        productJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID", "Price", "Availabilty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 138, 375, 112));

        viewProdDetailsJBtn.setText("View Product Details");
        viewProdDetailsJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProdDetailsJBtnActionPerformed(evt);
            }
        });
        add(viewProdDetailsJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 261, -1, -1));
        add(quantityJSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 262, -1, -1));

        addCartJBtn.setText("Add to Cart");
        addCartJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCartJBtnActionPerformed(evt);
            }
        });
        add(addCartJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 261, -1, -1));

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(orderJTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 375, 91));

        viewItemJBtn.setText("View Item");
        viewItemJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemJBtnActionPerformed(evt);
            }
        });
        add(viewItemJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 392, -1, -1));

        modifyJBtn.setText("Modify Quantity");
        modifyJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyJBtnActionPerformed(evt);
            }
        });
        add(modifyJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 392, -1, -1));

        newQuantityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newQuantityTxtActionPerformed(evt);
            }
        });
        add(newQuantityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 393, 62, -1));

        checkOutJBtn.setText("Check Out");
        checkOutJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutJBtnActionPerformed(evt);
            }
        });
        add(checkOutJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 392, -1, -1));

        removeJBtn.setText("Remove");
        removeJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeJBtnActionPerformed(evt);
            }
        });
        add(removeJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 392, -1, -1));

        backJBtn.setText("<<Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });
        add(backJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 469, -1, -1));

        refreshJBtn.setText("Refresh");
        refreshJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJBtnActionPerformed(evt);
            }
        });
        add(refreshJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 469, -1, -1));

        searchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtActionPerformed(evt);
            }
        });
        add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 67, 77, -1));

        searchJBtn.setText("Search");
        searchJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJBtnActionPerformed(evt);
            }
        });
        add(searchJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 66, -1, -1));

        jLabel3.setText("Hello");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 27, -1, -1));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 20, -1, -1));

        customerNameTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customerNameTxt.setForeground(new java.awt.Color(0, 0, 102));
        customerNameTxt.setEnabled(false);
        customerNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameTxtActionPerformed(evt);
            }
        });
        add(customerNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 21, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addCartJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartJBtnActionPerformed
        // TODO add your handling code here:
         int selectedRow = productJTable.getSelectedRow();
         if (selectedRow < 0)
         {
             JOptionPane.showMessageDialog(null,"Please select a row to contine");
             return;
         }
         
         Product product = (Product)productJTable.getValueAt(selectedRow, 0);
         int quantity = (Integer)quantityJSpinner.getValue();
         if(quantity <= 0 || quantity > product.getAvailability())
         {
             JOptionPane.showMessageDialog(null, "Something wrong with Quantity");
             return;
         }
         boolean quantityFlag = true;
         ArrayList<OrderItem> orderItems = order.getOrderItemList();
         for (OrderItem orderItem : orderItems)
         {
             if (orderItem.getProduct().equals(product))
                     {
             int oldQuantity = orderItem.getQuantity();
             int newQuantity = quantity + oldQuantity;
             orderItem.setQuantity(newQuantity);
             quantityFlag = false;
         }
                  
         }
         if (quantityFlag)
         {
              Date date = new Date();
    Timestamp timeStamp = new Timestamp(date.getTime());
             OrderItem orderItem = order.addOrderItem(product, quantity, product.getPrice(), timeStamp);
         }
         
         String message = String.valueOf(quantity)+" "+product.getProdName()+" "+"is added to the cart";
         JOptionPane.showMessageDialog(null, message);
         
         product.setAvailability(product.getAvailability() - quantity);
      // populateProductTable();
         populateOrderItemTable();
    }//GEN-LAST:event_addCartJBtnActionPerformed

    private void modifyJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyJBtnActionPerformed
        // TODO add your handling code here:
       
        
        int selectedRow = orderJTable.getSelectedRow();
        
        if(selectedRow <0)
        {
           JOptionPane.showMessageDialog(null, "Please insert new quantity");
            return;
        }
        
        
        OrderItem orderItem = (OrderItem)orderJTable.getValueAt(selectedRow, 0);
        int oldQuantity = orderItem.getQuantity();
        int newQuantity;
        try{
         newQuantity = Integer.parseInt(newQuantityTxt.getText());
        }
        
        catch(NumberFormatException num)
        {
            JOptionPane.showMessageDialog(null, "please enter numeric value");
            return;
        }
               int oldAvailability = orderItem.getProduct().getAvailability();
                if(newQuantity<0 || newQuantity>oldQuantity+oldAvailability)
                {
                    JOptionPane.showMessageDialog(null, "please enter a valid quantity");
                    return;
                }
        else
                {
                orderItem.setQuantity(newQuantity);
                JOptionPane.showMessageDialog(null, "The quantity pf the "+orderItem+" is changed to "+orderItem.getQuantity()+"");
                int originalAvailability = oldQuantity + oldAvailability;
                orderItem.getProduct().setAvailability(originalAvailability - newQuantity);
                
                populateOrderItemTable();
                populateProductTable();
                
                }
    }//GEN-LAST:event_modifyJBtnActionPerformed

    private void newQuantityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newQuantityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newQuantityTxtActionPerformed

    private void checkOutJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutJBtnActionPerformed
        // TODO ad your handling code here:
        Date date = new Date();
    Timestamp timeStamp = new Timestamp(date.getTime());
        order.setTimeStamp(timeStamp);
        if(order != null && order.getOrderItemList().size() >0)
        {
          Order addedOrder = masterOrderCatalog.addOrder(order);
          order.setCustomer(customer);
            OrderRequests or = new OrderRequests();
            or.setOrder(order);
            or.setStatus("pending");
            or.setSender(ua);
            or.setMessage("Ordered");
           Organization org = null;
        for (Organization organization : business.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof SalesOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(or);
            ua.getWorkQueue().getWorkRequestList().add(or);
        }
        if(addedOrder ==null)
        {
            JOptionPane.showMessageDialog(null,"No order Placed");
            return;
                            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The orderhas been placed successfully");
        }  
        }
        
        
        
        isCheckedOut = true;
        order =new Order();
       
        populateOrderItemTable();
        populateProductTable();
        
    }//GEN-LAST:event_checkOutJBtnActionPerformed

    private void removeJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeJBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderJTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "select a row to remove");
            
        }
        else
        {
            OrderItem orderItem = (OrderItem)orderJTable.getValueAt(selectedRow, 0);
        int orderItemQuantity = orderItem.getQuantity();
        int oldAvailability = orderItem.getProduct().getAvailability();
        int newQuantity = orderItemQuantity+oldAvailability;
        orderItem.getProduct().setAvailability(newQuantity);
        
        order.removeOrderItem(orderItem);
        
        JOptionPane.showMessageDialog(null,"Order Item Removed from the cart");
        populateOrderItemTable();
        populateProductTable();
        
        }
    }//GEN-LAST:event_removeJBtnActionPerformed

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
        if(isCheckedOut == false)
            for(OrderItem orderItem : order.getOrderItemList())
            {
                Product product = orderItem.getProduct();
                int oldAvailability = product.getAvailability();
                int orderItemQuantity = orderItem.getQuantity();
                int newQuantity = oldAvailability+orderItemQuantity;
                product.setAvailability(newQuantity);
                 JOptionPane.showMessageDialog(null,"Your order has not checked out");
            }
            
        else
        {
           
         JOptionPane.showMessageDialog(null,"Your order is checked out");
        }
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJBtnActionPerformed

    private void refreshJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJBtnActionPerformed
        // TODO add your handling code here:
        populateOrderItemTable();
        
    }//GEN-LAST:event_refreshJBtnActionPerformed

    private void searchJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJBtnActionPerformed
        // TODO add your handling code here:
        
        
       String productName= searchTxt.getText();
       if (productName.length() == 0 | productName == null )
        {
        JOptionPane.showMessageDialog(null,"Please enter a valid PatientID");
        }
        
       else{
           
          try
            {
        populateProductTable(productName);
            }
          catch(NullPointerException nu)
            {
                JOptionPane.showMessageDialog(null,"Please insert valid Product Name","Error",JOptionPane.ERROR_MESSAGE);
            }
       }
    }//GEN-LAST:event_searchJBtnActionPerformed

    private void viewProdDetailsJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProdDetailsJBtnActionPerformed
        // TODO add your handling code here:
                 
        int selectedRow = productJTable.getSelectedRow();
        
         if(selectedRow <0)
        {
            JOptionPane.showMessageDialog(null, "Please Select a row to continue");
            return;
        }
        
        Product product = (Product)productJTable.getValueAt(selectedRow, 0);

        ViewProductJPanel viewpd = new ViewProductJPanel(userProcessContainer,product);
        userProcessContainer.add("ViewProduct",viewpd);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewProdDetailsJBtnActionPerformed

    private void supplierJComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierJComboActionPerformed
        // TODO add your handling code here:
        populateProductTable();
    }//GEN-LAST:event_supplierJComboActionPerformed

    private void viewItemJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItemJBtnActionPerformed
        // TODO add your handling code here:
         int selectedRow = orderJTable.getSelectedRow();
        
        if(selectedRow <0)
        {
            JOptionPane.showMessageDialog(null, "Please Select a row to continue");
            return;
        }
        
        
        OrderItem orderItem = (OrderItem)orderJTable.getValueAt(selectedRow, 0);
        
        ViewOrderItemJPanel viewoij = new ViewOrderItemJPanel(userProcessContainer, orderItem);
        userProcessContainer.add("ViewProductJPanel",viewoij);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewItemJBtnActionPerformed

    private void searchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtActionPerformed

    private void customerNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartJBtn;
    private javax.swing.JButton backJBtn;
    private javax.swing.JButton checkOutJBtn;
    private javax.swing.JTextField customerNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modifyJBtn;
    private javax.swing.JTextField newQuantityTxt;
    private javax.swing.JTable orderJTable;
    private javax.swing.JTable productJTable;
    private javax.swing.JSpinner quantityJSpinner;
    private javax.swing.JButton refreshJBtn;
    private javax.swing.JButton removeJBtn;
    private javax.swing.JButton searchJBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JComboBox supplierJCombo;
    private javax.swing.JButton viewItemJBtn;
    private javax.swing.JButton viewProdDetailsJBtn;
    // End of variables declaration//GEN-END:variables
}
