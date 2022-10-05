/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
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
@Table(name = "SanPham")
public class SanPham implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private UUID id;
    
    @Column(name = "Ma", length = 20)
    private String ma;
    
    @Column(name = "Ten",length = 30)
    private String ten;
    

    public SanPham(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public SanPham() {
    }

    public SanPham(String ma) {
    }

    public SanPham(UUID id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }
    

    public Object[] toRowData() {
        return new Object[]{id, ma, ten};
    }

    

    
    
}
