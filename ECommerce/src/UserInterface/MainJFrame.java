/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainJFrame.java
 *
 * Created on Sep 28, 2012, 11:21:25 PM
 */

package UserInterface;

import Business.Business;
import Business.ConfigureBusiness;

import Business.Organization.Organization;

import Business.UserAccount.UserAccount;

import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author praneet
 */
public class MainJFrame extends javax.swing.JFrame {
    
    private Business business;
//    private MasterOrderCatalog masterOrderCatalog;
//
//    private SupplierDirectory supplierDirectory;
//    private CustomerDirectory customerDirectory;
//    private UserAccountDirectory userAccountDirectory;
//    private MasterOrderCatalog moc;
    
    /** Creates new form MainJFrame */
    public MainJFrame() {
        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH);
        business = ConfigureBusiness.initialize();
//        masterOrderCatalog = business.getMasterOrderCatalog();
//        supplierDirectory = business.getSupplierDirectory();
//        customerDirectory = business.getCustomerDirectory();
//        userAccountDirectory = business.getUserAccountDirectory();
//        
//        moc = new MasterOrderCatalog();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        userProcessContainer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userNameJTxt = new javax.swing.JTextField();
        passwordPasswordField1 = new javax.swing.JPasswordField();
        loginJBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(150);

        userProcessContainer.setPreferredSize(new java.awt.Dimension(600, 400));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        jLabel2.setText("User Name");

        jLabel3.setText("Password");

        loginJBtn.setText("Login");
        loginJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(passwordPasswordField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameJTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(loginJBtn, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(62, 62, 62)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(loginJBtn)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJBtnActionPerformed
        // TODO add your handling code here:
        
        String username = userNameJTxt.getText();
        String password = String.valueOf(passwordPasswordField1.getPassword());
        
      boolean flag = true;
        
        UserAccount userAccount = null;
        for(Organization organization : business.getOrganizationDirectory().getOrganizationList()){
            
            userAccount = organization.getUserAccountDirectory().authenticate(username, password);
            
            if(userAccount != null)
            {
                CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                userProcessContainer.add("WorkArea",userAccount.getRole().createWorkArea(userProcessContainer, userAccount, organization, business));
                layout.next(userProcessContainer);
                flag = false;
                break;
            }
            
            
        }
         if (flag)
        {
            JOptionPane.showMessageDialog(null, "Please enter valid Username/Password");
            
        }
    }//GEN-LAST:event_loginJBtnActionPerformed

    
    /**
    * @param args the command line arguments
    */
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
                }
        
                

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJBtn;
    private javax.swing.JPasswordField passwordPasswordField1;
    private javax.swing.JTextField userNameJTxt;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables

}
