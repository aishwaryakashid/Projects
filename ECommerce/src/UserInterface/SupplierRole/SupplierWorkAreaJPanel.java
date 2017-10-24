/*
 * ProductManagerWorkAreaJPanel.java
 *
 * Created on October 3, 2008, 8:06 AM
 */
package UserInterface.SupplierRole;

import Business.Business;
import Business.Person.Person;
import Business.Person.Supplier;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkRequestResult;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rushabh
 */
public class SupplierWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    Supplier supplier;
    UserAccount userAccount;
 //  Person supplier;
    
//    MasterOrderCatalog masterOrderCatalog;
    
    /** Creates new form ProductManagerWorkAreaJPanel */
    public SupplierWorkAreaJPanel(JPanel upc, Business business, Supplier supplier, UserAccount ua) {

        initComponents();
       this.userProcessContainer = upc;
       this.business = business;
       this.supplier = supplier;
      this.userAccount = ua;
//       masterOrderCatalog = moc;
       
     for(WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()){
         String result = ((WorkRequestResult) wr).getTestResult();
         if(result == null)
         {
             break;
         }
         
   if(result.equals("Approve"))
       {
      managePButton.setEnabled(true);
      reportButton4.setEnabled(true);
       }
   
    }
    }
   

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        managePButton = new javax.swing.JButton();
        enrollmentRequest = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        reportButton4 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area (Product Manager Role)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        managePButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managePButton.setText("Manage Product Catalog >>");
        managePButton.setEnabled(false);
        managePButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePButtonActionPerformed(evt);
            }
        });
        add(managePButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        enrollmentRequest.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enrollmentRequest.setText("Enrollment Request>>");
        enrollmentRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollmentRequestActionPerformed(evt);
            }
        });
        add(enrollmentRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 260, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Manage Staff");
        jButton3.setEnabled(false);
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        reportButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reportButton4.setText("Review Product Performance >>");
        reportButton4.setEnabled(false);
        reportButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButton4ActionPerformed(evt);
            }
        });
        add(reportButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Update Personal Profile >>");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 260, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void managePButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePButtonActionPerformed
        // TODO add your handling code here:
       // Supplier sipplier = (Supplier)userAccount.getPerson();
       ManageProductCatalogJPanel mpcjp = new ManageProductCatalogJPanel(userProcessContainer, supplier);
        userProcessContainer.add("ManageProductCatalogJPanel",mpcjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePButtonActionPerformed

    private void reportButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButton4ActionPerformed
        // TODO add your handling code here:
        PreviewSales previews = new PreviewSales(userProcessContainer, supplier.getProductCatalog());
        userProcessContainer.add("PreviewSales", previews); 
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_reportButton4ActionPerformed

    private void enrollmentRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollmentRequestActionPerformed
        // TODO add your handling code here:
        SupplieEnrollRequest srequest = new SupplieEnrollRequest(userProcessContainer, userAccount, business);
        userProcessContainer.add("SupplierSubmitRequest", srequest); 
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_enrollmentRequestActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enrollmentRequest;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managePButton;
    private javax.swing.JButton reportButton4;
    // End of variables declaration//GEN-END:variables
}