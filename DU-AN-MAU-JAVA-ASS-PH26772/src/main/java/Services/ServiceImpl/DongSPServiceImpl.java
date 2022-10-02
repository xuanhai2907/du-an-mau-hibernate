/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.DongSP;
import Repositories.DongSPRepository;
import Services.DongSPService;
import java.util.List;

/**
 *
 * @author MMC
 */
public class DongSPServiceImpl implements DongSPService{
    private DongSPRepository repository = new DongSPRepository();
   

    @Override
    public DongSP them(DongSP dsp) {
        return repository.them(dsp);
    }

    

    @Override
    public String sua(DongSP dsp) {
        boolean test = repository.sua(dsp);
        if (test) {
            return "Sửa thành công";
        }else{
            return "Sửa thất bại";
        }
    }

    @Override
    public String xoa(DongSP dspp, String ten) {
        return repository.xoa(dspp, ten);
    }

    @Override
    public List<DongSP> getAll() {
        return repository.getAll();
    }
    
}
