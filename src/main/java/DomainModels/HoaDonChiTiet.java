/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "HoaDonChiTiet")
@IdClass(HoaDonChiTietId.class)
public class HoaDonChiTiet implements Serializable {
    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdChiTietSP", insertable = false, updatable = false)
    private ChiTietSP idChiTietSP;
    
    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdHoaDon", insertable = false, updatable = false)
    private HoaDon idHoaDon;
    
    @Column(name = "SoLuong")
    private int soLuong;

    @Column(name = "DonGia")
    private BigDecimal donGia;

}
