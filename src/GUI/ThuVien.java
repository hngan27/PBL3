package GUI;

import BLL.ModuleBLL;

import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultEditorKit;


public class ThuVien extends javax.swing.JFrame {
    private ModuleBLL moduleBLL = new ModuleBLL();
    private HocPhan hp ;
    private ChinhSuaHP cs ;
    private DefaultTableModel model = new DefaultTableModel();
    ListSelectionModel selections;
    private int idU = BLL.UserBLL.getIdUserbyUsername(ManHinhDN.username);
    public  int indexCount;
    
    public void ImportData(int id){
        Vector columns = new Vector<>();
        columns.add("Học Phần");
        columns.add("Tên Học Phần");
        columns.add("Số từ");
        columns.add("Mô tả");
        model.setDataVector(moduleBLL.getDataListModule(id), columns);
        indexCount = model.getRowCount();
        for (int i = indexCount; i < 8; i++) {
            model.addRow(new Vector());
        } 
    }
    
    public void setNameUser(String s)
    {
        LbName.setText(s);
    }
    
    public void SetWidth()
    {
        TableColumn column1 = table.getColumnModel().getColumn(0);
        column1.setPreferredWidth(50);
        TableColumn column2 = table.getColumnModel().getColumn(1);
        column2.setPreferredWidth(300);
        TableColumn column3 = table.getColumnModel().getColumn(2);
        column3.setPreferredWidth(50);
        TableColumn column4 = table.getColumnModel().getColumn(3);
        column4.setPreferredWidth(300);
    }
    
