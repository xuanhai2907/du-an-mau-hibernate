/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "CuaHang")
public class CuaHang implements Serializable{
    
    @Id 
    @GeneratedValue
    @Column(name = "id",columnDefinition = "uniqueidentifier")
    private UUID id;
    
    @Column(name = "Ma",length = 20)
    private String ma;
    
    @Column(name = "Ten", length = 50)
    private String ten;
    
    @Column(name = "DiaChi", length = 100)
    private String diaChi;
    
    @Column(name = "ThanhPho", length = 50)
    private String thanhPho;
    
    @Column(name = "QuocGia", length = 50)
    private String quocGia;
    
    @OneToMany(mappedBy = "idCH" , fetch = FetchType.LAZY)
    private List<NhanVien> listNhanVien;
}
