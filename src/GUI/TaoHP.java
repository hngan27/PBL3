package GUI;

import BLL.DatasearchBLL;
import BLL.DictBLL;
import BLL.UserBLL;
import DTO.DataSearchDTO;
import DTO.DictDTO;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import swing.EventClick;
import swing.PanelSearch;

public class TaoHP extends javax.swing.JFrame {
    
    static TaoHP Thp = new TaoHP();

    private BLL.DatasearchBLL dataSearch = new DatasearchBLL();
    private JPopupMenu menu;
    private PanelSearch search;
    private DefaultTableModel defaultmodel = new DefaultTableModel();
    private DefaultTableModel model = new DefaultTableModel();
    public static int indexCount = 0;

    public TaoHP() {
        initComponents();

        defaultmodel.addColumn("Id");
        defaultmodel.addColumn("English");
        defaultmodel.addColumn("Vietnamese");
        defaultmodel.addColumn("International Phonetic");
        defaultmodel.addColumn("Form");
        
        for (int i = 0; i < 8; i++) {
            defaultmodel.addRow(new Vector());
        }
        model.addColumn("STT");
        model.addColumn("Tiếng Anh");
        model.addColumn("Tiếng Việt");
        model.addColumn("Phiên âm");
        model.addColumn("Loại từ");
        SetWidth();
        menu = new JPopupMenu();
        search = new PanelSearch();
        search.setSize(100, HEIGHT);
        menu.setBorder(BorderFactory.createLineBorder(new Color(164, 164, 164)));
        menu.add(search);
        menu.setFocusable(false);
        search.addEventClick(new EventClick() {
            @Override
            public void itemClick(DataSearchDTO data) {
                // dien vao day
                txtSearch.setText(data.getText());
                menu.setVisible(false);
            }

            @Override
            public void itemRemove(Component com, DataSearchDTO data) {
                // dien vao day

            }
        });
    }
    
    public void SetWidth()
    {
        TableColumn column1 = TableVocal.getColumnModel().getColumn(0);
        column1.setPreferredWidth(50);
        TableColumn column2 = TableVocal.getColumnModel().getColumn(1);
        column2.setPreferredWidth(300);
        TableColumn column3 = TableVocal.getColumnModel().getColumn(2);
        column3.setPreferredWidth(300);
        TableColumn column4 = TableVocal.getColumnModel().getColumn(3);
        column4.setPreferredWidth(100);
        TableColumn column5 = TableVocal.getColumnModel().getColumn(4);
        column5.setPreferredWidth(100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMoTa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVocal = new GUI.TableCus.MyTable();
        btnTrangChu = new javax.swing.JButton();
        txtHP = new javax.swing.JTextField();
        btnTaoHP = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        txtSearch = new swing.textField();
        btnXoa = new javax.swing.JButton();
        LbTb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setBounds(new java.awt.Rectangle(275, 75, 280, 380));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tên Học Phần");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Mô Tả");

        txtMoTa.setBackground(new java.awt.Color(153, 153, 153));
        txtMoTa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMoTa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("* Nhập dữ liệu");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setText("DICTIONARY");

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel5.setText("BITW");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        TableVocal.getTableHeader().setAlignmentX(CENTER_ALIGNMENT);
        TableVocal.setModel(model
        );
        TableVocal.fixTable(jScrollPane1);
        for(int i = 0; i != TableVocal.getColumnCount(); ++i)
        {
            TableVocal.setCellAlignment(i, JLabel.CENTER);
            TableVocal.setColumnAlignment(i, JLabel.CENTER);
        }
        TableVocal.setShowGrid(true);
        jScrollPane1.setViewportView(TableVocal);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);

