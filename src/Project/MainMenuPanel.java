/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import static Project.Border.LayeredPane1;
import static Project.Border.changeFunction;

/**
 *
 * @author Nirmith Akash
 */
public class MainMenuPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainMenuPanel
     */
    public MainMenuPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        HRMannagement = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ReceptionManagement = new javax.swing.JLabel();
        KitchenManagement = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TransactionManagement = new javax.swing.JLabel();
        DriverHomePage = new javax.swing.JLabel();
        InventoryBtn = new javax.swing.JLabel();
        borderline = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1360, 590));
        setMinimumSize(new java.awt.Dimension(1360, 590));
        setPreferredSize(new java.awt.Dimension(1360, 590));

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Dashboard.png"))); // NOI18N
        jPanel1.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 40));

        HRMannagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button-1.png"))); // NOI18N
        HRMannagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HRMannagementMouseClicked(evt);
            }
        });
        jPanel1.add(HRMannagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, 163));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button-3.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2barMouceClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 369, -1, -1));

        ReceptionManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button-7.png"))); // NOI18N
        ReceptionManagement.setPreferredSize(new java.awt.Dimension(100, 100));
        ReceptionManagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReceptionManagementMouseClicked(evt);
            }
        });
        jPanel1.add(ReceptionManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 152, 163));

        KitchenManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button-2.png"))); // NOI18N
        KitchenManagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KitchenManagementMouseClicked(evt);
            }
        });
        jPanel1.add(KitchenManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 160, -1, 163));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button-5.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5RoomManagementClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 368, -1, -1));

        TransactionManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button-4.png"))); // NOI18N
        TransactionManagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransactionManagementMouseClicked(evt);
            }
        });
        jPanel1.add(TransactionManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 160, -1, -1));

        DriverHomePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button.png"))); // NOI18N
        DriverHomePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DriverHomePageTransportMouseClicked(evt);
            }
        });
        jPanel1.add(DriverHomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, 177));

        InventoryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button-6.png"))); // NOI18N
        InventoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventoryBtnMouseClicked(evt);
            }
        });
        jPanel1.add(InventoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, 177));

        borderline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 2.png"))); // NOI18N
        jPanel1.add(borderline, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HRMannagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HRMannagementMouseClicked
        // TODO add your handling code here:
        HRHome h1 = new HRHome();
        this.setVisible(false);
        h1.setVisible(true);
    }//GEN-LAST:event_HRMannagementMouseClicked

    private void jLabel2barMouceClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2barMouceClicked
        // TODO add your handling code here:
        Billing b1 = new Billing();
        this.setVisible(false);
        b1.setVisible(true);

    }//GEN-LAST:event_jLabel2barMouceClicked

    private void ReceptionManagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReceptionManagementMouseClicked
        //Navigate to the Reception Management.
        changeFunction("Reception");
    }//GEN-LAST:event_ReceptionManagementMouseClicked

    private void KitchenManagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KitchenManagementMouseClicked
        //Naviagation to the Kitchen Management
        
        changeFunction("Kitchen");
        
//        Home h1 = new Home();
//        LayeredPane1.removeAll();
//        h1.setSize(LayeredPane1.getSize());
//        LayeredPane1.add(h1);
//        h1.setVisible(true);
//        LayeredPane1.moveToFront(h1);
//        System.out.println("Triggered");
        

    }//GEN-LAST:event_KitchenManagementMouseClicked

    private void jLabel5RoomManagementClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5RoomManagementClicked
        //Navigation to the Room Management.
        //Room r1 = new Room();
        //this.setVisible(false);
        //r1.setVisible(true);
        //changeFunction("Room");
        changeFunction("Room");
    }//GEN-LAST:event_jLabel5RoomManagementClicked

    private void TransactionManagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransactionManagementMouseClicked
        // TODO add your handling code here:
        /*Transaction t1 = new Transaction();
        this.setVisible(false);
        t1.setVisible(true);*/
        changeFunction("Transaction");
    }//GEN-LAST:event_TransactionManagementMouseClicked

    private void DriverHomePageTransportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DriverHomePageTransportMouseClicked
        changeFunction("Vehicle");
    }//GEN-LAST:event_DriverHomePageTransportMouseClicked

    private void InventoryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryBtnMouseClicked
        IDashBoard b1 = new IDashBoard();
        this.setVisible(false);
        b1.setVisible(true);
    }//GEN-LAST:event_InventoryBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DriverHomePage;
    private javax.swing.JLabel HRMannagement;
    private javax.swing.JLabel InventoryBtn;
    private javax.swing.JLabel KitchenManagement;
    private javax.swing.JLabel ReceptionManagement;
    private javax.swing.JLabel TransactionManagement;
    private javax.swing.JLabel borderline;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
