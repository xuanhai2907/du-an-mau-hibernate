
package Services;

import DomainModels.DongSP;
import ViewModels.QLDongSP;
import java.util.List;
import java.util.UUID;


public interface DongSPService {

    List<QLDongSP> getAll();

    public void them(QLDongSP dsp);

    public void xoa(UUID id);

    public void sua(QLDongSP dsp);
    
    public DongSP finId(UUID id);
}
