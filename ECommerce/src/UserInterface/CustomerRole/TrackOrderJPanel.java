/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Business;
import Business.Order.Order;
import Business.Organization.Organization;
import Business.Organization.SalesOrganization;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderRequests;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkRequestResult;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.plaf.ComponentUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Praneet
 */
public class TrackOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplieEnrollRequest
     */
    JPanel userProcessContainer;
    Business business;
    WorkRequestResult request;
   
    UserAccount userAccount;
    public TrackOrderJPanel(JPanel upc, UserAccount ua, Business business) {
        initComponents();
        userProcessContainer = upc;
       this.business = business;
     //  this.supplier = supplier;
      this.userAccount = ua;
        populateRequestTable();
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshTestJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderStatusJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, -1, -1));

        orderStatusJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Order", "Order Date", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderStatusJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 640, 97));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 333, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed
 public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) orderStatusJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request :  userAccount.getWorkQueue().getWorkRequestList()){
            if (request instanceof OrderRequests){
            Object[] row = new Object[6];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            Order order= ((OrderRequests) request).getOrder();
            row[3] = order;
            row[4] = order.getTimeStamp();
            String result = ((OrderRequests) request).getTestResult();
            row[5] = result == null ? "Waiting" : result;
//            String date = request.getResolveDate();
//            row[6]= date == null ? "Waiting" : date;
          
            model.addRow(row);
            }
        }
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderStatusJTable;
    private javax.swing.JButton refreshTestJButton;
    // End of variables declaration//GEN-END:variables
}
