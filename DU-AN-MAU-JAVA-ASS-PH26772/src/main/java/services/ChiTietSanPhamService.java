/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainModels.ChiTietSP;
import customModels.ChiTietSPCustom;
import customModels.ViewModelsChiTietSanPham;
import customModels.ViewModelsHoaDonChiTiet;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author window
 */
public interface ChiTietSanPhamService {

    public List<ViewModelsChiTietSanPham> getAll(String ten);

    public List<ChiTietSPCustom> getList();
    
    public List<ChiTietSPCustom> getListByNamBH(int namBH);

    public boolean updateSoLuong(Map<UUID, ViewModelsChiTietSanPham> mapChiTietSanPham);

    public void them(ChiTietSPCustom qlctsp);

    public void sua(ChiTietSPCustom qlctsp);

    public void xoa(UUID id);

    public ChiTietSP findID(UUID id);
}
