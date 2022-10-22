/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.serviceImpl;

import domainModels.DongSP;
import repositories.DongSPRepository;
import services.DongSPService;
import customModels.DongSPCustom;
import java.util.List;
import java.util.UUID;

public class DongSPServiceImpl implements DongSPService {

    private DongSPRepository repository = new DongSPRepository();

    @Override
    public void them(DongSPCustom qldsp) {
        DongSP dsp = new DongSP(qldsp.getMa(), qldsp.getTen());
        repository.them(dsp);
    }

    @Override
    public void sua(DongSPCustom qldsp) {
        DongSP dsp = new DongSP(qldsp.getId(), qldsp.getMa(), qldsp.getTen());
        repository.sua(dsp);
    }

    @Override
    public void xoa(UUID id) {
        repository.xoa(id);
    }

    @Override
    public List<DongSPCustom> getAll() {
        return repository.getAll();
    }

    @Override
    public DongSP finId(UUID id) {
        return repository.finId(id);
    }

}
