package GUI;

import BLL.DatasearchBLL;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JPopupMenu;
import DTO.DataSearchDTO;
import DTO.DictDTO;
import swing.EventClick;
import swing.PanelSearch;

public class ManHinhChinh extends javax.swing.JFrame {

    private BLL.DatasearchBLL dataSearch = new DatasearchBLL();
    private JPopupMenu menu;
    private PanelSearch search;
    ThuVien tv = new ThuVien();
    TaoHP2 HP = new TaoHP2();

    public ManHinhChinh() {

        initComponents();
        menu = new JPopupMenu();
        search = new PanelSearch();
        menu.setBorder(BorderFactory.createLineBorder(new Color(164, 164, 164)));
        menu.add(search);
        menu.setFocusable(false);
        search.addEventClick(new EventClick() {
            @Override
            public void itemClick(DataSearchDTO data) {
                // dien vao day
                txtSearch.setText(data.getText());
                DictDTO word = BLL.DictBLL.getWord(txtSearch.getText());
                lbTiengAnh.setText(word.getEnglishLanguage());
                lbTiengViet.setText(word.getVietnameseLanguae());
                lbLoaiTu.setText(word.getWordForm());
                lbPhienAm.setText(word.getInternationalPhonetic());
                menu.setVisible(false);
            }
            @Override
            public void itemRemove(Component com, DataSearchDTO data) {
                // dien vao day

            }
        });
        
    }

