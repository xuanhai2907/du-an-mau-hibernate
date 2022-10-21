/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.KhachHang;
import Repositories.KhachHangRepository;
import Services.KhachHangService;
import ViewModels.QLKhachHang;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class KhachHangServiceImpl implements KhachHangService {

    private KhachHangRepository rp = new KhachHangRepository();

    private List<QLKhachHang> listQLCV = new ArrayList<>();
    private List<KhachHang> list = new ArrayList<>();

    @Override
    public List<QLKhachHang> getList() {
        return rp.getList();
    }

    @Override
    public List<QLKhachHang> getListByDiaChi(String diaChi) {
        return rp.getListByDiaChi(diaChi);
    }

    @Override
    public void them(QLKhachHang qlkh) {
        KhachHang kh = new KhachHang(qlkh.getMa(), qlkh.getTen(), qlkh.getTenDem(), qlkh.getHo(), (Date) qlkh.getNgaySinh(), qlkh.getSdt(), qlkh.getDiaChi(), qlkh.getThanhPho(), qlkh.getQuocGia(), qlkh.getMatKhau());
        rp.them(kh);

    }

    @Override
    public void sua(QLKhachHang qlkh) {
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
    public QLKhachHang findByMa(String ma) {
        return rp.findByMa(ma);
    }

    @Override
    public boolean checkMa(String ma) {
        return rp.checkMa(ma);
    }

}
