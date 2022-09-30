/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.ServiceImpl;

import DomainModels.ChucVu;
import Repositories.ChucVuRepository;
import java.util.List;
import java.util.UUID;
import Services.ChucVuService;

public class ChucVuServiceImpl implements ChucVuService {

    private ChucVuRepository repo;

    public ChucVuServiceImpl() {
        repo = new ChucVuRepository();
    }

    @Override
    public List<ChucVu> getList() {
        return repo.getList();
    }

    @Override
    public void Insert(ChucVu chucVu) {
        repo.Insert(chucVu);
    }

    @Override
    public void Update(ChucVu chucVu, UUID loca) {
        repo.Update(chucVu, loca);
    }

    @Override
    public void Delete(UUID loca) {
        repo.Delete(loca);
    }

    @Override
    public ChucVu getChucVuById(String ma) {
        return repo.getChucVuById(ma);
    }

}
