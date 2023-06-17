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
public class MenuHome extends javax.swing.JFrame {

    /**
     * Creates new form MenuHome
     */
    private ControllerApp ck;
    
    public MenuHome() {
        initComponents();
        ck = new ControllerApp(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BukuRec1 = new javax.swing.JLabel();
        TahunTerbitBukuRec1 = new javax.swing.JLabel();
        AbstrakBukuRec1 = new javax.swing.JLabel();
        ViewBukuRec1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BukuRec2 = new javax.swing.JLabel();
        TahunTerbitBukuRec2 = new javax.swing.JLabel();
        AbstrakBukuRec2 = new javax.swing.JLabel();
        ViewBukuRec2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BukuRec3 = new javax.swing.JLabel();
        TahunTerbitBukuRec3 = new javax.swing.JLabel();
        AbstrakBukuRec3 = new javax.swing.JLabel();
        ViewBukuRec3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        BukuRec4 = new javax.swing.JLabel();
        TahunTerbitBukuRec4 = new javax.swing.JLabel();
        AbstrakBukuRec4 = new javax.swing.JLabel();
        ViewBukuRec4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        BukuRec5 = new javax.swing.JLabel();
        TahunTerbitBukuRec5 = new javax.swing.JLabel();
        AbstrakBukuRec5 = new javax.swing.JLabel();
        ViewBukuRec5 = new javax.swing.JButton();
        Header = new javax.swing.JLabel();
        RekomendasiLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        ListSemuaBukuButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BukuRec1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        BukuRec1.setText("Buku 1");
        BukuRec1.setName(""); // NOI18N

        TahunTerbitBukuRec1.setText("Tahun Rilis Buku 1");

        AbstrakBukuRec1.setText("Abstrak Buku 1");
        AbstrakBukuRec1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ViewBukuRec1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ViewBukuRec1.setText("View");
        ViewBukuRec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBukuRec1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TahunTerbitBukuRec1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ViewBukuRec1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BukuRec1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AbstrakBukuRec1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BukuRec1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TahunTerbitBukuRec1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AbstrakBukuRec1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewBukuRec1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BukuRec2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        BukuRec2.setText("Buku 2");
        BukuRec2.setName(""); // NOI18N

        TahunTerbitBukuRec2.setText("Tahun Rilis Buku 2");

        AbstrakBukuRec2.setText("Abstrak Buku 2");
        AbstrakBukuRec2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ViewBukuRec2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ViewBukuRec2.setText("View");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TahunTerbitBukuRec2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BukuRec2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AbstrakBukuRec2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ViewBukuRec2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(BukuRec2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TahunTerbitBukuRec2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AbstrakBukuRec2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewBukuRec2))
        );

        BukuRec3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        BukuRec3.setText("Buku 3");
        BukuRec3.setName(""); // NOI18N

        TahunTerbitBukuRec3.setText("Tahun Rilis Buku 3");

