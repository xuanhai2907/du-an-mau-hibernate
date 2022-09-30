/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.HoaDon;
import Repositories.ChucVuRepository;
import Repositories.HoaDonRepository;
import Services.HoaDonService;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Acer
 */
public class HoaDonServiceImpl implements HoaDonService{
    private  HoaDonRepository repo;
    public HoaDonServiceImpl(){
        repo = new HoaDonRepository();
    
    }
   
    @Override
    public HoaDon getHoaDonById(String ma) {
        return repo.getHoaDonById(ma);
    }

    @Override
    public void Insert(HoaDon hd) {
        repo.Insert(hd);
    }

    @Override
    public void Update(HoaDon hd, UUID id) {
        repo.Update(hd, id);
    }

    @Override
    public void Delete(UUID id) {
        repo.Delete(id);
    }

    @Override
    public List<HoaDon> getList() {
        return repo.getList();
        }
    
}
