/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import DomainModels.ChiTietSP;
import DomainModels.DongSP;
import DomainModels.MauSac;
import DomainModels.NSX;
import DomainModels.SanPham;
import Services.*;
import Services.ServiceImpl.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MMC
 */
public class FormChiTietSP extends javax.swing.JFrame {

    private DefaultTableModel dtm = new DefaultTableModel();
    private DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
    private List<ChiTietSP> listCT = new ArrayList<>();
    private ChiTietSanPhamService serviceCT = new ChiTietSanPhamServiceImpl();
    private List<DongSP> listDSP = new ArrayList<>();
    private DongSPService serviceDSP = new DongSPServiceImpl();
    private List<MauSac> listMS = new ArrayList<>();
    private MauSacService serviceMS = new MauSacServiceImpl();
    private List<NSX> listNSX = new ArrayList<>();
    private NSXService serviceNSX = new NSXServiceImpl();
    private List<SanPham> listSP = new ArrayList<>();
    private SanPhamService serviceSP = new SanPhamServiceImpl();

    public FormChiTietSP() {
        initComponents();
        jTable1.setModel(dtm);

        String[] headers = {"ID", "GiaBan", "GiaNhap", "MoTa", "NamBH", "SoLuongTon", "TenDSP", "TenMS", "TenNSX", "TenSP",};
        dtm.setColumnIdentifiers(headers);
        listCT = serviceCT.getAll();
        loadCBBSp();
        LoadCbbDongSP();
        loadCbbNSX();
        loadCbbMauSac();

        showData(listCT);
    }

    public void loadCbbNSX() {

        List<NSX> listSX = serviceNSX.getAll();
        for (NSX nsx : listSX) {
            this.cbbNSX.addItem(nsx.getTen());
        }

    }

    public void loadCBBSp() {
        List<SanPham> listP = serviceSP.getAll();
        for (SanPham sanPham : listP) {
            this.cbbSP.addItem(sanPham.getTen());
        }
    }

    public void LoadCbbDongSP() {
        List<DongSP> listD = serviceDSP.getAll();
        for (DongSP list : listD) {

            cbbDongSP.addItem(list.getTen());

        }

    }

    public void loadCbbMauSac() {
        List<MauSac> listM = serviceMS.getAll();
        for (MauSac mauSac : listM) {
            cbbMauSac.addItem(mauSac.getTen());
        }

    }

    public void showData(List<ChiTietSP> list) {
        dtm.setRowCount(0);
        for (ChiTietSP chiTietSP : list) {
            dtm.addRow(chiTietSP.toRowData());
        }
    }

