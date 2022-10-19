/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.ChucVu;
import DomainModels.CuaHang;
import DomainModels.NhanVien;
import Repositories.NhanVienRepository;
import Services.NhanVienService;
import ViewModels.QLNhanVien;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author window
 */
public class NhanVienServiceImpl implements NhanVienService {

    private NhanVienRepository rp;

    private List<QLNhanVien> listQLNV = new ArrayList<>();
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
    public List<QLNhanVien> getList() {
        list = rp.getList();
        for (NhanVien nhanVien : list) {
            QLNhanVien qlcv = new QLNhanVien(nhanVien.getId(),
                    nhanVien.getMa(), nhanVien.getTen(),
                    nhanVien.getTenDem(), nhanVien.getHo(),
                    nhanVien.getGioiTinh(), nhanVien.getNgaySinh(),
                    nhanVien.getSdt(), nhanVien.getMatKhau(),
                    nhanVien.getDiaChi(), nhanVien.getIdCH(),
                    nhanVien.getIdCV(), nhanVien.getTrangThai());
            listQLNV.add(qlcv);
        }
        return listQLNV;
    }

    @Override
    public void them(QLNhanVien qlnv) {
        CuaHang ch = qlnv.getIdCH();
        ChucVu cv = qlnv.getIdCV();

        NhanVien nv = new NhanVien(qlnv.getMa(), qlnv.getTen(), qlnv.getTenDem(), qlnv.getHo(), qlnv.getGioiTinh(), qlnv.getNgaySinh(), qlnv.getSdt(), qlnv.getMatkhau(), qlnv.getDiaChi(), ch, cv, qlnv.getTrangThai());
        rp.them(nv);
    }

    @Override
    public void sua(QLNhanVien qlnv) {
        CuaHang ch = qlnv.getIdCH();
        ChucVu cv = qlnv.getIdCV();
        NhanVien nv = new NhanVien(qlnv.getId(), qlnv.getMa(), qlnv.getTen(), qlnv.getTenDem(), qlnv.getHo(), qlnv.getGioiTinh(), qlnv.getNgaySinh(), qlnv.getSdt(), qlnv.getMatkhau(), qlnv.getDiaChi(), ch, cv, qlnv.getTrangThai());
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
}