    // @SuppressWarnings("unchecked");
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnChinh = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        PnPhu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbTiengAnh = new javax.swing.JLabel();
        lbLoaiTu = new javax.swing.JLabel();
        lbPhienAm = new javax.swing.JLabel();
        pnKhung3 = new javax.swing.JPanel();
        lbTiengViet = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSearch = new swing.textField();
        PnCN = new javax.swing.JPanel();
        PnTaoHocPhan = new javax.swing.JPanel();
        LbTaoHocPhan = new javax.swing.JLabel();
        pnKhung1 = new javax.swing.JPanel();
        PnThuVien = new javax.swing.JPanel();
        LbThuVien = new javax.swing.JLabel();
        pnKhung2 = new javax.swing.JPanel();
        PnCaiDat = new javax.swing.JPanel();
        lbCaiDat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(275, 75, 820, 533));
        setMinimumSize(new java.awt.Dimension(800, 533));
        setUndecorated(true);
        setResizable(false);

        PnChinh.setBackground(new java.awt.Color(153, 153, 153));
        PnChinh.setPreferredSize(new java.awt.Dimension(845, 533));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setText("DICTIONARY");

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel5.setText("BITW");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jLabel7.setText("Name");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        lbTiengAnh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTiengAnh.setText("Tiếng anh");

        lbLoaiTu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lbLoaiTu.setText("Loại từ");

        lbPhienAm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPhienAm.setText("Phiên âm");

        pnKhung3.setBackground(new java.awt.Color(51, 51, 51));
        pnKhung3.setPreferredSize(new java.awt.Dimension(1, 45));

        javax.swing.GroupLayout pnKhung3Layout = new javax.swing.GroupLayout(pnKhung3);
        pnKhung3.setLayout(pnKhung3Layout);
        pnKhung3Layout.setHorizontalGroup(
            pnKhung3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnKhung3Layout.setVerticalGroup(
            pnKhung3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        lbTiengViet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTiengViet.setText("Tiếng Việt");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnKhung3, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPhienAm, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLoaiTu, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTiengViet, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lbPhienAm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbLoaiTu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnKhung3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTiengViet)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI1/icon/Bookshelf.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout PnPhuLayout = new javax.swing.GroupLayout(PnPhu);
        PnPhu.setLayout(PnPhuLayout);
        PnPhuLayout.setHorizontalGroup(
            PnPhuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnPhuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnPhuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PnPhuLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PnPhuLayout.setVerticalGroup(
            PnPhuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnPhuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnCN.setBackground(new java.awt.Color(153, 153, 153));

        PnTaoHocPhan.setBackground(new java.awt.Color(153, 153, 153));
        PnTaoHocPhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnTaoHocPhanMouseClicked(evt);
            }
        });

        LbTaoHocPhan.setBackground(new java.awt.Color(204, 204, 204));
        LbTaoHocPhan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LbTaoHocPhan.setText(" Tạo Học Phần Mới");
        LbTaoHocPhan.setPreferredSize(new java.awt.Dimension(120, 20));

        javax.swing.GroupLayout PnTaoHocPhanLayout = new javax.swing.GroupLayout(PnTaoHocPhan);
        PnTaoHocPhan.setLayout(PnTaoHocPhanLayout);
        PnTaoHocPhanLayout.setHorizontalGroup(
            PnTaoHocPhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnTaoHocPhanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbTaoHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnTaoHocPhanLayout.setVerticalGroup(
            PnTaoHocPhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnTaoHocPhanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LbTaoHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnKhung1.setBackground(new java.awt.Color(51, 51, 51));
        pnKhung1.setPreferredSize(new java.awt.Dimension(2, 45));

        javax.swing.GroupLayout pnKhung1Layout = new javax.swing.GroupLayout(pnKhung1);
        pnKhung1.setLayout(pnKhung1Layout);
        pnKhung1Layout.setHorizontalGroup(
            pnKhung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        pnKhung1Layout.setVerticalGroup(
            pnKhung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        PnThuVien.setBackground(new java.awt.Color(153, 153, 153));

        LbThuVien.setBackground(new java.awt.Color(204, 204, 204));
        LbThuVien.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LbThuVien.setText(" Thư Viện Của Bạn");
        LbThuVien.setPreferredSize(new java.awt.Dimension(120, 20));

        javax.swing.GroupLayout PnThuVienLayout = new javax.swing.GroupLayout(PnThuVien);
        PnThuVien.setLayout(PnThuVienLayout);
        PnThuVienLayout.setHorizontalGroup(
            PnThuVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnThuVienLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(LbThuVien, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PnThuVienLayout.setVerticalGroup(
            PnThuVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnThuVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbThuVien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pnKhung2.setBackground(new java.awt.Color(51, 51, 51));
        pnKhung2.setPreferredSize(new java.awt.Dimension(2, 45));

        javax.swing.GroupLayout pnKhung2Layout = new javax.swing.GroupLayout(pnKhung2);
        pnKhung2.setLayout(pnKhung2Layout);
        pnKhung2Layout.setHorizontalGroup(
            pnKhung2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        pnKhung2Layout.setVerticalGroup(
            pnKhung2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        PnCaiDat.setBackground(new java.awt.Color(153, 153, 153));

        lbCaiDat.setBackground(new java.awt.Color(204, 204, 204));
        lbCaiDat.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lbCaiDat.setText("Cài Đặt");
        lbCaiDat.setPreferredSize(new java.awt.Dimension(120, 20));

        javax.swing.GroupLayout PnCaiDatLayout = new javax.swing.GroupLayout(PnCaiDat);
        PnCaiDat.setLayout(PnCaiDatLayout);
        PnCaiDatLayout.setHorizontalGroup(
            PnCaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCaiDatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCaiDat, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnCaiDatLayout.setVerticalGroup(
            PnCaiDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnCaiDatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCaiDat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PnCNLayout = new javax.swing.GroupLayout(PnCN);
        PnCN.setLayout(PnCNLayout);
        PnCNLayout.setHorizontalGroup(
            PnCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCNLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(PnTaoHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnKhung1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnThuVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnKhung2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnCaiDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        PnCNLayout.setVerticalGroup(
            PnCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnCNLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnCNLayout.createSequentialGroup()
                        .addGroup(PnCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PnThuVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PnCNLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pnKhung2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnCNLayout.createSequentialGroup()
                                .addGroup(PnCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PnTaoHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnKhung1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(PnCNLayout.createSequentialGroup()
                        .addComponent(PnCaiDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout PnChinhLayout = new javax.swing.GroupLayout(PnChinh);
        PnChinh.setLayout(PnChinhLayout);
        PnChinhLayout.setHorizontalGroup(
            PnChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnChinhLayout.createSequentialGroup()
                .addGroup(PnChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnChinhLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel5))
                    .addGroup(PnChinhLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)))
                .addGap(38, 38, 38)
                .addComponent(PnCN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(PnChinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnPhu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnChinhLayout.setVerticalGroup(
            PnChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnChinhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnChinhLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(PnCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnPhu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnChinh, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        // TODO add your handling code here:
        if (search.getItemSize() > 0) {
            menu.show(txtSearch, 0, txtSearch.getHeight());

        }
    }//GEN-LAST:event_txtSearchMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() != KeyEvent.VK_UP && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_ENTER) {
            String text = txtSearch.getText().trim().toLowerCase();
            try{
            search.setData(dataSearch.Search(text));
                    //search.setVisible(true);
            }catch(Exception e){}
            if (search.getItemSize() > 0) {
                menu.show(txtSearch, 5, txtSearch.getHeight());
                menu.setPopupSize(menu.getWidth(), (search.getItemSize() * 35) + 2);
            } else {
                
                menu.setVisible(false);
            }
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            search.KeyUp();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            
            search.KeyDown();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String temp = search.getItemSelected();
            txtSearch.setText(temp);
            DictDTO word = BLL.DictBLL.getWord(txtSearch.getText());
            if (word != null){
                lbTiengAnh.setText(word.getEnglishLanguage());
                lbTiengViet.setText(word.getVietnameseLanguae());
                lbLoaiTu.setText(word.getWordForm());
                lbPhienAm.setText(word.getInternationalPhonetic());
            }
            
            menu.setVisible(false);
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void PnTaoHocPhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnTaoHocPhanMouseClicked
        // TODO add your handling code here:
        if(evt.getSource() == PnTaoHocPhan)
        {
            this.setVisible(false);
            HP.setVisible(true);
        }
    }//GEN-LAST:event_PnTaoHocPhanMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbTaoHocPhan;
    private javax.swing.JLabel LbThuVien;
    private javax.swing.JPanel PnCN;
    private javax.swing.JPanel PnCaiDat;
    private javax.swing.JPanel PnChinh;
    private javax.swing.JPanel PnPhu;
    private javax.swing.JPanel PnTaoHocPhan;
    private javax.swing.JPanel PnThuVien;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbCaiDat;
    private javax.swing.JLabel lbLoaiTu;
    private javax.swing.JLabel lbPhienAm;
    private javax.swing.JLabel lbTiengAnh;
    private javax.swing.JLabel lbTiengViet;
    private javax.swing.JPanel pnKhung1;
    private javax.swing.JPanel pnKhung2;
    private javax.swing.JPanel pnKhung3;
    private swing.textField txtSearch;
    // End of variables declaration//GEN-END:variables
}
