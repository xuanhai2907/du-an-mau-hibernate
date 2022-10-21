/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Services.KhachHangService;
import Services.ServiceImpl.KhachHangServiceImpl;
import ViewModels.QLKhachHang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author window
 */
public class TryingOneForm extends javax.swing.JFrame {

    private DefaultTableModel model = new DefaultTableModel();
    private KhachHangService khachHangService = new KhachHangServiceImpl();
    private List<QLKhachHang> listQLKhachHangs = new ArrayList<>();

    /**
     * Creates new form TryingOneForm
     */
    public TryingOneForm() {
        initComponents();
        tbKhachHanf.setModel(model);
        String[] hearder = {"Mã", "Tên", "Đệm", "Họ", "Địa Chỉ", "Họ tên đầy đủ"};
        model.setColumnIdentifiers(hearder);
        listQLKhachHangs = khachHangService.getList();
        showData(listQLKhachHangs);
    }

    public void showData(List<QLKhachHang> list) {
        model.setRowCount(0);
        for (QLKhachHang qLKhachHang : list) {
            model.addRow(qLKhachHang.toRowData1());
        }
    }

    public void fillDataToTable(int index) {
        QLKhachHang qlkh = listQLKhachHangs.get(index);
        txtMa.setText(qlkh.getMa());
        txtTen.setText(qlkh.getTen());
        txtDem.setText(qlkh.getTenDem());
        txtHo.setText(qlkh.getHo());
        txtDiaChi.setText(qlkh.getDiaChi());
    }

    public QLKhachHang checkValidate() {
        String ten = txtTen.getText().trim();
        String dem = txtDem.getText().trim();
        String ma = txtMa.getText().trim();
        String diaChi = txtDiaChi.getText().trim();
        String ho = txtHo.getText().trim();

        if (ten.isEmpty() || dem.isEmpty() || ma.isEmpty() || diaChi.isEmpty() || ho.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được bỏ trống bất kì 1 thông tin nào");
            return null;
        }
        if (!ho.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Họ không được có số hoặc kí tự đặc biệt");
            return null;
        }
        if (!dem.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Đệm không được có số hoặc kí tự đặc biệt");
            return null;
        }
        if (!ten.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Tên không được có số hoặc kí tự đặc biệt");
            return null;
        }
        QLKhachHang ql = new QLKhachHang();
        ql.setMa(ma);
        ql.setTen(ten);
        ql.setTenDem(dem);
        ql.setHo(ho);
        ql.setDiaChi(diaChi);
        return ql;
    }

    public void clearForm() {
        txtDem.setText("");
        txtDiaChi.setText("");
        txtHo.setText("");
        txtMa.setText("");
        txtSearch.setText("");
        txtTen.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhachHanf = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.jLabel1.text")); // NOI18N

        txtMa.setText(org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.txtMa.text")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.jLabel2.text")); // NOI18N

        txtTen.setText(org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.txtTen.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.jLabel3.text")); // NOI18N

        txtHo.setText(org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.txtHo.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.jLabel4.text")); // NOI18N

        txtDem.setText(org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.txtDem.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.jLabel5.text")); // NOI18N

        txtDiaChi.setText(org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.txtDiaChi.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.jLabel6.text")); // NOI18N

        tbKhachHanf.setModel(new javax.swing.table.DefaultTableModel(
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
        tbKhachHanf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhachHanfMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKhachHanf);

        org.openide.awt.Mnemonics.setLocalizedText(btnThem, org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.btnThem.text")); // NOI18N
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(btnXoa, org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.btnXoa.text")); // NOI18N
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(btnSua, org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.btnSua.text")); // NOI18N
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(btnClear, org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.btnClear.text")); // NOI18N
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(btnSearch, org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.btnSearch.text")); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.setText(org.openide.util.NbBundle.getMessage(TryingOneForm.class, "TryingOneForm.txtSearch.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtDem, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(135, 135, 135))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSearch)
                                    .addComponent(btnThem))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnXoa)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnSua)
                                        .addGap(33, 33, 33)
                                        .addComponent(btnClear))
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbKhachHanfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhachHanfMouseClicked
        int s = tbKhachHanf.getSelectedRow();
        fillDataToTable(s);
    }//GEN-LAST:event_tbKhachHanfMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (khachHangService.checkMa(txtMa.getText())) {
            JOptionPane.showMessageDialog(this, "Mã đã tồn tại");
            return;
        }
        QLKhachHang ql = checkValidate();
        if (ql == null) {
            return;
        }

        khachHangService.them(ql);
        listQLKhachHangs = khachHangService.getList();
        showData(listQLKhachHangs);
        JOptionPane.showMessageDialog(this, "Thêm thành công");
        clearForm();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int s = tbKhachHanf.getSelectedRow();
        if (s == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 dòng để xóa");
            return;
        }
        khachHangService.xoa(listQLKhachHangs.get(s).getId());
        listQLKhachHangs.remove(s);
        listQLKhachHangs = khachHangService.getList();
        showData(listQLKhachHangs);
        JOptionPane.showMessageDialog(this, "Xóa thành công");
        clearForm();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String search = txtSearch.getText();
        listQLKhachHangs = khachHangService.getListByDiaChi(search);
        showData(listQLKhachHangs);
        if (txtSearch.getText().isEmpty()) {
            listQLKhachHangs = khachHangService.getList();
            showData(listQLKhachHangs);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int s = tbKhachHanf.getSelectedRow();
        if (s == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 dòng để sửa");
            return;
        }
        QLKhachHang qlkh = checkValidate();
        if (qlkh == null) {
            return;
        }
        QLKhachHang ql = listQLKhachHangs.get(s);
        qlkh.setId(ql.getId());
        qlkh.setMa(ql.getMa());
        khachHangService.sua(qlkh);
        listQLKhachHangs.set(s, qlkh);
        listQLKhachHangs = khachHangService.getList();
        showData(listQLKhachHangs);
        JOptionPane.showMessageDialog(this, "Sửa thành công");
        clearForm();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(TryingOneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TryingOneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TryingOneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TryingOneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TryingOneForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbKhachHanf;
    private javax.swing.JTextField txtDem;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
