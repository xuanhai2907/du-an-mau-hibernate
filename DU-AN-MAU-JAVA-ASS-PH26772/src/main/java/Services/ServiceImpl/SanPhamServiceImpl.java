/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.SanPham;
import Repositories.SanPhamRepository;
import Services.SanPhamService;
import ViewModels.QLSanPham;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author asus
 */
public class SanPhamServiceImpl implements SanPhamService {

    private SanPhamRepository rp = new SanPhamRepository();

    @Override
    public List<QLSanPham> getAll() {
        return rp.getAll();
    }

    @Override
    public void them(QLSanPham sp) {
        SanPham s = new SanPham(sp.getMa(), sp.getTen());
        rp.them(s);
    }

    @Override
    public void sua( QLSanPham sp) {
        SanPham s = new SanPham(sp.getId(), sp.getMa(), sp.getTen());
        rp.sua(s);
    }

    @Override
    public void xoa(UUID id) {
        rp.xoa(id);
    }

    @Override
    public SanPham findId(UUID id) {
        return rp.findId(id);
    }

}
