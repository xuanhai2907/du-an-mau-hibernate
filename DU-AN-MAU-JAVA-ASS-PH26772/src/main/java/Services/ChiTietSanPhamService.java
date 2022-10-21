/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.ChiTietSP;
import ViewModels.QLChiTietSP;
import ViewModels.ViewModelsChiTietSanPham;
import ViewModels.ViewModelsHoaDonChiTiet;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author window
 */
public interface ChiTietSanPhamService {

    public List<ViewModelsChiTietSanPham> getAll(String ten);

    public List<QLChiTietSP> getList();

    public boolean updateSoLuong(Map<UUID, ViewModelsChiTietSanPham> mapChiTietSanPham);

    public void them(QLChiTietSP qlctsp);

    public void sua(QLChiTietSP qlctsp);

    public void xoa(UUID id);

    public ChiTietSP findID(UUID id);
}
