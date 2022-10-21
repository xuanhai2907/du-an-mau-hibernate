/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.ChiTietSP;
import DomainModels.DongSP;
import DomainModels.MauSac;
import DomainModels.NSX;
import DomainModels.SanPham;
import Repositories.ChiTietSanPhamRepository;
import Services.ChiTietSanPhamService;
import ViewModels.QLChiTietSP;
import ViewModels.ViewModelsChiTietSanPham;
import ViewModels.ViewModelsHoaDonChiTiet;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {

    private ChiTietSanPhamRepository repository;

    public ChiTietSanPhamServiceImpl() {
        this.repository = new ChiTietSanPhamRepository();
    }

    @Override
    public List<ViewModelsChiTietSanPham> getAll(String ten) {
        return repository.getAll(ten);
    }

    @Override
    public boolean updateSoLuong(Map<UUID, ViewModelsChiTietSanPham> mapChiTietSanPham) {
        return repository.updateSoLuong(mapChiTietSanPham);
    }

    @Override
    public void them(QLChiTietSP qlctsp) {
        DongSP dsp = qlctsp.getIdDongSP();
        MauSac ms = qlctsp.getIdMauSac();
        NSX nsx = qlctsp.getIdNsx();
        SanPham sp = qlctsp.getIdSP();

        ChiTietSP ctsp = new ChiTietSP(qlctsp.getGiaBan(), qlctsp.getGiaNhap(), qlctsp.getMoTa(),
                qlctsp.getNamBH(), qlctsp.getSoLuongTon(), dsp, ms, nsx, sp);
        repository.them(ctsp);
    }

    @Override
    public void sua(QLChiTietSP qlctsp) {
        DongSP dsp = qlctsp.getIdDongSP();
        MauSac ms = qlctsp.getIdMauSac();
        NSX nsx = qlctsp.getIdNsx();
        SanPham sp = qlctsp.getIdSP();

        ChiTietSP ctsp = new ChiTietSP(qlctsp.getId(), sp, nsx, ms, dsp, qlctsp.getNamBH(), qlctsp.getMoTa(), qlctsp.getSoLuongTon(), qlctsp.getGiaBan(), qlctsp.getGiaNhap());
        repository.sua(ctsp);
    }

    @Override
    public void xoa(UUID id) {
        repository.xoa(id);
    }

    @Override
    public ChiTietSP findID(UUID id) {
        return repository.findId(id);
    }

    @Override
    public List<QLChiTietSP> getList() {
        return repository.getList();
    }

}
