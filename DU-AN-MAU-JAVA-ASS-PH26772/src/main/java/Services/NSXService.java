/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.NSX;
import ViewModels.QLNSX;
import java.util.List;
import java.util.UUID;


public interface NSXService {
    List<QLNSX> getAll();
    public void them(QLNSX nsx);
    public void xoa(UUID id);
    public void sua(QLNSX nsx);
    
    public NSX findId( UUID id);
}
