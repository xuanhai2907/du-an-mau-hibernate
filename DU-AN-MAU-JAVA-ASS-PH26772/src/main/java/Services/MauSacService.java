/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.MauSac;

import java.util.List;

/**
 *
 * @author asus
 */
public interface MauSacService {

    List<MauSac> getAll();

    MauSac them(MauSac ms);

    String sua(MauSac ms);

    String xoa(MauSac ms, String ma);
}
