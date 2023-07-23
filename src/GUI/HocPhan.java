
package GUI;

import BLL.ModuleBLL;
import DTO.DictDTO;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
public class HocPhan extends javax.swing.JFrame {
    private ThuVien tv;
    private ModuleBLL moduleBLL = new ModuleBLL();
    private int idHP;
    private int count = 0;
    private DefaultTableModel model1;
    public HocPhan(int idH) {
        idHP = idH;
        model1 = moduleBLL.getDataListWord(idHP);
        initComponents();
        
        moduleBLL.getModuleById(idH);
        txtHP.setText(moduleBLL.getModuleById(idH).getModuleName());
        txtMoTa.setText(moduleBLL.getModuleById(idH).getModuleDescription());
        
        TableVocal.design(TableVocal);
        
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
        btnOk = new javax.swing.JButton();
        LbAnh = new javax.swing.JLabel();
        btnSapXep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setBounds(new java.awt.Rectangle(275, 75, 280, 380));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 533));

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

        int counts = model1.getRowCount();
        for (int i = 0; i < 9 - counts; i++){
            model1.addRow(new Vector());
        }
        TableVocal.setModel(model1);
        TableVocal.fixTable(jScrollPane1);
        for(int i = 0; i != TableVocal.getColumnCount(); ++i)
        {
            TableVocal.setCellAlignment(i, JLabel.CENTER);
            TableVocal.setColumnAlignment(i, JLabel.CENTER);
        }
        TableVocal.setShowGrid(true);
        SetWidth();
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

        btnOk.setBackground(new java.awt.Color(204, 204, 204));
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        LbAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI1/icon/Study.jpg"))); // NOI18N

        btnSapXep.setBackground(new java.awt.Color(204, 204, 204));
        btnSapXep.setText("Sắp xếp");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(70, 70, 70)
                                .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                                .addComponent(LbAnh)
                                .addGap(72, 72, 72)))
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(LbAnh)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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
        this.setVisible(false);
        ManHinhChinh.mhc.setVisible(true);
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        this.setVisible(false);
        tv = new ThuVien();
        tv.setVisible(true);
    }//GEN-LAST:event_btnOkActionPerformed

    public void SetWidth()
    {
        TableColumn column1 = TableVocal.getColumnModel().getColumn(0);
        TableColumn column2 = TableVocal.getColumnModel().getColumn(1);
        TableColumn column3 = TableVocal.getColumnModel().getColumn(2);
        TableColumn column4 = TableVocal.getColumnModel().getColumn(3);
        column1.setPreferredWidth(75);
        column2.setPreferredWidth(300);
        column3.setPreferredWidth(75);
        column4.setPreferredWidth(50);
    }
    
    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        count++;
        if(count % 2 == 0)
        {
            btnSapXep.setBackground(new java.awt.Color(204, 204, 204));
            TableVocal.setModel(model1);
            SetWidth();
            TableVocal.design(TableVocal);
        }
        else
        {
            btnSapXep.setBackground(new java.awt.Color(120, 120, 120));
            TableVocal.setModel(Sapxep(moduleBLL.getArrDataListWord(idHP)));  
            SetWidth();
            TableVocal.design(TableVocal);
        }
    }//GEN-LAST:event_btnSapXepActionPerformed

    public DefaultTableModel Sapxep(String[][] arr)
    {
        DefaultTableModel model = new DefaultTableModel();
        Vector<Vector> dataTable = new Vector<>();
        selectionSort(arr);      
        for (String[] arr1 : arr) {
            Vector row = new Vector();
            for (int j = 0; j < 4; j++) {
                row.add(arr1[j]);
            }
            dataTable.add(row);
        }
        int rows = arr.length;
        for (int i = 0; i < 9 - rows; i++){
            dataTable.add(new Vector());
            
        }
        Vector columns = new Vector<>();
        columns.add("Tiếng Anh");
        columns.add("Tiếng Việt");
        columns.add("Phiên âm");
        columns.add("Loại từ");
        model.setDataVector(dataTable, columns);
        
        return model;
    }
    
    public static String[][] selectionSort(String[][] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            // Tìm phần tử nhỏ nhất trong danh sách chưa được sắp xếp
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0].compareTo(arr[minIndex][0]) < 0) {
                    minIndex = j;
                }
            }
            
            // Hoán đổi vị trí của phần tử nhỏ nhất với phần tử đầu tiên chưa được sắp xếp
            String temp1 = arr[minIndex][0];
            String temp2 = arr[minIndex][1];
            String temp3 = arr[minIndex][2];
            String temp4 = arr[minIndex][3];
            arr[minIndex][0] = arr[i][0];
            arr[minIndex][1] = arr[i][1];
            arr[minIndex][2] = arr[i][2];
            arr[minIndex][3] = arr[i][3];
            arr[i][0] = temp1;
            arr[i][1] = temp2;
            arr[i][2] = temp3;
            arr[i][3] = temp4;
        }
        return arr;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbAnh;
    private GUI.TableCus.MyTable TableVocal;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtHP;
    private javax.swing.JTextField txtMoTa;
    // End of variables declaration//GEN-END:variables
}
