/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.ChiTietSP;
import Repositories.ChiTietSanPhamRepository;
import Services.ChiTietSanPhamService;
import ViewModels.ViewModelsChiTietSanPham;
import ViewModels.ViewModelsHoaDonChiTiet;
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
    public List<ChiTietSP> getList() {
        return repository.getList();
    }

    @Override
    public List<ChiTietSP> getAll() {
        return repository.getAll();
    }

    @Override
    public ChiTietSP them(ChiTietSP ctSP) {
        return repository.them(ctSP);
    }

    @Override
    public String xoa(UUID id) {
        return repository.xoa(id);
    }

    @Override
    public String sua(ChiTietSP ctSP) {
        boolean test = repository.sua(ctSP);
        System.out.println(ctSP.getId());
        if (test) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public boolean updateSoLuong(Map<UUID, ViewModelsChiTietSanPham> mapChiTietSanPham) {
        return repository.updateSoLuong(mapChiTietSanPham);
    }
}
