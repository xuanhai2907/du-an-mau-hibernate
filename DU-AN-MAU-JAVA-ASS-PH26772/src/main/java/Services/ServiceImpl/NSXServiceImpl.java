/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.NSX;
import Repositories.NSXRepository;
import Services.NSXService;
import java.util.List;

/**
 *
 * @author MMC
 */
public class NSXServiceImpl implements NSXService {

    private NSXRepository repository = new NSXRepository();

    @Override
    public String sua(NSX nsx) {
        boolean test = repository.sua(nsx);
        if (test) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public String xoa(NSX nsxx, String ten) {
        return repository.xoa(nsxx, ten);
    }

    @Override
    public List<NSX> getAll() {
        return repository.getAll();
    }

    @Override
    public NSX them(NSX nsx) {
        return repository.them(nsx);
    }

}
