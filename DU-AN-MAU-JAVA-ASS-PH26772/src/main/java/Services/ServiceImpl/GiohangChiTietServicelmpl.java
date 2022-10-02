/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.GioHangChiTiet;
import Repositories.GioHangChiTietRepositories;
import java.util.List;
import Services.GioHangChiTietService;

/**
 *
 * @author admin
 */
public class GiohangChiTietServicelmpl implements GioHangChiTietService{
    private GioHangChiTietRepositories repo;

    public GiohangChiTietServicelmpl() {
        repo = new GioHangChiTietRepositories();
    }

    @Override
    public List<GioHangChiTiet> getList() {
        return repo.getList();
    }

    @Override
    public void Insert(GioHangChiTiet ghct) {
        repo.Insert(ghct);
    }

    @Override
    public void Update(GioHangChiTiet ghct) {
        repo.Update(ghct);
    }

    @Override
    public void Delete(GioHangChiTiet ghct) {
        repo.Delete(ghct);
    }
    
    
    
}
