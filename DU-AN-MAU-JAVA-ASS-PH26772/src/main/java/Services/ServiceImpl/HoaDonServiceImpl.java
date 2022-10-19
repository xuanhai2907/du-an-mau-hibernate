/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.HoaDon;
import DomainModels.KhachHang;
import DomainModels.NhanVien;
import Repositories.ChucVuRepository;
import Repositories.HoaDonRepository;
import Services.HoaDonService;
import ViewModels.QLHoaDon;
import ViewModels.ViewModelsHoaDon;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Acer
 */
public class HoaDonServiceImpl implements HoaDonService {

    private HoaDonRepository repo;

    public HoaDonServiceImpl() {
        repo = new HoaDonRepository();

    }

    @Override
    public HoaDon getHoaDonById(String ma) {
        return repo.getHoaDonById(ma);
    }

    @Override
    public void Insert(HoaDon hd) {
        repo.Insert(hd);
    }

    @Override
    public void Update(HoaDon hd, UUID id) {
        repo.Update(hd, id);
    }

    @Override
    public void Delete(UUID id) {
        repo.Delete(id);
    }

    @Override
    public List<QLHoaDon> getList() {
        return repo.getList();
    }

    @Override
    public List<ViewModelsHoaDon> getAll() {
        return repo.getAll();
    }

    @Override
    public boolean updateTrangThai(UUID id) {
        return repo.updateTrangThai(id);
    }

    @Override
    public void them(QLHoaDon qlhd) {
        KhachHang kh = qlhd.getIdKH();
        NhanVien nv = qlhd.getIdNV();

        HoaDon hd = new HoaDon(qlhd.getMa(), qlhd.getDiaChi(), qlhd.getSdt(), qlhd.getTenNguoiNhan(),
                qlhd.getNgayNhan(), qlhd.getNgayShip(), qlhd.getNgayTao(), qlhd.getNgayThanhToan(),
                qlhd.getTinhTrang(), kh, nv);
        repo.them(hd);
    }

    @Override
    public void sua(QLHoaDon qlhd) {
        KhachHang kh = qlhd.getIdKH();
        NhanVien nv = qlhd.getIdNV();

        HoaDon hd = new HoaDon(qlhd.getId(), qlhd.getMa(), qlhd.getNgayTao(), qlhd.getNgayThanhToan(),
                qlhd.getNgayShip(), qlhd.getNgayNhan(), qlhd.getTinhTrang(), qlhd.getTenNguoiNhan(), qlhd.getDiaChi(), qlhd.getSdt(), kh, nv);
        repo.sua(hd);
    }

    @Override
    public void xoa(UUID id) {
        repo.xoa(id);
    }

}
