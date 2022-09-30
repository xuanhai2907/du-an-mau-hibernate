/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.MauSac;

import Repositories.MauSacRepository;
import Services.MauSacService;
import java.util.List;

/**
 *
 * @author asus
 */
public class MauSacServiceImpl implements MauSacService{
    private MauSacRepository rp = new MauSacRepository();
    @Override
    public List<MauSac> getAll() {
        return rp.getAll();
    }

    @Override
    public MauSac them(MauSac ms) {
        return rp.them(ms);
    }

 

    @Override
    public String sua( MauSac ms) {
        boolean test = rp.sua( ms);
        if (test) {
            return "Sua thanh cong";
        } else {
            return "Sua that bai";
        }
    }


    @Override
    public String xoa(MauSac ms, String ma) {
        return rp.xoa(ms, ma);
    }
   
    
}
