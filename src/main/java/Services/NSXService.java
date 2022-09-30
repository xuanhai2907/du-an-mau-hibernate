/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.NSX;
import java.util.List;

/**
 *
 * @author MMC
 */
public interface NSXService {
    List<NSX> getAll();
    NSX them(NSX nsx);
    String xoa(NSX nsxx,String ten);
    String sua(NSX nsx);
}
