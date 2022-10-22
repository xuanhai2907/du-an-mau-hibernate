/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import domainModels.NSX;
import customModels.NSXCustom;
import java.util.List;
import java.util.UUID;


public interface NSXService {
    List<NSXCustom> getAll();
    public void them(NSXCustom nsx);
    public void xoa(UUID id);
    public void sua(NSXCustom nsx);
    
    public NSX findId( UUID id);
}
