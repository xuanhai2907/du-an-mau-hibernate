/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.DongSP;
import Repositories.DongSPRepository;
import Services.DongSPService;
import ViewModels.QLDongSP;
import java.util.List;
import java.util.UUID;

public class DongSPServiceImpl implements DongSPService {

    private DongSPRepository repository = new DongSPRepository();

    @Override
    public void them(QLDongSP qldsp) {
        DongSP dsp = new DongSP(qldsp.getMa(), qldsp.getTen());
        repository.them(dsp);
    }

    @Override
    public void sua(QLDongSP qldsp) {
        DongSP dsp = new DongSP(qldsp.getId(), qldsp.getMa(), qldsp.getTen());
        repository.sua(dsp);
    }

    @Override
    public void xoa(UUID id) {
        repository.xoa(id);
    }

    @Override
    public List<QLDongSP> getAll() {
        return repository.getAll();
    }

    @Override
    public DongSP finId(UUID id) {
        return repository.finId(id);
    }

}
