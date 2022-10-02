/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.ChucVu;
import java.util.List;
import java.util.UUID;


public interface ChucVuService {
    public List<ChucVu> getList();
    public ChucVu getChucVuById(String ma);
    public void Insert(ChucVu chucVu);
    public void Update(ChucVu chucVu, UUID loca);
    public void Delete(UUID loca);
    
    
}
