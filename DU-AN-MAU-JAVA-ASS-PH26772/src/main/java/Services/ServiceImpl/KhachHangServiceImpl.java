/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.KhachHang;
import Repositories.KhachHangRepository;
import Repositories.NhanVienRepository;
import Services.KhachHangService;
import java.util.List;
import java.util.UUID;

public class KhachHangServiceImpl implements KhachHangService {

    private KhachHangRepository repo;

    public KhachHangServiceImpl() {
        repo = new KhachHangRepository();
    }

    @Override
    public List<KhachHang> getList() {
        return repo.getList();
    }
//
    @Override
    public void insert(KhachHang kh) {
        repo.insert(kh);
    }

    @Override
    public void update(KhachHang kh, UUID vitri) {
        repo.update(kh, vitri);
    }

    @Override
    public void delete(UUID vitri) {
        repo.delete(vitri);
    }

}