    public ThuVien() {
        initComponents();
        ImportData(idU);
        SetWidth();
        table.design(table);
        LbName.setText(ManHinhDN.user.getUserName());
        selections = table.getSelectionModel();
        selections.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                if (! selections.isSelectionEmpty()){
                    int selectedRow = selections.getMinSelectionIndex();
                    if(model.getValueAt(selectedRow, 1) != null)
                    {
                        txtHP.setText(model.getValueAt(selectedRow, 1).toString());
                        txtHP2.setText(model.getValueAt(selectedRow, 3).toString());
                        txtHP3.setText(model.getValueAt(selectedRow, 2).toString());
                    }
                }
            }
        });
        
        //table.isCellEditable(, NORMAL)
        
    
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelChinh = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        LbName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnTrangChu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new GUI.TableCus.MyTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHP = new javax.swing.JTextField();
        txtHP2 = new javax.swing.JTextField();
        txtHP3 = new javax.swing.JTextField();
        btnHoc = new javax.swing.JButton();
        btnChinhSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        PnX = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(275, 75, 800, 533));
        setUndecorated(true);

        PanelChinh.setBackground(new java.awt.Color(153, 153, 153));
        PanelChinh.setPreferredSize(new java.awt.Dimension(800, 533));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setText("DICTIONARY");

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel5.setText("BITW");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI1/icon/avt1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        LbName.setText("Username");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("* Học phần của bạn");

        btnTrangChu.setBackground(new java.awt.Color(204, 204, 204));
        btnTrangChu.setText("Trang chủ");
        btnTrangChu.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        table.getTableHeader().setAlignmentX(CENTER_ALIGNMENT);
        table.setModel(model

        );
        table.design(table);
        table.setDefaultEditor(Object.class, null);
        table.fixTable(jScrollPane2);
        for(int i = 0; i != table.getColumnCount(); ++i)
        {
            table.setCellAlignment(i, JLabel.CENTER);
            table.setColumnAlignment(i, JLabel.CENTER);
        }
        table.setShowGrid(true);
        jScrollPane2.setViewportView(table);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Tên học phần");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Số từ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Mô tả");

        txtHP.setBackground(new java.awt.Color(153, 153, 153));
        txtHP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtHP.setEnabled(false);

        txtHP2.setBackground(new java.awt.Color(153, 153, 153));
        txtHP2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHP2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtHP2.setEnabled(false);

        txtHP3.setBackground(new java.awt.Color(153, 153, 153));
        txtHP3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHP3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtHP3.setEnabled(false);

        btnHoc.setBackground(new java.awt.Color(204, 204, 204));
        btnHoc.setText("Học");
        btnHoc.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        btnHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocActionPerformed(evt);
            }
        });

        btnChinhSua.setBackground(new java.awt.Color(204, 204, 204));
        btnChinhSua.setText("Chỉnh sửa");
        btnChinhSua.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        btnChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(204, 204, 204));
        btnXoa.setText("Xóa");
        btnXoa.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        PnX.setBackground(new java.awt.Color(204, 204, 204));
        PnX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PnXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PnXMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("   X ");

        javax.swing.GroupLayout PnXLayout = new javax.swing.GroupLayout(PnX);
        PnX.setLayout(PnXLayout);
        PnXLayout.setHorizontalGroup(
            PnXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnXLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
        PnXLayout.setVerticalGroup(
            PnXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnXLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelChinhLayout = new javax.swing.GroupLayout(PanelChinh);
        PanelChinh.setLayout(PanelChinhLayout);
        PanelChinhLayout.setHorizontalGroup(
            PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChinhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelChinhLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(PanelChinhLayout.createSequentialGroup()
                        .addGroup(PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelChinhLayout.createSequentialGroup()
                                .addGroup(PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelChinhLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(48, 48, 48)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PanelChinhLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(62, 62, 62)
                                .addComponent(btnHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                        .addGroup(PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelChinhLayout.createSequentialGroup()
                                .addComponent(LbName))
                            .addGroup(PanelChinhLayout.createSequentialGroup()
                                .addComponent(btnChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PnX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelChinhLayout.createSequentialGroup()
                        .addGroup(PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelChinhLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelChinhLayout.createSequentialGroup()
                                .addGroup(PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(PanelChinhLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHP)
                                    .addComponent(txtHP2))))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHP3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(418, 418, 418))))
        );
        PanelChinhLayout.setVerticalGroup(
            PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChinhLayout.createSequentialGroup()
                .addGroup(PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelChinhLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(PanelChinhLayout.createSequentialGroup()
                        .addGroup(PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelChinhLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(PanelChinhLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbName)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(PnX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelChinhLayout.createSequentialGroup()
                                .addGroup(PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtHP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 26, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelChinhLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(PanelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelChinh, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelChinh, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        
        ManHinhChinh.mhc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocActionPerformed
        
      if (!selections.isSelectionEmpty()){
            int selectedRow = selections.getMinSelectionIndex();
            Object value = table.getValueAt(selectedRow,0);
            if(value != null)
            {
                int idH = moduleBLL.getIdModulebyTable(idU, model.getDataVector().get(selectedRow));
                this.setVisible(false);
                hp = new HocPhan(idH);
                hp.setVisible(true);
            }
            else
            {
                Object[] options = { "OK" };
                int choice = JOptionPane.showOptionDialog(null, "Vui lòng chọn học phần!!!", "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if (choice == 0) {}
            }
        }
        
        
    }//GEN-LAST:event_btnHocActionPerformed

    private void btnChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSuaActionPerformed
        
        if (!selections.isSelectionEmpty()){
            int selectedRow = selections.getMinSelectionIndex();
            Object value = table.getValueAt(selectedRow,0);
            if(value != null)
            {
                int idH = moduleBLL.getIdModulebyTable(idU, model.getDataVector().get(selectedRow));
                this.setVisible(false);
                cs = new ChinhSuaHP(idH);
                cs.setVisible(true);
            }
            else
            {
                Object[] options = { "OK" };
                int choice = JOptionPane.showOptionDialog(null, "Vui lòng chọn học phần!!!", "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if (choice == 0) {}
            }
        }
    }//GEN-LAST:event_btnChinhSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
       if (!selections.isSelectionEmpty()){
            int selectedRow1 = selections.getMinSelectionIndex();
            Object value = table.getValueAt(selectedRow1,0);
            if(value != null)
            {
                if (table.getSelectedRow() >= 0) {
                    int selectedRow = table.getSelectedRow();
                    if (model.getRowCount() == 9) {
                        for (int i = 8; i >= indexCount; i--) {
                            model.removeRow(i);
                        }
                    }
                    int idH = moduleBLL.getIdModulebyTable(idU, model.getDataVector().get(selectedRow));
                    BLL.ModuleBLL.DeleteModule(idH);
                    model.removeRow(selectedRow);
                    indexCount--;
                    int count = model.getRowCount();
                    if (model.getRowCount() <= 9) {
                        for (int i = 0; i < 9 - count; i++) {
                            model.addRow(new Vector());
                        }
                    }
                    table.setModel(model);
                    table.design(table);
                    txtHP.setText("");
                    txtHP2.setText("");
                    txtHP3.setText("");
                }
            }
            else
            {
                Object[] options = { "OK" };
                int choice = JOptionPane.showOptionDialog(null, "Vui lòng chọn học phần!!!", "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if (choice == 0) {}
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void PnXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_PnXMouseClicked

    private void PnXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnXMouseEntered
        PnX.setBackground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_PnXMouseEntered

    private void PnXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnXMouseExited
        PnX.setBackground(new java.awt.Color(242, 242, 242));
    }//GEN-LAST:event_PnXMouseExited


 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbName;
    private javax.swing.JPanel PanelChinh;
    private javax.swing.JPanel PnX;
    private javax.swing.JButton btnChinhSua;
    private javax.swing.JButton btnHoc;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private GUI.TableCus.MyTable table;
    private javax.swing.JTextField txtHP;
    private javax.swing.JTextField txtHP2;
    private javax.swing.JTextField txtHP3;
    // End of variables declaration//GEN-END:variables
}
