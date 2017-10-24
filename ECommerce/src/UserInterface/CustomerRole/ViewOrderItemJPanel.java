/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Order.OrderItem;
import Business.Product.Product;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Praneet
 */
public class ViewOrderItemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrderItemJPanel
     */
    private JPanel userProcessContainer;
    private OrderItem orderItem;
    public ViewOrderItemJPanel(JPanel upc, OrderItem orderItem) {
        initComponents();
        this.userProcessContainer = upc;
        this.orderItem = orderItem;
        
        productNameJTxt.setText(orderItem.getProduct().getProdName());
               
      int productID = orderItem.getProduct().getModelNumber();
      productIdTxt.setText(String.valueOf(productID));
      
      int price = orderItem.getProduct().getPrice()*orderItem.getQuantity();
     priceTxt.setText(String.valueOf(price));
     
     int quantity = orderItem.getQuantity();
     quantityTxt.setText(String.valueOf(quantity));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        productNameJTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        productIdTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        quantityTxt = new javax.swing.JTextField();
        backJBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("View Order Item");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 11, 121, -1));

        jLabel2.setText("Product Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 46, 80, -1));
        add(productNameJTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 43, 129, -1));

        jLabel3.setText("Product ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 95, -1, -1));
        add(productIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 92, 129, -1));

        jLabel4.setText("Total Price");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 133, 51, -1));
        add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 130, 132, -1));

        jLabel5.setText("Quantity");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 171, -1, -1));
        add(quantityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 168, 132, -1));

        backJBtn.setText("<<Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });
        add(backJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 223, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTextField productIdTxt;
    private javax.swing.JTextField productNameJTxt;
    private javax.swing.JTextField quantityTxt;
    // End of variables declaration//GEN-END:variables
}
