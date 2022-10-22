/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.serviceImpl;

import domainModels.KhachHang;
import repositories.KhachHangRepository;
import services.KhachHangService;
import customModels.KhachHangCustom;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class KhachHangServiceImpl implements KhachHangService {

    private KhachHangRepository rp = new KhachHangRepository();

    private List<KhachHangCustom> listQLCV = new ArrayList<>();
    private List<KhachHang> list = new ArrayList<>();

    @Override
    public List<KhachHangCustom> getList() {
        return rp.getList();
    }

    @Override
    public List<KhachHangCustom> getListByDiaChi(String diaChi) {
        return rp.getListByDiaChi(diaChi);
    }

    @Override
    public void them(KhachHangCustom qlkh) {
        KhachHang kh = new KhachHang(qlkh.getMa(), qlkh.getTen(), qlkh.getTenDem(), qlkh.getHo(), (Date) qlkh.getNgaySinh(), qlkh.getSdt(), qlkh.getDiaChi(), qlkh.getThanhPho(), qlkh.getQuocGia(), qlkh.getMatKhau());
        rp.them(kh);

    }

    @Override
    public void sua(KhachHangCustom qlkh) {
        KhachHang kh = new KhachHang(qlkh.getId(), qlkh.getMa(), qlkh.getTen(), qlkh.getTenDem(), qlkh.getHo(), (Date) qlkh.getNgaySinh(), qlkh.getSdt(), qlkh.getDiaChi(), qlkh.getThanhPho(), qlkh.getQuocGia(), qlkh.getMatKhau());
        rp.sua(kh);
    }

    @Override
    public void xoa(UUID id) {
        rp.xoa(id);
    }

    @Override
    public KhachHang finID(UUID id) {
        return rp.findId(id);
    }

    @Override
    public KhachHangCustom findByMa(String ma) {
        return rp.findByMa(ma);
    }

    @Override
    public boolean checkMa(String ma) {
        return rp.checkMa(ma);
    }

}
