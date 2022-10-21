/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.MauSac;
import ViewModels.QLMauSac;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author asus
 */
public interface MauSacService {

    List<QLMauSac> getAll();

    public void them(QLMauSac ms);

    public void sua(QLMauSac ms);

    public void xoa(UUID id);
    
    public MauSac findId(UUID id);
}
