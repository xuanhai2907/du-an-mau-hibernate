/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DomainModels.ChucVu;
import DomainModels.CuaHang;
import DomainModels.NhanVien;
import Services.ServiceImpl.ChucVuServiceImpl;
import Services.ServiceImpl.CuaHangServiceImpl;
import Services.ServiceImpl.NhanVienServiceImpl;
import java.awt.Color;
import java.sql.Date;
import java.util.List;
import java.util.UUID;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NhanVienForm extends javax.swing.JFrame {

    public NhanVienServiceImpl qlnv;
    CuaHangServiceImpl qlch = new CuaHangServiceImpl();
    ChucVuServiceImpl qlcv = new ChucVuServiceImpl();

    public NhanVienForm() {
        initComponents();
        qlnv = new NhanVienServiceImpl();
        this.loadCbb();
        this.loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();
        txttendem = new javax.swing.JTextField();
        txtma = new javax.swing.JTextField();
        txtho = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        txtngaysinh = new javax.swing.JTextField();
        txtten = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        cbbCuaHang = new javax.swing.JComboBox<>();
        cbbChucVu = new javax.swing.JComboBox<>();
        cbbTrangThai = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        rdonam = new javax.swing.JRadioButton();
        rdonu = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Mã");

        jLabel2.setText("Họ");

        jLabel3.setText("Tên đệm");

        jLabel4.setText("Tên");

        jLabel5.setText("Giới tính");

        jLabel6.setText("Mật khẩu");

        jLabel7.setText("Ngày sinh");

        jLabel8.setText("SÐT");

        jLabel9.setText("Cửa hàng");

        jLabel10.setText("Chức vụ");

        jLabel11.setText("Địa chỉ");

        jLabel12.setText("Trạng thái");

        txttendem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txttendemCaretUpdate(evt);
            }
        });
        txttendem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txttendemMouseExited(evt);
            }
        });

        txtma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtmaMouseExited(evt);
            }
        });

        txtho.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txthoCaretUpdate(evt);
            }
        });

        txtten.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txttenCaretUpdate(evt);
            }
        });
        txtten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txttenMouseExited(evt);
            }
        });

        txtpass.setEchoChar('*');

        cbbCuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCuaHangActionPerformed(evt);
            }
        });

        cbbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoat Dong", "Nghi" }));

        buttonGroup1.add(rdonam);
        rdonam.setText("Nam");

        buttonGroup1.add(rdonu);
        rdonu.setText("Nữ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdonam, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdonu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdonam)
                    .addComponent(rdonu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdiachi)
                    .addComponent(txtten)
                    .addComponent(txttendem)
                    .addComponent(txtho)
                    .addComponent(txtma))
                .addGap(178, 178, 178)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbbTrangThai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbbChucVu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbbCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txttendem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(37, 37, 37)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(23, 23, 23)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(cbbCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(cbbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(229, 229, 229)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(cbbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(314, 314, 314))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        btnthem.setText("THEM");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });
        jPanel1.add(btnthem);

        btnsua.setText("SUA");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnsua);

        btnxoa.setText("XOA");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnxoa);

        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(417, 417, 417))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttendemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txttendemCaretUpdate
        // TODO add your handling code here:
//        if (txttendem.getText().isEmpty()) {
//            return;
//        }
//        txtma.setText(utilities.Utility.layChuCaiDau(txtho.getText()) + utilities.Utility.zenma(txttendem.getText()));
    }//GEN-LAST:event_txttendemCaretUpdate

    private void txttendemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttendemMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txttendemMouseExited

    private void txtmaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmaMouseExited
        // TODO add your handling code here:
        //txtma.setText(utilities.Utility.layten(txtten.getText())+utilities.Utility.layChuCaiDau(txtho.getText())+utilities.Utility.zenma(txttendem.getText()));
    }//GEN-LAST:event_txtmaMouseExited

    private void txthoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txthoCaretUpdate
        // TODO add your handling code here:
