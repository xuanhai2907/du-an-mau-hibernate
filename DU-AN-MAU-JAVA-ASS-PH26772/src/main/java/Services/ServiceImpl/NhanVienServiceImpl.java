/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.NhanVien;
import Repositories.NhanVienRepository;
import Services.NhanVienService;

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
    public NhanVien getNhanVienById(String ma) {
        return repo.getNhanVienById(ma);
    }
    
}