        AbstrakBukuRec3.setText("Abstrak Buku 3");
        AbstrakBukuRec3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ViewBukuRec3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ViewBukuRec3.setText("View");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TahunTerbitBukuRec3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ViewBukuRec3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BukuRec3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AbstrakBukuRec3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 73, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(BukuRec3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TahunTerbitBukuRec3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AbstrakBukuRec3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewBukuRec3))
        );

        BukuRec4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        BukuRec4.setText("Buku 4");
        BukuRec4.setName(""); // NOI18N

        TahunTerbitBukuRec4.setText("Tahun Rilis Buku 4");

        AbstrakBukuRec4.setText("Abstrak Buku 4");
        AbstrakBukuRec4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ViewBukuRec4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ViewBukuRec4.setText("View");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TahunTerbitBukuRec4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BukuRec4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AbstrakBukuRec4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ViewBukuRec4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(BukuRec4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TahunTerbitBukuRec4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AbstrakBukuRec4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewBukuRec4))
        );

        BukuRec5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        BukuRec5.setText("Buku 5");
        BukuRec5.setName(""); // NOI18N

        TahunTerbitBukuRec5.setText("Tahun Rilis Buku 5");

        AbstrakBukuRec5.setText("Abstrak Buku 5");
        AbstrakBukuRec5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ViewBukuRec5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ViewBukuRec5.setText("View");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TahunTerbitBukuRec5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BukuRec5, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AbstrakBukuRec5, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ViewBukuRec5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(BukuRec5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TahunTerbitBukuRec5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AbstrakBukuRec5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewBukuRec5))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        Header.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Header.setText("Perpustakaan Kampus");

        RekomendasiLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RekomendasiLabel.setText("Rekomendasi Buku");

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        ListSemuaBukuButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListSemuaBukuButton.setText("List Semua Buku");
        ListSemuaBukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListSemuaBukuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListSemuaBukuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListSemuaBukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RekomendasiLabel)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 750, Short.MAX_VALUE)
                    .addComponent(LoginButton)
                    .addGap(86, 86, 86)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RekomendasiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(LoginButton)
                    .addContainerGap(634, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListSemuaBukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListSemuaBukuButtonActionPerformed
        // TODO add your handling code here:
        ck.showListBookMenu();
    }//GEN-LAST:event_ListSemuaBukuButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        ck.showLoginMenu();
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void ViewBukuRec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBukuRec1ActionPerformed
        // TODO add your handling code here:
        ck.showRecommendedBookDetails(0);
    }//GEN-LAST:event_ViewBukuRec1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ck.showSearch();
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JLabel AbstrakBukuRec3;
    private javax.swing.JLabel AbstrakBukuRec4;
    private javax.swing.JLabel AbstrakBukuRec5;
    private javax.swing.JLabel BukuRec1;
    private javax.swing.JLabel BukuRec2;
    private javax.swing.JLabel BukuRec3;
    private javax.swing.JLabel BukuRec4;
    private javax.swing.JLabel BukuRec5;
    private javax.swing.JLabel Header;
    private javax.swing.JButton ListSemuaBukuButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel RekomendasiLabel;
    private javax.swing.JLabel TahunTerbitBukuRec1;
    private javax.swing.JLabel TahunTerbitBukuRec2;
    private javax.swing.JLabel TahunTerbitBukuRec3;
    private javax.swing.JLabel TahunTerbitBukuRec4;
    private javax.swing.JLabel TahunTerbitBukuRec5;
    private javax.swing.JButton ViewBukuRec1;
    private javax.swing.JButton ViewBukuRec2;
    private javax.swing.JButton ViewBukuRec3;
    private javax.swing.JButton ViewBukuRec4;
    private javax.swing.JButton ViewBukuRec5;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the ck
     */
    public ControllerApp getCk() {
        return ck;
    }

    /**
     * @return the AbstrakBukuRec1
     */
    public javax.swing.JLabel getAbstrakBukuRec1() {
        return AbstrakBukuRec1;
    }

    /**
     * @return the AbstrakBukuRec2
     */
    public javax.swing.JLabel getAbstrakBukuRec2() {
        return AbstrakBukuRec2;
    }

    /**
     * @return the AbstrakBukuRec3
     */
    public javax.swing.JLabel getAbstrakBukuRec3() {
        return AbstrakBukuRec3;
    }

    /**
     * @return the AbstrakBukuRec4
     */
    public javax.swing.JLabel getAbstrakBukuRec4() {
        return AbstrakBukuRec4;
    }

    /**
     * @return the AbstrakBukuRec5
     */
    public javax.swing.JLabel getAbstrakBukuRec5() {
        return AbstrakBukuRec5;
    }

    /**
     * @return the BukuRec1
     */
    public javax.swing.JLabel getBukuRec1() {
        return BukuRec1;
    }

    /**
     * @return the BukuRec2
     */
    public javax.swing.JLabel getBukuRec2() {
        return BukuRec2;
    }

    /**
     * @return the BukuRec3
     */
    public javax.swing.JLabel getBukuRec3() {
        return BukuRec3;
    }

    /**
     * @return the BukuRec4
     */
    public javax.swing.JLabel getBukuRec4() {
        return BukuRec4;
    }

    /**
     * @return the BukuRec5
     */
    public javax.swing.JLabel getBukuRec5() {
        return BukuRec5;
    }

    /**
     * @return the Header
     */
    public javax.swing.JLabel getHeader() {
        return Header;
    }

    /**
     * @return the ListSemuaBukuButton
     */
    public javax.swing.JButton getListSemuaBukuButton() {
        return ListSemuaBukuButton;
    }

    /**
     * @return the LoginButton
     */
    public javax.swing.JButton getLoginButton() {
        return LoginButton;
    }

    /**
     * @return the RekomendasiLabel
     */
    public javax.swing.JLabel getRekomendasiLabel() {
        return RekomendasiLabel;
    }

    /**
     * @return the TahunTerbitBukuRec1
     */
    public javax.swing.JLabel getTahunTerbitBukuRec1() {
        return TahunTerbitBukuRec1;
    }

    /**
     * @return the TahunTerbitBukuRec2
     */
    public javax.swing.JLabel getTahunTerbitBukuRec2() {
        return TahunTerbitBukuRec2;
    }

    /**
     * @return the TahunTerbitBukuRec3
     */
    public javax.swing.JLabel getTahunTerbitBukuRec3() {
        return TahunTerbitBukuRec3;
    }

    /**
     * @return the TahunTerbitBukuRec4
     */
    public javax.swing.JLabel getTahunTerbitBukuRec4() {
        return TahunTerbitBukuRec4;
    }

    /**
     * @return the TahunTerbitBukuRec5
     */
    public javax.swing.JLabel getTahunTerbitBukuRec5() {
        return TahunTerbitBukuRec5;
    }

    /**
     * @return the ViewBukuRec1
     */
    public javax.swing.JButton getViewBukuRec1() {
        return ViewBukuRec1;
    }

    /**
     * @return the ViewBukuRec2
     */
    public javax.swing.JButton getViewBukuRec2() {
        return ViewBukuRec2;
    }

    /**
     * @return the ViewBukuRec3
     */
    public javax.swing.JButton getViewBukuRec3() {
        return ViewBukuRec3;
    }

    /**
     * @return the ViewBukuRec4
     */
    public javax.swing.JButton getViewBukuRec4() {
        return ViewBukuRec4;
    }

    /**
     * @return the ViewBukuRec5
     */
    public javax.swing.JButton getViewBukuRec5() {
        return ViewBukuRec5;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @return the jPanel2
     */
    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }

    /**
     * @return the jPanel3
     */
    public javax.swing.JPanel getjPanel3() {
        return jPanel3;
    }

    /**
     * @return the jPanel4
     */
    public javax.swing.JPanel getjPanel4() {
        return jPanel4;
    }

    /**
     * @return the jPanel5
     */
    public javax.swing.JPanel getjPanel5() {
        return jPanel5;
    }

    /**
     * @return the jPanel6
     */
    public javax.swing.JPanel getjPanel6() {
        return jPanel6;
    }

    /**
     * @return the jPanel7
     */
    public javax.swing.JPanel getjPanel7() {
        return jPanel7;
    }

    /**
     * @return the jPanel8
     */
    public javax.swing.JPanel getjPanel8() {
        return jPanel8;
    }

    public javax.swing.JTextField getjTextField1() {
        return jTextField1;
    }
    
}
