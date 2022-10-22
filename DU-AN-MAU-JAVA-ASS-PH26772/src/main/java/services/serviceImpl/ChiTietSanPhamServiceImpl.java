/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.serviceImpl;

import domainModels.ChiTietSP;
import domainModels.DongSP;
import domainModels.MauSac;
import domainModels.NSX;
import domainModels.SanPham;
import repositories.ChiTietSanPhamRepository;
import services.ChiTietSanPhamService;
import customModels.ChiTietSPCustom;
import customModels.ViewModelsChiTietSanPham;
import customModels.ViewModelsHoaDonChiTiet;
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
    public void them(ChiTietSPCustom qlctsp) {

        ChiTietSP ctsp = new ChiTietSP(qlctsp.getNamBH(), qlctsp.getMoTa(), qlctsp.getSoLuongTon(), qlctsp.getGiaNhap());
        repository.them(ctsp);
    }

    @Override
    public void sua(ChiTietSPCustom qlctsp) {
//        DongSP dsp = qlctsp.getIdDongSP();
//        MauSac ms = qlctsp.getIdMauSac();
//        NSX nsx = qlctsp.getIdNsx();
//        SanPham sp = qlctsp.getIdSP();

        ChiTietSP ctsp = new ChiTietSP(qlctsp.getId(), qlctsp.getNamBH(), qlctsp.getMoTa(), qlctsp.getSoLuongTon(), qlctsp.getGiaNhap());
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
    public List<ChiTietSPCustom> getList() {
        return repository.getList();
    }

    @Override
    public List<ChiTietSPCustom> getListByNamBH(int namBH) {
        return repository.getListByNamBH(namBH);
    }

}
