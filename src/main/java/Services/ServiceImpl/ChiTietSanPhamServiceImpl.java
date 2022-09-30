/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.ChiTietSP;
import Repositories.ChiTietSanPhamRepository;
import Services.ChiTietSanPhamService;
import ViewModels.ViewModelsChiTietSanPham;
import java.util.List;

/**
 *
 * @author window
 */
public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService{

//    private ChiTietSanPhamRepository re;
//    
//    public ChiTietSanPhamServiceImpl() {
//        this.re = new ChiTietSanPhamRepository();
//    }
    
    @Override
    public List<ViewModelsChiTietSanPham> getAll(String ten) {
        return new ChiTietSanPhamRepository().getAll(ten);
    }
    
}
