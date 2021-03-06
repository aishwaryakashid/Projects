/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package UserInterface.AdminstrativeRole;

import Business.Business;
import Business.Organization.Organization;
import Business.Person.PersonDirectory;

import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  Rushabh
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
 private Business business;
 Organization organization;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(Business business, JPanel upc) {
        initComponents();
        userProcessContainer = upc;
     // this.organization = organization;
      this.business = business;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageUserAccountJBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        manageOrganizationBtn = new javax.swing.JButton();
        managePersonBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageUserAccountJBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageUserAccountJBtn.setText("Manage User Account >>");
        manageUserAccountJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountJBtnActionPerformed(evt);
            }
        });
        add(manageUserAccountJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 260, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Aminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        manageOrganizationBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageOrganizationBtn.setText("Manage Organization >>");
        manageOrganizationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationBtnActionPerformed(evt);
            }
        });
        add(manageOrganizationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 260, -1));

        managePersonBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managePersonBtn.setText("Manage Person/Employee >>");
        managePersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePersonBtnActionPerformed(evt);
            }
        });
        add(managePersonBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserAccountJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountJBtnActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel managua  = new ManageUserAccountJPanel(userProcessContainer, business);
        userProcessContainer.add("ManageSupplierAdministrative", managua);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserAccountJBtnActionPerformed

    private void manageOrganizationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationBtnActionPerformed
        // TODO add your handling code here:
         ManageOrganizationJPanel orgpanel = new ManageOrganizationJPanel(userProcessContainer, business.getOrganizationDirectory());
        userProcessContainer.add("ManageOrganizationAdministrative", orgpanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationBtnActionPerformed

    private void managePersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePersonBtnActionPerformed
        // TODO add your handling code here:
        
          ManagePerson managep = new ManagePerson(userProcessContainer,business.getOrganizationDirectory());
        userProcessContainer.add("ManageSupplierAdministrative", managep);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePersonBtnActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageOrganizationBtn;
    private javax.swing.JButton managePersonBtn;
    private javax.swing.JButton manageUserAccountJBtn;
    // End of variables declaration//GEN-END:variables
    
}
