/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import domainModels.ChucVu;
import customModels.ChucVuCustom;
import customModels.ViewModelsChucVu;
import java.util.List;
import java.util.UUID;

public interface ChucVuService {

    public List<ChucVuCustom> getAll();

    public void them(ChucVuCustom qlcv);

    public void sua(ChucVuCustom qlcv);

    public void xoa(UUID id);

    public ChucVu findId(UUID id);

}
