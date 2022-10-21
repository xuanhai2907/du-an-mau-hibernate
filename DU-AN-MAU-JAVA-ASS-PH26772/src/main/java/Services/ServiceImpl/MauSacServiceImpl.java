/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.MauSac;

import Repositories.MauSacRepository;
import Services.MauSacService;
import ViewModels.QLMauSac;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.text.html.HTML;


public class MauSacServiceImpl implements MauSacService {

    private MauSacRepository rp = new MauSacRepository();
    private List<MauSac> listMauSac = new ArrayList<>();
    private List<QLMauSac> listQLMauSac = new ArrayList<>();

    @Override
    public List<QLMauSac> getAll() {
        return rp.getAll();
    }

    @Override
    public void them(QLMauSac qlms) {
        MauSac ms = new MauSac(qlms.getMa(), qlms.getTen());
        rp.them(ms);
    }

    @Override
    public void sua(QLMauSac qlms) {
        MauSac ms = new MauSac(qlms.getId(), qlms.getMa(), qlms.getTen());
        rp.sua(ms);
    }

    @Override
    public void xoa(UUID id) {
        rp.xoa(id);
    }

    @Override
    public MauSac findId(UUID id) {
        return rp.findId(id);
    }

}
