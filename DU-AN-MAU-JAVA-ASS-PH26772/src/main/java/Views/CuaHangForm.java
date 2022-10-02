
package Views;

import DomainModels.CuaHang;
import Services.CuaHangSerivce;
import Services.ServiceImpl.CuaHangImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CuaHangForm extends javax.swing.JFrame {

    private DefaultTableModel dtm = new DefaultTableModel();
    private List<CuaHang> listCh = new ArrayList<>();
    private CuaHangSerivce serivce = new CuaHangImpl();
    public CuaHangForm() {
        initComponents();
        jTable1.setModel(dtm);
        String[] header = {"Id","Ma","Ten","Dia chi","Thanh pho","Quoc gia"};
        dtm.setColumnIdentifiers(header);
        listCh = serivce.getAll();
        txtId.setEditable(false);
        showData(listCh);
    }
    public void showData(List<CuaHang> list){
        dtm.setRowCount(0);
        for (CuaHang cuaHang : list) {
            dtm.addRow(cuaHang.toRowData());
        }
    }
    public void fillData(int index){
    CuaHang ch = listCh.get(index);
    txtId.setText(String.valueOf(ch.getId()));
    txtMa.setText(ch.getMa());
    txtTen.setText(ch.getTen());
    txtDiaChi.setText(ch.getDiaChi());
    txtThanhPho.setText(ch.getThanhPho());
    txtquocgia.setText(ch.getQuocGia());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtThanhPho = new javax.swing.JTextField();
        txtquocgia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CỬA HÀNG");

        jLabel2.setText("ID");

        jLabel3.setText("Ma");

        jLabel4.setText("Ten");

        jLabel5.setText("Dia chi");

        jLabel6.setText("Thanh pho");

        jLabel7.setText("Quoc gia");

        btnThem.setText("Them");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sua");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId)
                    .addComponent(txtMa)
                    .addComponent(txtTen)
                    .addComponent(txtDiaChi)
                    .addComponent(txtThanhPho)
                    .addComponent(txtquocgia, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtThanhPho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtquocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private CuaHang checkValidate() {
        String ten = txtTen.getText();
        String ma = txtMa.getText();
        String tp = txtThanhPho.getText();
        String qg = txtquocgia.getText();
        String dc = txtDiaChi.getText();
        if (ma.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được để trống");
            return null;
        } else if (ten.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên không được để trống");
            return null;
        }else if (dc.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Địa chỉ không được để trống");
            return null;
        }else if (tp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Thành phố không được để trống");
            return null;
        }else if (qg.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Quốc gia không được để trống");
            return null;
        }
        CuaHang ch = new CuaHang(ma, ten, dc, tp, qg);
        return ch;
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        CuaHang ch = checkValidate();
        if (ch == null) {
            return;
        }
        JOptionPane.showMessageDialog(this, serivce.them(ch));
        listCh = serivce.getAll();
        showData(listCh);
    }//GEN-LAST:event_btnThemActionPerformed
        private CuaHang checkValidateSua() {
        String ten = txtTen.getText();
        String id = txtId.getText();
        String ma = txtMa.getText();
        String tp = txtThanhPho.getText();
        String qg = txtquocgia.getText();
        String dc = txtDiaChi.getText();
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chọn 1 dòng để sửa");
            return null;
        }
        if (ma.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được để trống");
            return null;
        }
        if (ten.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên không được để trống");
            return null;
        }
        if (dc.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Địa chỉ không được để trống");
            return null;
        }
        if (tp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Thành phố không được để trống");
            return null;
        }
        if (qg.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Quốc gia không được để trống");
            return null;
        }
        
        CuaHang ch = new CuaHang(UUID.fromString(id), ma, ten, dc, tp, qg);
        return ch;
    }
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
     CuaHang ch = checkValidateSua();
        if (ch == null) {
            return;
        }

        JOptionPane.showMessageDialog(this, serivce.sua(ch));
        listCh = serivce.getAll();
        showData(listCh);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
     String ten = txtTen.getText();
        String id = txtId.getText();
        String ma = txtMa.getText();
        String tp = txtThanhPho.getText();
        String qg = txtquocgia.getText();
        String dc = txtDiaChi.getText();
        if (ma.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chọn 1 dòng để xóa");
        } else {
            CuaHang ch = new CuaHang(UUID.fromString(id), ma, ten, dc, tp, qg);
            JOptionPane.showMessageDialog(this, serivce.xoa(ch, ma));
            listCh = serivce.getAll();
            showData(listCh);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int chon = jTable1.getSelectedRow();
        fillData(chon);
    }//GEN-LAST:event_jTable1MouseClicked


    public static void main(String args[]) {
      

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuaHangForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtThanhPho;
    private javax.swing.JTextField txtquocgia;
    // End of variables declaration//GEN-END:variables
}
