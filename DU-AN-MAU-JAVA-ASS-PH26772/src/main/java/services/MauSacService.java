/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainModels.MauSac;
import customModels.MauSacCustom;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author asus
 */
public interface MauSacService {

    List<MauSacCustom> getAll();

    public void them(MauSacCustom ms);

    public void sua(MauSacCustom ms);

    public void xoa(UUID id);
    
    public MauSac findId(UUID id);
}
