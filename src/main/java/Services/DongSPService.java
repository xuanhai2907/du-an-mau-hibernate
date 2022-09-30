
package Services;

import DomainModels.DongSP;
import java.util.List;


public interface DongSPService {

    List<DongSP> getAll();

    DongSP them(DongSP dsp);

    String xoa(DongSP dspp, String ten);

    String sua(DongSP dsp);
}
