/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.NSX;
import Repositories.NSXRepository;
import Services.NSXService;
import ViewModels.QLNSX;
import java.util.List;
import java.util.UUID;

public class NSXServiceImpl implements NSXService {

    private NSXRepository repository = new NSXRepository();

    @Override
    public void sua(QLNSX nsx) {
        NSX n = new NSX(nsx.getId(), nsx.getMa(), nsx.getTen());
        repository.sua(n);
    }

    @Override
    public void xoa(UUID id) {
        repository.xoa(id);
    }

    @Override
    public List<QLNSX> getAll() {
        return repository.getAll();
    }

    @Override
    public void them(QLNSX nsx) {
        NSX n = new NSX(nsx.getMa(), nsx.getTen());
        repository.them(n);
    }

    @Override
    public NSX findId(UUID id) {
        return repository.findId(id);
    }

}
