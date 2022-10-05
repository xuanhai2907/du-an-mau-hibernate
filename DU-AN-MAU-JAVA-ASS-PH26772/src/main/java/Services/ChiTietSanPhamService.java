/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.ChiTietSP;
import ViewModels.ViewModelsChiTietSanPham;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author window
 */
public interface ChiTietSanPhamService {

    public List<ViewModelsChiTietSanPham> getAll(String ten);

    public List<ChiTietSP> getList();

    List<ChiTietSP> getAll();

    ChiTietSP them(ChiTietSP ctSP);

    String xoa(UUID id);

    String sua(ChiTietSP ctSP);
}
