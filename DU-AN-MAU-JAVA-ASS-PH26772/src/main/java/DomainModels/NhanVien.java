/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "NhanVien")
public class NhanVien implements Serializable{
    
    @Id 
    @GeneratedValue
    @Column(name = "id",columnDefinition = "uniqueidentifier")
    private UUID id;
    
    @Column(name = "Ma" ,  length = 20 )
    private String ma;
    
    @Column(name = "Ten" , length = 30)
    private String ten;
    
    @Column(name = "TenDem", length = 30 )
    private String tenDem;
    
    @Column(name = "Ho", length = 30)
    private String ho;
    
    @Column(name = "GioiTinh", length = 10 )
    private String gioiTinh;
    
    @Column(name = "NgaySinh")
    private Date ngaySinh;
    
    @Column(name = "Sdt",length = 30 )
    private String sdt;
    
    @Column(name = "MatKhau")
    private String matKhau;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id",insertable=false, updatable=false)
    private CuaHang idCH;   
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdCV",insertable=false, updatable=false)
    private ChucVu idCV;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdGuiBC",insertable=false, updatable=false)
    private NhanVien idGuiBC;
    
    @Column(name = "TrangThai")
    private int trangThai;
    
    @OneToMany(mappedBy = "idGuiBC" , fetch = FetchType.LAZY)
    private List<NhanVien> listNhanVien;
   
}