        btnTrangChu.setBackground(new java.awt.Color(204, 204, 204));
        btnTrangChu.setText("Trang chủ");
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        txtHP.setBackground(new java.awt.Color(153, 153, 153));
        txtHP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        btnTaoHP.setBackground(new java.awt.Color(204, 204, 204));
        btnTaoHP.setText("Tạo học phần");
        btnTaoHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHPActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(204, 204, 204));
        btnThem.setText("Thêm");
        btnThem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        txtSearch.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Iconshock-Real-Vista-Text-Search-b.32.png"))); // NOI18N
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(204, 204, 204));
        btnXoa.setText("Xóa từ");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        LbTb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LbTb.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTaoHP))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 72, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(574, 574, 574)))
                .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnXoa)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbTb, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(153, 153, 153))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbTb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(71, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnTaoHP, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Bạn có lưu học phần này không", "Thông báo", JOptionPane.OK_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            String s = txtHP.getText().trim();
            if(s.length() == 0)
            {
                Object[] options = { "OK" };
                int choice = JOptionPane.showOptionDialog(null, "Học phần này chưa có tên!!!", "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if (choice == 0) {}
            }
            else if(indexCount == 0)
            {
                Object[] options = { "OK" };
                int choice = JOptionPane.showOptionDialog(null, "Học phần này chưa có từ nào!!!", "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if (choice == 0) {}
            }
            else{
                BLL.ModuleBLL.AddHocPhan(UserBLL.getUser(ManHinhDN.username, ManHinhDN.password).getUserId(), txtHP.getText(), txtMoTa.getText());
                BLL.ModuleBLL.AddWordHocPhan(model.getDataVector());
                Thp.setVisible(false);
                ManHinhChinh.mhc.setVisible(true);
            }
        } else if (dialogResult == JOptionPane.NO_OPTION) {
            Thp.setVisible(false);
            ManHinhChinh.mhc.setVisible(true);
        }
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnTaoHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHPActionPerformed
        String s = txtHP.getText().trim();
        if(s.length() == 0)
        {
            LbTb.setText("Học phần này chưa có tên!!");
        }
        else if(indexCount == 0)
        {
            LbTb.setText("Học phần này chưa có từ nào!!");
        }
        else
        {
            BLL.ModuleBLL.AddHocPhan(UserBLL.getUser(ManHinhDN.username, ManHinhDN.password).getUserId(), txtHP.getText(), txtMoTa.getText());
            BLL.ModuleBLL.AddWordHocPhan(model.getDataVector());
            Thp.setVisible(false);
            ManHinhChinh.mhc.setVisible(true);
        }

    }//GEN-LAST:event_btnTaoHPActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            search.KeyUp();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {

            search.KeyDown();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String temp = search.getItemSelected();
            txtSearch.setText(temp);

            //if (word != null){
//                lbTiengAnh.setText(word.getEnglishLanguage());
//                lbTiengViet.setText(word.getVietnameseLanguae());
//                lbLoaiTu.setText(word.getWordForm());
//                lbPhienAm.setText(word.getInternationalPhonetic());
            //}
            menu.setVisible(false);
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() != KeyEvent.VK_UP && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_ENTER) {
            String text = txtSearch.getText().trim().toLowerCase();
            try {
                search.setData(dataSearch.Search(text));
                //search.setVisible(true);
            } catch (Exception e) {
            }
            if (search.getItemSize() > 0) {
                menu.show(txtSearch, 5, txtSearch.getHeight());
                menu.setPopupSize(menu.getWidth(), (search.getItemSize() * 35) + 2);
            } else {

                menu.setVisible(false);
            }
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        // TODO add your handling code here:
        if (search.getItemSize() > 0) {
            menu.show(txtSearch, 0, txtSearch.getHeight());

        }
    }//GEN-LAST:event_txtSearchMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        DictDTO word = BLL.DictBLL.getWord(txtSearch.getText());
        Vector wordLib = new Vector();
        if (model.getRowCount() == 8) {
            for (int i = 7; i >= indexCount; i--) {
                model.removeRow(i);
            }
        }
        wordLib.add(model.getRowCount() + 1);
        wordLib.add(word.getEnglishLanguage());
        wordLib.add(word.getVietnameseLanguae());
        wordLib.add(word.getInternationalPhonetic());
        wordLib.add(word.getWordForm());
        model.addRow(wordLib);
        indexCount++;
        int count = model.getRowCount();
        if (model.getRowCount() <= 8) {
            for (int i = 0; i < 8 - count; i++) {
                model.addRow(new Vector());
            }
        }
        SetWidth();
        System.out.println(model);
        TableVocal.setModel(model);

        TableVocal.design(TableVocal);
        txtSearch.setText("");
        //System.out.println(model.getRowCount());

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        
        //Vector<> wordLib = new Vector();
        if (TableVocal.getSelectedRow() >= 0) {
            
            int selectedRow = TableVocal.getSelectedRow();
            btnXoa.setEnabled(true);
            if (model.getRowCount() == 8) {
                for (int i = 7; i >= indexCount; i--) {
                    model.removeRow(i);
                }
            }
            model.removeRow(selectedRow);
            for (int i = 0; i < model.getRowCount(); i++) {
                model.setValueAt(i + 1, i, 0);
            }
            indexCount--;
            int count = model.getRowCount();
            if (model.getRowCount() <= 8) {
                for (int i = 0; i < 8 - count; i++) {
                    model.addRow(new Vector());
                }
            }
            SetWidth();
            TableVocal.setModel(model);
            TableVocal.design(TableVocal);
        }
        
    }//GEN-LAST:event_btnXoaActionPerformed

    public void Clear()
    {
        txtSearch.setText("");
        txtHP.setText("");
        txtMoTa.setText("");
        LbTb.setText("");
        DefaultTableModel model1 = new DefaultTableModel();
        model1.addColumn("STT");
        model1.addColumn("Tiếng Anh");
        model1.addColumn("Tiếng Việt");
        model1.addColumn("Phiên âm");
        model1.addColumn("Loại từ");
//        for(int i = 0; i < model.getRowCount(); i++)
//            model.removeRow(i);
        int count = model1.getRowCount();
        if (count <= 8) {
            for (int i = 0; i < 8 - count; i++) {
                model1.addRow(new Vector());
            }
        }
        model = model1;
        TableVocal.setModel(model);
        TableVocal.design(TableVocal);
        indexCount = 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbTb;
    private GUI.TableCus.MyTable TableVocal;
    private javax.swing.JButton btnTaoHP;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtHP;
    private javax.swing.JTextField txtMoTa;
    private swing.textField txtSearch;
    // End of variables declaration//GEN-END:variables
}
