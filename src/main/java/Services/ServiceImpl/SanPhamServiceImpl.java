/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.SanPham;
import Repositories.SanPhamRepository;
import Services.SanPhamService;
import java.util.List;

/**
 *
 * @author asus
 */
public class SanPhamServiceImpl implements SanPhamService {

    private SanPhamRepository rp = new SanPhamRepository();

    @Override
    public List<SanPham> getAll() {
        return rp.getAll();
    }

    @Override
    public SanPham them(SanPham sp) {
        return rp.them(sp);
    }

 

    @Override
    public String sua( SanPham sp) {
        boolean test = rp.sua( sp);
        if (test) {
            return "Sua thanh cong";
        } else {
            return "Sua that bai";
        }
    }

//    @Override
//    public SanPham tim(String ma) {
//        return rp.tim(ma);
//    }

    @Override
    public String xoa(SanPham sp, String ma) {
        return rp.xoa(sp, ma);
    }

}
