/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import domainModels.ChiTietSP;
import domainModels.DongSP;
import domainModels.NSX;
import services.DongSPService;
import services.serviceImpl.DongSPServiceImpl;
import utilities.MaTuTang;
import customModels.DongSPCustom;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DongSPForm extends javax.swing.JFrame {
    
    private List<DongSPCustom> listQLDongSP = new ArrayList<>();
    private DefaultTableModel model = new DefaultTableModel();
    private DongSPService dongSPService = new DongSPServiceImpl();
    
    public DongSPForm() {
        initComponents();
        tbDongSanPham.setModel(model);
        String[] hearder = {"ID", "Mã", "Tên"};
        model.setColumnIdentifiers(hearder);
        listQLDongSP = dongSPService.getAll();
        showData(listQLDongSP);
    }
    
    public void showData(List<DongSPCustom> list) {
        model.setRowCount(0);
        for (DongSPCustom qLDongSP : list) {
            model.addRow(qLDongSP.toRowData());
        }
    }
    
    public void fillDataToTable(int index) {
        DongSPCustom qldps = listQLDongSP.get(index);
        lblID.setText(String.valueOf(qldps.getId()));
        txtMa.setText(qldps.getMa());
        txtTen.setText(qldps.getTen());
    }
    
    public DongSPCustom checkValidate() {
        String ten = txtTen.getText();
        String ma = txtMa.getText();
        if (ten.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên không được bỏ trống");
            return null;
        }
        DongSPCustom qldsp = new DongSPCustom();
        qldsp.setMa(MaTuTang.gen("DSP"));
        qldsp.setTen(ten);
        return qldsp;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDongSanPham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(DongSPForm.class, "DongSPForm.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(DongSPForm.class, "DongSPForm.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lblID, org.openide.util.NbBundle.getMessage(DongSPForm.class, "DongSPForm.lblID.text")); // NOI18N
        lblID.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(DongSPForm.class, "DongSPForm.jLabel4.text")); // NOI18N

        txtMa.setText(org.openide.util.NbBundle.getMessage(DongSPForm.class, "DongSPForm.txtMa.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(DongSPForm.class, "DongSPForm.jLabel5.text")); // NOI18N

        txtTen.setText(org.openide.util.NbBundle.getMessage(DongSPForm.class, "DongSPForm.txtTen.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(btnThem, org.openide.util.NbBundle.getMessage(DongSPForm.class, "DongSPForm.btnThem.text")); // NOI18N
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(btnSua, org.openide.util.NbBundle.getMessage(DongSPForm.class, "DongSPForm.btnSua.text")); // NOI18N
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(btnXoa, org.openide.util.NbBundle.getMessage(DongSPForm.class, "DongSPForm.btnXoa.text")); // NOI18N
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tbDongSanPham.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDongSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDongSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDongSanPham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMa)
                                    .addComponent(txtTen)
                                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnThem)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnThem)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSua)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        
        DongSPCustom ql = checkValidate();
        if (ql == null) {
            return;
            
        }
        dongSPService.them(ql);
        listQLDongSP.clear();
        listQLDongSP = dongSPService.getAll();
        showData(listQLDongSP);
        JOptionPane.showMessageDialog(this, "Thêm thành công");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int s = tbDongSanPham.getSelectedRow();
        if (s == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 dòng để sửa");
            return;
        }
        DongSPCustom ql = checkValidate();
        if (ql == null) {
            return;
        }
        DongSPCustom qldsp = listQLDongSP.get(s);
        ql.setId(qldsp.getId());
        ql.setMa(qldsp.getMa());
        dongSPService.sua(ql);
        listQLDongSP = dongSPService.getAll();
        showData(listQLDongSP);
        JOptionPane.showMessageDialog(this, "Sửa thành công");
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int s = tbDongSanPham.getSelectedRow();
        if (s == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 dòng để xóa");
            return;
        }
        dongSPService.xoa(listQLDongSP.get(s).getId());
        listQLDongSP.remove(s);
        showData(listQLDongSP);
        JOptionPane.showMessageDialog(this, "Xóa thành công");

    }//GEN-LAST:event_btnXoaActionPerformed

    private void tbDongSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDongSanPhamMouseClicked
       int s = tbDongSanPham.getSelectedRow();
        fillDataToTable(s);
    }//GEN-LAST:event_tbDongSanPhamMouseClicked
    
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
            java.util.logging.Logger.getLogger(DongSPForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DongSPForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DongSPForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DongSPForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DongSPForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JTable tbDongSanPham;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
