/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author 898557
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        //setSize(Toolkit.getDefaultToolkit().getScreenSize());
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
        jPanel2 = new javax.swing.JPanel();
        btm1 = new javax.swing.JPanel();
        lbCliente = new javax.swing.JLabel();
        ind1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btm2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ind2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btm3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ind3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btm4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        ind4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btm5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        ind5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        boderUsuario1 = new gui.boderUsuario();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        boderUsuario4 = new gui.boderUsuario();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        boderUsuario2 = new gui.boderUsuario();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        boderUsuario3 = new gui.boderUsuario();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btm1.setBackground(new java.awt.Color(102, 0, 102));
        btm1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btm1MousePressed(evt);
            }
        });

        lbCliente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbCliente.setForeground(new java.awt.Color(255, 255, 255));
        lbCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCliente.setText("Registro de Cliente");
        lbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbClienteMouseClicked(evt);
            }
        });

        ind1.setBackground(new java.awt.Color(255, 255, 255));
        ind1.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout ind1Layout = new javax.swing.GroupLayout(ind1);
        ind1.setLayout(ind1Layout);
        ind1Layout.setHorizontalGroup(
            ind1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        ind1Layout.setVerticalGroup(
            ind1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\898557\\Desktop\\Icones\\pequeno.png")); // NOI18N

        javax.swing.GroupLayout btm1Layout = new javax.swing.GroupLayout(btm1);
        btm1.setLayout(btm1Layout);
        btm1Layout.setHorizontalGroup(
            btm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btm1Layout.createSequentialGroup()
                .addComponent(ind1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(lbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btm1Layout.setVerticalGroup(
            btm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btm1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(29, 29, 29))
            .addGroup(btm1Layout.createSequentialGroup()
                .addComponent(lbCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(btm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 220, 50));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\898557\\Desktop\\Icones\\Vermelho.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        btm2.setBackground(new java.awt.Color(102, 0, 102));
        btm2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btm2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btm2MousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Produtos");

        ind2.setBackground(new java.awt.Color(255, 255, 255));
        ind2.setOpaque(false);
        ind2.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout ind2Layout = new javax.swing.GroupLayout(ind2);
        ind2.setLayout(ind2Layout);
        ind2Layout.setHorizontalGroup(
            ind2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        ind2Layout.setVerticalGroup(
            ind2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\898557\\Desktop\\Icones\\remedio.png")); // NOI18N

        javax.swing.GroupLayout btm2Layout = new javax.swing.GroupLayout(btm2);
        btm2.setLayout(btm2Layout);
        btm2Layout.setHorizontalGroup(
            btm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btm2Layout.createSequentialGroup()
                .addComponent(ind2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(41, 41, 41)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
        );
        btm2Layout.setVerticalGroup(
            btm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btm2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(29, 29, 29))
            .addGroup(btm2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(btm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 220, 50));

        btm3.setBackground(new java.awt.Color(102, 0, 102));
        btm3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btm3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btm3MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Caixas");

        ind3.setBackground(new java.awt.Color(255, 255, 255));
        ind3.setOpaque(false);
        ind3.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout ind3Layout = new javax.swing.GroupLayout(ind3);
        ind3.setLayout(ind3Layout);
        ind3Layout.setHorizontalGroup(
            ind3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        ind3Layout.setVerticalGroup(
            ind3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\898557\\Desktop\\Icones\\dinheiro.png")); // NOI18N

        javax.swing.GroupLayout btm3Layout = new javax.swing.GroupLayout(btm3);
        btm3.setLayout(btm3Layout);
        btm3Layout.setHorizontalGroup(
            btm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btm3Layout.createSequentialGroup()
                .addComponent(ind3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(41, 41, 41)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
        );
        btm3Layout.setVerticalGroup(
            btm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btm3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(29, 29, 29))
            .addGroup(btm3Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(btm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, 50));

        btm4.setBackground(new java.awt.Color(102, 0, 102));
        btm4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btm4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btm4MousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cadastro");

        ind4.setBackground(new java.awt.Color(255, 255, 255));
        ind4.setOpaque(false);
        ind4.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout ind4Layout = new javax.swing.GroupLayout(ind4);
        ind4.setLayout(ind4Layout);
        ind4Layout.setHorizontalGroup(
            ind4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        ind4Layout.setVerticalGroup(
            ind4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\898557\\Desktop\\Icones\\cadastro.png")); // NOI18N

        javax.swing.GroupLayout btm4Layout = new javax.swing.GroupLayout(btm4);
        btm4.setLayout(btm4Layout);
        btm4Layout.setHorizontalGroup(
            btm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btm4Layout.createSequentialGroup()
                .addComponent(ind4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(41, 41, 41)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
        );
        btm4Layout.setVerticalGroup(
            btm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btm4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(29, 29, 29))
            .addGroup(btm4Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(btm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 220, 50));

        btm5.setBackground(new java.awt.Color(102, 0, 102));
        btm5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btm5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btm5MousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Estoque");

        ind5.setBackground(new java.awt.Color(255, 255, 255));
        ind5.setOpaque(false);
        ind5.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout ind5Layout = new javax.swing.GroupLayout(ind5);
        ind5.setLayout(ind5Layout);
        ind5Layout.setHorizontalGroup(
            ind5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        ind5Layout.setVerticalGroup(
            ind5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\898557\\Desktop\\Icones\\estoque.png")); // NOI18N

        javax.swing.GroupLayout btm5Layout = new javax.swing.GroupLayout(btm5);
        btm5.setLayout(btm5Layout);
        btm5Layout.setHorizontalGroup(
            btm5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btm5Layout.createSequentialGroup()
                .addComponent(ind5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(41, 41, 41)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
        );
        btm5Layout.setVerticalGroup(
            btm5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btm5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(29, 29, 29))
            .addGroup(btm5Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(btm5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 220, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 590));

        boderUsuario1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes");
        boderUsuario1.add(jLabel1);
        jLabel1.setBounds(0, 0, 210, 190);

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\898557\\Desktop\\Icones\\Osvaldo.png")); // NOI18N
        boderUsuario1.add(jLabel15);
        jLabel15.setBounds(90, 90, 160, 80);

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\898557\\Desktop\\Icones\\Osvaldo.png")); // NOI18N
        boderUsuario1.add(jLabel16);
        jLabel16.setBounds(130, 130, 120, 80);

        boderUsuario4.setBackground(new java.awt.Color(255, 153, 51));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Clientes");
        boderUsuario4.add(jLabel20);
        jLabel20.setBounds(10, 70, 110, 30);

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\898557\\Desktop\\Icones\\Osvaldo.png")); // NOI18N
        boderUsuario4.add(jLabel21);
        jLabel21.setBounds(90, 90, 160, 80);

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\898557\\Desktop\\Icones\\Osvaldo.png")); // NOI18N
        boderUsuario4.add(jLabel22);
        jLabel22.setBounds(130, 130, 120, 80);

        boderUsuario1.add(boderUsuario4);
        boderUsuario4.setBounds(0, 0, 0, 0);

        jPanel1.add(boderUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 210, 190));

        boderUsuario2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Produto");
        boderUsuario2.add(jLabel17);
        jLabel17.setBounds(0, -1, 200, 190);

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\898557\\Desktop\\Icones\\Osvaldo.png")); // NOI18N
        boderUsuario2.add(jLabel18);
        jLabel18.setBounds(90, 90, 120, 80);

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\898557\\Desktop\\Icones\\Osvaldo.png")); // NOI18N
        boderUsuario2.add(jLabel19);
        jLabel19.setBounds(130, 120, 160, 80);

        jPanel1.add(boderUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 200, 190));

        boderUsuario3.setBackground(new java.awt.Color(255, 51, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Caixas");
        boderUsuario3.add(jLabel2);
        jLabel2.setBounds(0, -1, 200, 190);

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\898557\\Desktop\\Icones\\Osvaldo.png")); // NOI18N
        boderUsuario3.add(jLabel14);
        jLabel14.setBounds(90, 90, 120, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\898557\\Desktop\\Icones\\Osvaldo.png")); // NOI18N
        boderUsuario3.add(jLabel4);
        jLabel4.setBounds(130, 120, 160, 80);

        jPanel1.add(boderUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 200, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btm5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btm5MousePressed
        setColor(btm5);
        ind5.setOpaque(true);
        resetColor(new JPanel[]{btm1, btm2, btm3, btm4}, new JPanel[]{ind1, ind2, ind3, ind4});
    }//GEN-LAST:event_btm5MousePressed

    private void btm4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btm4MousePressed
        setColor(btm4);
        ind4.setOpaque(true);
        resetColor(new JPanel[]{btm1, btm2, btm3, btm5}, new JPanel[]{ind1, ind2, ind3, ind5});
    }//GEN-LAST:event_btm4MousePressed

    private void btm3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btm3MousePressed
        setColor(btm3);
        ind3.setOpaque(true);
        resetColor(new JPanel[]{btm1, btm2, btm4, btm5}, new JPanel[]{ind1, ind2, ind4, ind5});
    }//GEN-LAST:event_btm3MousePressed

    private void btm2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btm2MousePressed
        setColor(btm2);
        ind2.setOpaque(true);
        resetColor(new JPanel[]{btm1, btm3, btm4, btm5}, new JPanel[]{ind1, ind3, ind4, ind5});
    }//GEN-LAST:event_btm2MousePressed

    private void btm1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btm1MousePressed
        setColor(btm1);
        ind1.setOpaque(true);
        resetColor(new JPanel[]{btm2, btm3, btm4, btm5}, new JPanel[]{ind2, ind3, ind4, ind5});
    }//GEN-LAST:event_btm1MousePressed

    private void lbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbClienteMouseClicked
        ClienteGUI rgb = new ClienteGUI();
        rgb.setVisible(true);
    }//GEN-LAST:event_lbClienteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    private void setColor(JPanel pane) {
        pane.setBackground(new Color(102, 0, 102));
    }

    private void resetColor(JPanel[] pane, JPanel[] indicators) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(23, 35, 51));
        }
        for (int i = 0; i < indicators.length; i++) {
            indicators[i].setOpaque(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.boderUsuario boderUsuario1;
    private gui.boderUsuario boderUsuario2;
    private gui.boderUsuario boderUsuario3;
    private gui.boderUsuario boderUsuario4;
    private javax.swing.JPanel btm1;
    private javax.swing.JPanel btm2;
    private javax.swing.JPanel btm3;
    private javax.swing.JPanel btm4;
    private javax.swing.JPanel btm5;
    private javax.swing.JPanel ind1;
    private javax.swing.JPanel ind2;
    private javax.swing.JPanel ind3;
    private javax.swing.JPanel ind4;
    private javax.swing.JPanel ind5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCliente;
    // End of variables declaration//GEN-END:variables
}
