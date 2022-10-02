/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.GioHang;
import Repositories.GioHangRepository;
import Services.GioHangService;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author window
 */
public class GioHangServiceImpl implements GioHangService{
    
    private GioHangRepository repo;

    public GioHangServiceImpl() {
        repo = new GioHangRepository();
    }

    @Override
    public List<GioHang> getList() {
        return repo.getList();
    }

    @Override
    public void insert(GioHang gh) {
        repo.insert(gh);
    }

    @Override
    public void update(GioHang gh, UUID viTri) {
        repo.update(gh, viTri);
    }

    @Override
    public void delete(UUID viTri) {
        repo.delete(viTri);
    }
    
    
}
