/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.serviceImpl;

import domainModels.HoaDon;
import domainModels.KhachHang;
import domainModels.NhanVien;
import repositories.ChucVuRepository;
import repositories.HoaDonRepository;
import services.HoaDonService;
import customModels.HoaDonCustom;
import customModels.ViewModelsHoaDon;
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
    public List<HoaDonCustom> getList() {
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
    public void them(HoaDonCustom qlhd) {
        KhachHang kh = qlhd.getIdKH();
        NhanVien nv = qlhd.getIdNV();

        HoaDon hd = new HoaDon(qlhd.getMa(), qlhd.getDiaChi(), qlhd.getSdt(), qlhd.getTenNguoiNhan(),
                qlhd.getNgayNhan(), qlhd.getNgayShip(), qlhd.getNgayTao(), qlhd.getNgayThanhToan(),
                qlhd.getTinhTrang(), kh, nv);
        repo.them(hd);
    }

    @Override
    public void sua(HoaDonCustom qlhd) {
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