//        if (txtho.getText().isEmpty()) {
//            return;
//        }
//        txtma.setText(utilities.Utility.layChuCaiDau(txtho.getText()) + "");
    }//GEN-LAST:event_txthoCaretUpdate

    private void txttenCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txttenCaretUpdate
        // TODO add your handling code here:
        //hien thi len ma
        if (txtten.getText().isEmpty()) {
            return;
        }
        //   txtma.setText(utilities.Utility.layten(txtten.getText()) + utilities.Utility.layChuCaiDau(txtho.getText()) + utilities.Utility.zenma(txttendem.getText()));
    }//GEN-LAST:event_txttenCaretUpdate

    private void txttenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttenMouseExited
        // TODO add your handling code here:
        //nhap ten hien thi o tren ma
        if (txtten.getText().isEmpty()) {
            return;
        }
        //     txtten.setText(utilities.Utility.layten(txtten.getText()).trim());
    }//GEN-LAST:event_txttenMouseExited

    private void cbbCuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCuaHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbCuaHangActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        NhanVien nv = this.getFormData();
        if (nv == null) {
            return;
        }
        List<NhanVien> lsnv = this.qlnv.getList();
        for (NhanVien x : lsnv) {
            if (x.getMa().equals(nv.getMa())) {
                JOptionPane.showMessageDialog(this, "Ma nhan vien  bi trung");
                return;
            }
        }
        this.qlnv.Insert(nv);
        this.clearForm();
        this.loadTable();
        JOptionPane.showMessageDialog(this, "Them thanh cong!");

    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        NhanVien nv = this.getFormData();
        int row = this.tblNhanVien.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Ban phai chon mot dong");
            return;
        }
        if (nv == null) {
            return;
        }
        UUID id = null;
        String ma = this.tblNhanVien.getValueAt(row, 1).toString();
        List<NhanVien> lsnv = this.qlnv.getList();
        for (NhanVien nhanVien : lsnv) {
            if (nhanVien.getMa().equalsIgnoreCase(ma)) {
                id = nhanVien.getId();
                break;
            }
        }
        nv.setId(id);
        this.qlnv.Update(nv);
        this.loadTable();
        this.clearForm();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        int row = this.tblNhanVien.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Ban phai chon mot dong");
            return;
        }
        NhanVien id = null;
        String ma = this.tblNhanVien.getValueAt(row, 1).toString();
        List<NhanVien> lsnv = this.qlnv.getList();
        for (NhanVien nhanVien : lsnv) {
            if (nhanVien.getMa().equalsIgnoreCase(ma)) {
                id = nhanVien;
                break;
            }

        }
        this.qlnv.Delete(id);
        this.loadTable();
    }//GEN-LAST:event_btnxoaActionPerformed


    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnclearActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        int row = this.tblNhanVien.getSelectedRow();
        if (row == -1) {
            return;
        }
        String ma = this.tblNhanVien.getValueAt(row, 1).toString();
        String tendaydu = this.tblNhanVien.getValueAt(row, 2).toString();
        String gt = this.tblNhanVien.getValueAt(row, 3).toString();
        String ngaysinh = this.tblNhanVien.getValueAt(row, 4).toString();
        String diachi = this.tblNhanVien.getValueAt(row, 5).toString();
        String sdt = this.tblNhanVien.getValueAt(row, 6).toString();
        String matkhau = this.tblNhanVien.getValueAt(row, 7).toString();
        String tencuahang = this.tblNhanVien.getValueAt(row, 8).toString();
        String tenchucvu = this.tblNhanVien.getValueAt(row, 9).toString();
        String trangthai = this.tblNhanVien.getValueAt(row, 10).toString();

        this.txtma.setText(ma);
        this.txtdiachi.setText(diachi);
        this.txtngaysinh.setText(ngaysinh);
        this.txtpass.setText(matkhau);
        this.txtsdt.setText(sdt);
        this.cbbTrangThai.setSelectedItem(trangthai);
        String[] splits = tendaydu.split(" ");
        String part1 = splits[0];
        String part2 = splits[1];
        String part3 = splits[2];
        if (gt.equalsIgnoreCase("Nam")) {
            this.rdonam.setSelected(true);
        } else {
            this.rdonu.setSelected(true);
        }
        String maCh = null;
        List<CuaHang> lsCh = this.qlch.getAll();
        for (CuaHang cuaHang : lsCh) {
            if (tencuahang.equalsIgnoreCase(cuaHang.getTen())) {
                maCh = cuaHang.getMa();
            }
        }
        String maCv = null;
        List<ChucVu> lsCv = this.qlcv.getList();
        for (ChucVu chucVu : lsCv) {
            if (tenchucvu.equalsIgnoreCase(chucVu.getTen())) {
                maCv = chucVu.getMa();
            }

        }
        this.txtho.setText(part1);
        this.txttendem.setText(part2);
        this.txtten.setText(part3);
        this.cbbCuaHang.setSelectedItem(maCh);
        this.cbbChucVu.setSelectedItem(maCv);
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private NhanVien getFormData() {
        String ma = this.txtma.getText();
        String ho = this.txtho.getText();
        String tendem = this.txttendem.getText();
        String ten = this.txtten.getText();
        String ngsinh = this.txtngaysinh.getText();
        String diaChi = this.txtdiachi.getText();
        String sdt = this.txtsdt.getText();
        String matKhau = this.txtpass.getPassword().toString();
        String maCH = this.cbbCuaHang.getSelectedItem().toString();
        String maCV = this.cbbChucVu.getSelectedItem().toString();
        String trangThai = this.cbbTrangThai.getSelectedItem().toString();
        String gt = this.rdonam.isSelected() ? "Nam" : "Nu";

        if (ma.trim().length() == 0 || ho.trim().length() == 0 || tendem.trim().length() == 0 || ten.trim().length() == 0 || ngsinh.trim().length() == 0 || diaChi.trim().length() == 0 || sdt.trim().length() == 0 || matKhau.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Khong duoc de trong thong tin nao!");
            return null;
        }
        Date ngaySing = null;
        try {
            ngaySing = Date.valueOf(ngsinh);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sai dinh dang ngay thang!");
            e.printStackTrace();
        }
        int tt;
        if (trangThai.equalsIgnoreCase("Hoat Dong")) {
            tt = 0;
        } else {
            tt = 1;
        }

        CuaHang ch = null;
        List<CuaHang> lsch = qlch.getAll();
        for (CuaHang cuaHang : lsch) {

            if (maCH.equalsIgnoreCase(cuaHang.getMa())) {
                ch = cuaHang;
            }
        }
        ChucVu cv = null;
        List<ChucVu> lscv = qlcv.getList();
        for (ChucVu chucVu : lscv) {
            if (maCV.equalsIgnoreCase(chucVu.getMa())) {
                cv = chucVu;
            }
        }
        NhanVien nv = new NhanVien();
        nv.setId(nv.getId());
        nv.setMa(ma);
        nv.setTen(ten);
        nv.setHo(ho);
        nv.setTenDem(tendem);
        nv.setGioiTinh(gt);
        nv.setNgaySinh(ngaySing);
        nv.setDiaChi(diaChi);
        nv.setSdt(sdt);
        nv.setIdCH(ch);
        nv.setIdCV(cv);
        nv.setIdGuiBC(nv);
        nv.setMatKhau(matKhau);
        nv.setTrangThai(tt);

        System.out.println(nv.getIdGuiBC().getMa());
        return nv;
    }

    private void clearForm() {
        this.txtdiachi.setText("");
        this.txtho.setText("");
        this.txtma.setText("");
        this.txtngaysinh.setText("");
        this.txtpass.setText("");
        this.txtsdt.setText("");
        this.txtten.setText("");
        this.txttendem.setText("");
        this.rdonam.setSelected(true);
        this.cbbChucVu.setSelectedIndex(0);
        this.cbbCuaHang.setSelectedIndex(0);
        this.cbbTrangThai.setSelectedIndex(0);

    }

    private void loadCbb() {

        List<CuaHang> listch = qlch.getAll();
        for (CuaHang cuaHang : listch) {
            String ma = "";
            ma = cuaHang.getMa();
            this.cbbCuaHang.addItem(ma);
        }
        List<ChucVu> listcv = qlcv.getList();
        for (ChucVu chucVu : listcv) {
            String ma = "";
            ma = chucVu.getMa();
            this.cbbChucVu.addItem(ma);
        }

    }

    private void loadTable() {
        DefaultTableModel dtm = (DefaultTableModel) this.tblNhanVien.getModel();
        dtm.setRowCount(0);
        List<NhanVien> nv = this.qlnv.getList();
        int i = 1;
        for (NhanVien nhanVien : nv) {
            Object[] dataRow = {
                i++,
                nhanVien.getMa(),
                nhanVien.getHo() + " " + nhanVien.getTenDem() + " " + nhanVien.getTen(),
                nhanVien.getGioiTinh(),
                nhanVien.getNgaySinh(),
                nhanVien.getDiaChi(),
                nhanVien.getSdt(),
                nhanVien.getMatKhau(),
                nhanVien.getIdCH().getTen(),
                nhanVien.getIdCV().getTen(),
                nhanVien.getTrangThai() == 0 ? "Hoat Dong" : "Nghi"
            };
            dtm.addRow(dataRow);
        }

    }

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
            java.util.logging.Logger.getLogger(NhanVienForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbChucVu;
    private javax.swing.JComboBox<String> cbbCuaHang;
    private javax.swing.JComboBox<String> cbbTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdonam;
    private javax.swing.JRadioButton rdonu;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtho;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txtten;
    private javax.swing.JTextField txttendem;
    // End of variables declaration//GEN-END:variables
}
