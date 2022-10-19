/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.util.UUID;

/**
 *
 * @author asus
 */
public class QLSanPham {

    private UUID id;
    private String ma;
    private String ten;

    public QLSanPham() {
    }

    public QLSanPham(UUID id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }

    public QLSanPham(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "QLSanPham{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + '}';
    }

    public Object[] toRowData() {
        return new Object[]{id, ma, ten};
    }
}
