    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.serviceImpl;

import domainModels.NhanVien;
import repositories.NhanVienRepository;
import services.NhanVienService;
import customModels.NhanVienCustom;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author window
 */
public class NhanVienServiceImpl implements NhanVienService {

    private NhanVienRepository rp;

    private List<NhanVienCustom> listQLNV = new ArrayList<>();
    private List<NhanVien> list = new ArrayList<>();

    public NhanVienServiceImpl() {
        rp = new NhanVienRepository();
    }

    @Override
    public NhanVien getNhanVienByMa(String ma) {
        return rp.getNhanVienByMa(ma);
    }

    @Override
    public NhanVien getNhanVienById(String ma) {
        return rp.getNhanVienById(ma);
    }

    @Override
    public List<NhanVienCustom> getList() {
        return rp.getList();
    }

    @Override
    public void them(NhanVienCustom qlnv) {
//        listQLNV = rp.getList();
//        for (NhanVienCustom qLNhanVien : listQLNV) {
//            if (qLNhanVien.getMa().equals(qlnv.getMa())) {
//                return "Mã trùng";
//            }
//        }

        NhanVien nv = new NhanVien(qlnv.getMa(), qlnv.getTen(), qlnv.getTenDem(), qlnv.getHo(), qlnv.getGioiTinh(), qlnv.getNgaySinh(), qlnv.getSdt(), qlnv.getMatkhau(), qlnv.getDiaChi(), qlnv.getTrangThai());
        rp.them(nv);
    }

    @Override
    public void sua(NhanVienCustom qlnv) {
//        listQLNV = rp.getList();
//        for (NhanVienCustom qLNhanVien : listQLNV) {
//            if (qLNhanVien.getMa().equals(qlnv.getMa())) {
//                return "Mã trùng";
//            }
//        }
        NhanVien nv = new NhanVien(qlnv.getId(), qlnv.getMa(), qlnv.getTen(), qlnv.getTenDem(), qlnv.getHo(), qlnv.getGioiTinh(), qlnv.getNgaySinh(), qlnv.getSdt(), qlnv.getMatkhau(), qlnv.getDiaChi(), qlnv.getTrangThai());
        rp.sua(nv);
    }

    @Override
    public void xoa(UUID id) {
        rp.xoa(id);
    }

    @Override
    public NhanVien finID(UUID id) {
        return rp.findId(id);
    }

    @Override
    public boolean checkMa(String ma) {
        return rp.checkMa(ma);
    }

    @Override
    public List<NhanVienCustom> getListBySdt(String sdt) {
        return rp.getListBySdt(sdt);
    }
        @Override
    public List<NhanVienCustom> getListByGioiTinh(String gt) {
        return rp.getListByGioiTinh(gt);
    }
        @Override
    public List<NhanVienCustom> getListByMa1(String ma) {
        return rp.getListByMa1(ma);
    }
}
