/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIPerpustakaan;

import ControllerPerpustakaan.ControllerApp;

/**
 *
 * @author User
 */
public class MenuHomeMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form MenuHome
     */
    ControllerApp ck;
    
    public MenuHomeMahasiswa(ControllerApp ck) {
        initComponents();
        this.ck = ck;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JLabel();
        ListSemuaBukuButton = new javax.swing.JButton();
        RekomendasiLabel = new javax.swing.JLabel();
        BukuRec1 = new javax.swing.JLabel();
        TahunTerbitBukuRec1 = new javax.swing.JLabel();
        AbstrakBukuRec1 = new javax.swing.JLabel();
        ViewBukuRec1 = new javax.swing.JButton();
        BukuRec2 = new javax.swing.JLabel();
        TahunTerbitBukuRec2 = new javax.swing.JLabel();
        AbstrakBukuRec2 = new javax.swing.JLabel();
        ViewBukuRec2 = new javax.swing.JButton();
        BukuRec3 = new javax.swing.JLabel();
        TahunTerbitBukuRec6 = new javax.swing.JLabel();
        AbstrakBukuRec6 = new javax.swing.JLabel();
        ViewBukuRec3 = new javax.swing.JButton();
        BukuRec4 = new javax.swing.JLabel();
        TahunTerbitBukuRec7 = new javax.swing.JLabel();
        AbstrakBukuRec7 = new javax.swing.JLabel();
        ViewBukuRec4 = new javax.swing.JButton();
        BukuRec5 = new javax.swing.JLabel();
        TahunTerbitBukuRec8 = new javax.swing.JLabel();
        AbstrakBukuRec8 = new javax.swing.JLabel();
        ViewBukuRec5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Header.setText("Perpustakaan Kampus");

        ListSemuaBukuButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListSemuaBukuButton.setText("List Semua Buku");
        ListSemuaBukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListSemuaBukuButtonActionPerformed(evt);
            }
        });

        RekomendasiLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RekomendasiLabel.setText("Rekomendasi Buku");

        BukuRec1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BukuRec1.setText("Buku 1");
        BukuRec1.setName(""); // NOI18N

        TahunTerbitBukuRec1.setText("Tahun Rilis Buku 1");

        AbstrakBukuRec1.setText("Abstrak Buku 1");
        AbstrakBukuRec1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ViewBukuRec1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ViewBukuRec1.setText("View");

        BukuRec2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BukuRec2.setText("Buku 2");
        BukuRec2.setName(""); // NOI18N

        TahunTerbitBukuRec2.setText("Tahun Rilis Buku 2");

        AbstrakBukuRec2.setText("Abstrak Buku 2");
        AbstrakBukuRec2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ViewBukuRec2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ViewBukuRec2.setText("View");

        BukuRec3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BukuRec3.setText("Buku 3");
        BukuRec3.setName(""); // NOI18N

        TahunTerbitBukuRec6.setText("Tahun Rilis Buku 3");

        AbstrakBukuRec6.setText("Abstrak Buku 3");
        AbstrakBukuRec6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ViewBukuRec3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ViewBukuRec3.setText("View");

        BukuRec4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BukuRec4.setText("Buku 4");
        BukuRec4.setName(""); // NOI18N

        TahunTerbitBukuRec7.setText("Tahun Rilis Buku 4");

        AbstrakBukuRec7.setText("Abstrak Buku 4");
        AbstrakBukuRec7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ViewBukuRec4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ViewBukuRec4.setText("View");

        BukuRec5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BukuRec5.setText("Buku 5");
        BukuRec5.setName(""); // NOI18N

        TahunTerbitBukuRec8.setText("Tahun Rilis Buku 5");

        AbstrakBukuRec8.setText("Abstrak Buku 5");
        AbstrakBukuRec8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ViewBukuRec5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ViewBukuRec5.setText("View");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 461, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RekomendasiLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TahunTerbitBukuRec1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AbstrakBukuRec1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BukuRec1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ViewBukuRec1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TahunTerbitBukuRec2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AbstrakBukuRec2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BukuRec2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ViewBukuRec2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TahunTerbitBukuRec6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AbstrakBukuRec6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BukuRec3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ViewBukuRec3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TahunTerbitBukuRec7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AbstrakBukuRec7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BukuRec4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ViewBukuRec4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TahunTerbitBukuRec8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AbstrakBukuRec8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BukuRec5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ViewBukuRec5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addComponent(ListSemuaBukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(223, 223, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RekomendasiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BukuRec1)
                .addGap(3, 3, 3)
                .addComponent(TahunTerbitBukuRec1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AbstrakBukuRec1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewBukuRec1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BukuRec2)
                        .addGap(3, 3, 3)
                        .addComponent(TahunTerbitBukuRec2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AbstrakBukuRec2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ViewBukuRec2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BukuRec3)
                        .addGap(19, 19, 19)
                        .addComponent(TahunTerbitBukuRec6))
                    .addComponent(ListSemuaBukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(AbstrakBukuRec6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewBukuRec3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BukuRec4)
                .addGap(20, 20, 20)
                .addComponent(TahunTerbitBukuRec7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AbstrakBukuRec7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewBukuRec4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BukuRec5)
                .addGap(3, 3, 3)
                .addComponent(TahunTerbitBukuRec8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AbstrakBukuRec8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewBukuRec5)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListSemuaBukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListSemuaBukuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListSemuaBukuButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuHome().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AbstrakBukuRec1;
    private javax.swing.JLabel AbstrakBukuRec2;
    private javax.swing.JLabel AbstrakBukuRec6;
    private javax.swing.JLabel AbstrakBukuRec7;
    private javax.swing.JLabel AbstrakBukuRec8;
    private javax.swing.JLabel BukuRec1;
    private javax.swing.JLabel BukuRec2;
    private javax.swing.JLabel BukuRec3;
    private javax.swing.JLabel BukuRec4;
    private javax.swing.JLabel BukuRec5;
    private javax.swing.JLabel Header;
    private javax.swing.JButton ListSemuaBukuButton;
    private javax.swing.JLabel RekomendasiLabel;
    private javax.swing.JLabel TahunTerbitBukuRec1;
    private javax.swing.JLabel TahunTerbitBukuRec2;
    private javax.swing.JLabel TahunTerbitBukuRec6;
    private javax.swing.JLabel TahunTerbitBukuRec7;
    private javax.swing.JLabel TahunTerbitBukuRec8;
    private javax.swing.JButton ViewBukuRec1;
    private javax.swing.JButton ViewBukuRec2;
    private javax.swing.JButton ViewBukuRec3;
    private javax.swing.JButton ViewBukuRec4;
    private javax.swing.JButton ViewBukuRec5;
    // End of variables declaration//GEN-END:variables
}
