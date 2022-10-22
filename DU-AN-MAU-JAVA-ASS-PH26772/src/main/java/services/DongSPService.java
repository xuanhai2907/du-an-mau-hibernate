
package services;

import domainModels.DongSP;
import customModels.DongSPCustom;
import java.util.List;
import java.util.UUID;


public interface DongSPService {

    List<DongSPCustom> getAll();

    public void them(DongSPCustom dsp);

    public void xoa(UUID id);

    public void sua(DongSPCustom dsp);
    
    public DongSP finId(UUID id);
}
