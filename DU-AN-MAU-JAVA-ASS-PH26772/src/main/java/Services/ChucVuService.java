/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.ChucVu;
import ViewModels.QLChucVu;
import ViewModels.ViewModelsChucVu;
import java.util.List;
import java.util.UUID;

public interface ChucVuService {

    public List<QLChucVu> getAll();

    public void them(QLChucVu qlcv);

    public void sua(QLChucVu qlcv);

    public void xoa(UUID id);

    public ChucVu findId(UUID id);

}
