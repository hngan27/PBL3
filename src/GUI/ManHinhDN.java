/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.*;
import DTO.UserDTO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class ManHinhDN extends javax.swing.JFrame {
    static ManHinhDN dn = new ManHinhDN();
    public static DKTaiKhoan dk ;
    public static String username;
    public static String password;
    public static UserDTO user = new UserDTO();
    public ManHinhDN() {

        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelChinh = new javax.swing.JPanel()
        {
            public void paintComponent(Graphics g)
            {
                ImageIcon im = new ImageIcon("F:\\Downloads\\pbl3_1111\\pbl3_final\\PBL3Riu\\PBL3Riu\\AnhDN.jpg");
                Image i = im.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height,this);
            }
        }
        ;
        PanelDN = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        chckshow = new javax.swing.JCheckBox();
        PnSignup = new javax.swing.JPanel();
        lbNoti = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        LbSignup = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(275, 75, 800, 533));
        setMinimumSize(new java.awt.Dimension(800, 533));
        setSize(new java.awt.Dimension(0, 0));

        PanelChinh.setBackground(new java.awt.Color(255, 255, 255));
        PanelChinh.setMaximumSize(new java.awt.Dimension(800, 533));
        PanelChinh.setMinimumSize(new java.awt.Dimension(800, 533));
        PanelChinh.setPreferredSize(new java.awt.Dimension(800, 533));
        PanelChinh.setLayout(null);

        PanelDN.setBackground(new java.awt.Color(204, 204, 204));
        PanelDN.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        btnLogin.setBackground(new java.awt.Color(204, 204, 204));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        chckshow.setBackground(new java.awt.Color(153, 153, 153));
        chckshow.setText("Show");
        chckshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckshowActionPerformed(evt);
            }
        });

        PnSignup.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout PnSignupLayout = new javax.swing.GroupLayout(PnSignup);
        PnSignup.setLayout(PnSignupLayout);
        PnSignupLayout.setHorizontalGroup(
            PnSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );
        PnSignupLayout.setVerticalGroup(
            PnSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        lbNoti.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lbNoti.setForeground(new java.awt.Color(255, 0, 0));
        lbNoti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNoti.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbNoti.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        LbSignup.setBackground(new java.awt.Color(204, 204, 204));
        LbSignup.setForeground(new java.awt.Color(102, 102, 102));
        LbSignup.setText("Sign up?");
        LbSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbSignupMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(PnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chckshow))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(txtUsername)))
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 44, Short.MAX_VALUE)
                        .addComponent(lbNoti, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(LbSignup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNoti)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(PnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chckshow)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LbSignup)
                .addGap(22, 22, 22))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("SIGN IN");

        javax.swing.GroupLayout PanelDNLayout = new javax.swing.GroupLayout(PanelDN);
        PanelDN.setLayout(PanelDNLayout);
        PanelDNLayout.setHorizontalGroup(
            PanelDNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(134, 134, 134))
        );
        PanelDNLayout.setVerticalGroup(
            PanelDNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        PanelChinh.add(PanelDN);
        PanelDN.setBounds(410, 140, 330, 280);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel5.setText("DICTIONARY");
        PanelChinh.add(jLabel5);
        jLabel5.setBounds(450, 40, 260, 50);

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        jLabel6.setText("BITW");
        PanelChinh.add(jLabel6);
        jLabel6.setBounds(540, 80, 90, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelChinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 791, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dn.setVisible(true);
            }
        });
    }
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
         char[] passwordchar = txtPassword.getPassword();
                password = new String(passwordchar);
        if (UserBLL.checkLogin(txtUsername.getText(), password)) {
            UserBLL.getUser(txtUsername.getText(), password);
            lbNoti.setText("");
            lbNoti.setVisible(true);
            this.setVisible(false);
            username = txtUsername.getText();
            user = UserBLL.getUser(username, password);
            ManHinhChinh.mhc = new ManHinhChinh();
            ManHinhChinh.mhc.setVisible(true);
        } else {
            lbNoti.setText("Wrong Username or Password!");
            lbNoti.setVisible(true);
        }


    }//GEN-LAST:event_btnLoginActionPerformed

    private void LbSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbSignupMouseClicked
        // TODO add your handling code here:
        dk = new DKTaiKhoan();
        dn.setVisible(false);
        dk.setVisible(true);
    }//GEN-LAST:event_LbSignupMouseClicked

    private void chckshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckshowActionPerformed
        // TODO add your handling code here:
        if (chckshow.isSelected()){
            txtPassword.setEchoChar((char)0);
        }
        else {
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_chckshowActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbSignup;
    private javax.swing.JPanel PanelChinh;
    private javax.swing.JPanel PanelDN;
    private javax.swing.JPanel PnSignup;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox chckshow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbNoti;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
