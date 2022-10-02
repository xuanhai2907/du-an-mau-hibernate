/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.NhanVien;
import Repositories.NhanVienRepository;
import Services.NhanVienService;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author window
 */
public class NhanVienServiceImpl implements NhanVienService{

    private NhanVienRepository repo;
    
    public NhanVienServiceImpl(){
        repo = new NhanVienRepository();
    }

    @Override
    public NhanVien getNhanVienByMa(String ma) {
        return  repo.getNhanVienByMa(ma);
    }
        
    @Override
    public NhanVien getNhanVienById(String ma) {
        return repo.getNhanVienById(ma);
    }

    @Override
    public List<NhanVien> getList() {
        return repo.getList();
    }
    
     @Override
    public void Insert(NhanVien nhanVien) {
        repo.Insert(nhanVien);
    }

    @Override
    public void Update(NhanVien nhanVien) {
        repo.Update(nhanVien);
    }

    @Override
    public void Delete(NhanVien id) {
        repo.Delete(id);
    }
    
}
