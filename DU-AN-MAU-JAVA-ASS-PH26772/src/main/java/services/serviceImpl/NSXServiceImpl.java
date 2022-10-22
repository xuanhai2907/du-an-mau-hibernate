/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.serviceImpl;

import domainModels.NSX;
import repositories.NSXRepository;
import services.NSXService;
import customModels.NSXCustom;
import java.util.List;
import java.util.UUID;

public class NSXServiceImpl implements NSXService {

    private NSXRepository repository = new NSXRepository();

    @Override
    public void sua(NSXCustom nsx) {
        NSX n = new NSX(nsx.getId(), nsx.getMa(), nsx.getTen());
        repository.sua(n);
    }

    @Override
    public void xoa(UUID id) {
        repository.xoa(id);
    }

    @Override
    public List<NSXCustom> getAll() {
        return repository.getAll();
    }

    @Override
    public void them(NSXCustom nsx) {
        NSX n = new NSX(nsx.getMa(), nsx.getTen());
        repository.them(n);
    }

    @Override
    public NSX findId(UUID id) {
        return repository.findId(id);
    }

}
