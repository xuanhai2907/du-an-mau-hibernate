
package ViewModels;

import java.util.UUID;

public class QLNSX {
    private UUID id;
    private String ma;
    private String ten;

    public QLNSX(UUID id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }

    public QLNSX() {
    }

    public QLNSX(String ma, String ten) {
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
        return "QLNSX{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + '}';
    }
    public Object[] toRowData(){
        return new Object[]{id,ma,ten};
    }
}