    public void fillData(int i) {
        ChiTietSP sp = listCT.get(i);
        lblID.setText(String.valueOf(sp.getId()));

        txtGiaBan.setText(String.valueOf(sp.getGiaBan()));
        txtGiaNhap.setText(String.valueOf(sp.getGiaNhap()));
        txtMoTa.setText(sp.getMoTa());
        txtNamBH.setText(String.valueOf(sp.getNamBH()));
        txtSoLuongTon.setText(String.valueOf(sp.getSoLuongTon()));

        String maD = sp.getIdDongSP().getTen();
        cbbDongSP.setSelectedItem(maD);

        String maMS = sp.getIdMauSac().getTen();
        cbbMauSac.setSelectedItem(maMS);

        String maNSX = sp.getIdNsx().getTen();
        cbbNSX.setSelectedItem(maNSX);

        String maSP = sp.getIdSP().getTen();
        cbbSP.setSelectedItem(maSP);

//        BigDecimal giaNhap = BigDecimal.valueOf(Double.parseDouble(txtGiaNhap.getText()));
//        BigDecimal giaBan = BigDecimal.valueOf(Double.parseDouble(txtGiaBan.getText()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNamBH = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSoLuongTon = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtGiaNhap = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMoTa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbbSP = new javax.swing.JComboBox<>();
        cbbNSX = new javax.swing.JComboBox<>();
        cbbMauSac = new javax.swing.JComboBox<>();
        cbbDongSP = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CHI TIẾT SẢN PHẨM");

        jLabel2.setText("ID:");

        lblID.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("SanPham:");

        jLabel5.setText("NSX:");

        jLabel6.setText("MauSac:");

        jLabel7.setText("DongSP:");

        jLabel8.setText("NamBH:");

        jLabel9.setText("SoLuongTon:");

        jLabel10.setText("GiaNhap:");

        jLabel11.setText("MoTa:");

        jLabel12.setText("GiaBan:");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(251, 251, 251))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtMoTa, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbbMauSac, javax.swing.GroupLayout.Alignment.LEADING, 0, 139, Short.MAX_VALUE)
                                        .addComponent(cbbNSX, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbbSP, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(103, 103, 103)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNamBH)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbbDongSP, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSoLuongTon)))
                                .addGap(45, 45, 45))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtGiaNhap)
                                            .addComponent(txtGiaBan, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSua)
                                        .addGap(79, 79, 79)
                                        .addComponent(btnXoa)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbbDongSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtNamBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(txtSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int chon = jTable1.getSelectedRow();
        fillData(chon);
    }//GEN-LAST:event_jTable1MouseClicked
    private ChiTietSP checkAdd() {

        String nam = txtNamBH.getText();
        if (nam.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Năm không được để trống dữ liệu.");
            return null;
        }
        String moTa = txtMoTa.getText();
        if (moTa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mô tả không được để trống dữ liệu.");
            return null;
        }
        String soLuong = txtSoLuongTon.getText();
        if (soLuong.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số lượng không được để trống dữ liệu.");
            return null;
        }
        String giaNhapp = txtGiaNhap.getText();
        if (giaNhapp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giá nhập không được để trống dữ liệu.");
            return null;
        }
        String giaBann = txtGiaBan.getText();
        if (giaBann.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giá bán không được để trống dữ liệu.");
            return null;
        }
        BigDecimal giaNhap = BigDecimal.valueOf(Double.parseDouble(txtGiaNhap.getText()));
        BigDecimal giaBan = BigDecimal.valueOf(Double.parseDouble(txtGiaBan.getText()));

        String dSP = cbbDongSP.getSelectedItem().toString();
        String mauSac = cbbMauSac.getSelectedItem().toString();
        String nsx = cbbNSX.getSelectedItem().toString();
        String sp = cbbSP.getSelectedItem().toString();

//        ChiTietSP ctSP = new ChiTietSP(giaBan, giaNhap, moTa, Integer.parseInt(nam), Integer.parseInt(soLuong), dSP, mauSac, nsx, sp);
        DongSP dongSp = null;
        List<DongSP> ls = serviceDSP.getAll();
        for (DongSP l : ls) {
            if(l.getTen().equalsIgnoreCase(dSP)){
                dongSp=l;
            }
            
        }
        NSX nhaSanXuat = null;
        List<NSX> ls1 = serviceNSX.getAll();
        for (NSX l : ls1) {
            if(l.getTen().equalsIgnoreCase(nsx)){
                nhaSanXuat=l;
            }
            
        }
        MauSac ms = null;
        List<MauSac> ls2 = serviceMS.getAll();
        for (MauSac l : ls2) {
            if(l.getTen().equalsIgnoreCase(mauSac)){
                ms=l;
            }
            
        }
        SanPham sanPham = null;
        List<SanPham> ls3 = serviceSP.getAll();
        for (SanPham l : ls3) {
            if(l.getTen().equalsIgnoreCase(sp)){
                sanPham=l;
            }
            
        }
        
        
        ChiTietSP ctSP = new ChiTietSP(giaBan, giaNhap,moTa, Integer.parseInt(nam), Integer.parseInt(soLuong), 
                dongSp,
                ms, nhaSanXuat, sanPham);
        return ctSP;
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        ChiTietSP ctSP = checkAdd();
        if (ctSP == null) {
            return;
        }
        JOptionPane.showMessageDialog(this, serviceCT.them(ctSP));

        listCT = serviceCT.getAll();
        showData(listCT);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String id = lblID.getText();
        String tenD = cbbDongSP.getSelectedItem().toString();
        String tenM = cbbMauSac.getSelectedItem().toString();
        String tenNSX = cbbNSX.getSelectedItem().toString();
        String tenSP = cbbSP.getSelectedItem().toString();
        String moTa = txtMoTa.getText();
        String nam = txtNamBH.getText();
        String soLuong = txtSoLuongTon.getText();
        BigDecimal giaNhap = BigDecimal.valueOf(Double.parseDouble(txtGiaNhap.getText()));
        BigDecimal giaBan = BigDecimal.valueOf(Double.parseDouble(txtGiaBan.getText()));
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa chọn dữ liệu.");
        } else {
            DongSP dSP = new DongSP(tenD);
            MauSac mauSac = new MauSac(tenM);
            NSX nsx = new NSX(tenNSX);
            SanPham sp = new SanPham(tenSP);
            //ChiTietSP ctSP = new ChiTietSP(UUID.fromString(id), sp, nsx, mauSac, dSP, Integer.parseInt(nam), moTa, Integer.parseInt(soLuong), giaNhap, giaBan);
            ChiTietSP ctSP = new ChiTietSP(UUID.fromString(id), sp, nsx, mauSac, dSP, Integer.parseInt(nam), moTa, Integer.parseInt(soLuong), giaNhap, giaBan);
            JOptionPane.showMessageDialog(this, serviceCT.xoa(ctSP, moTa));
            listCT = serviceCT.getAll();
            showData(listCT);
        }
    }//GEN-LAST:event_btnXoaActionPerformed
    private ChiTietSP checkUpdate() {
        String id = lblID.getText();
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chọn một cái để sửa.");
            return null;
        }

        String nam = txtNamBH.getText();
        if (nam.isEmpty()) {
            JOptionPane.showMessageDialog(this, "không được để trống dữ liệu.");
            return null;
        }
        String moTa = txtMoTa.getText();
        if (moTa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "không được để trống dữ liệu.");
            return null;
        }
        String soLuong = txtSoLuongTon.getText();
        if (soLuong.isEmpty()) {
            JOptionPane.showMessageDialog(this, "không được để trống dữ liệu.");
            return null;
        }
        String giaNhapp = txtGiaNhap.getText();
        if (giaNhapp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "không được để trống dữ liệu.");
            return null;
        }
        String giaBann = txtGiaBan.getText();
        if (giaBann.isEmpty()) {
            JOptionPane.showMessageDialog(this, "không được để trống dữ liệu.");
            return null;
        }
        BigDecimal giaNhap = BigDecimal.valueOf(Double.parseDouble(txtGiaNhap.getText()));
        BigDecimal giaBan = BigDecimal.valueOf(Double.parseDouble(txtGiaBan.getText()));

        String maD = cbbDongSP.getSelectedItem().toString();
        String maM = cbbMauSac.getSelectedItem().toString();
        String maNSX = cbbNSX.getSelectedItem().toString();
        String maSP = cbbSP.getSelectedItem().toString();
        SanPham sp = new SanPham(maSP);
        NSX nsx = new NSX(maNSX);
        MauSac mauSac = new MauSac(maM);
        DongSP dSP = new DongSP(maD);
//        ChiTietSP ctSP = new ChiTietSP(UUID.fromString(id), giaBan, giaNhap, moTa, Integer.parseInt(nam), Integer.parseInt(soLuong), dSP, mauSac, nsx, sp);
        ChiTietSP ctSP = new ChiTietSP(UUID.fromString(id), sp, nsx, mauSac, dSP, Integer.parseInt(nam), moTa, Integer.parseInt(soLuong), giaNhap, giaBan);
        return ctSP;
    }
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        ChiTietSP ct = checkUpdate();
        if (ct == null) {
            return;
        }
        JOptionPane.showMessageDialog(this, serviceCT.sua(ct));
        listCT = serviceCT.getAll();
        showData(listCT);
    }//GEN-LAST:event_btnSuaActionPerformed

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
            java.util.logging.Logger.getLogger(FormChiTietSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormChiTietSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormChiTietSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormChiTietSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormChiTietSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbDongSP;
    private javax.swing.JComboBox<String> cbbMauSac;
    private javax.swing.JComboBox<String> cbbNSX;
    private javax.swing.JComboBox<String> cbbSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblID;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtNamBH;
    private javax.swing.JTextField txtSoLuongTon;
    // End of variables declaration//GEN-END:variables
}
