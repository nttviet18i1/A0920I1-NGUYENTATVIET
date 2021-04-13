package Thicuoimodule2.models;

public class InputProduct extends  Product {
    private  double giaNhapSp;
    private  String tinhNhapSp;
    private double thue;

    public InputProduct(int id, String maSp, String tenSp, double giaSp, int soLuongSp, String nsxSp, double giaNhapSp, String tinhNhapSp, double thue) {
        super(id, maSp, tenSp, giaSp, soLuongSp, nsxSp);
        this.giaNhapSp = giaNhapSp;
        this.tinhNhapSp = tinhNhapSp;
        this.thue = thue;
    }

    public double getGiaNhapSp() {
        return giaNhapSp;
    }

    public void setGiaNhapSp(double giaNhapSp) {
        this.giaNhapSp = giaNhapSp;
    }

    public String getTinhNhapSp() {
        return tinhNhapSp;
    }

    public void setTinhNhapSp(String tinhNhapSp) {
        this.tinhNhapSp = tinhNhapSp;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    @Override
    public String toString() {
        return "InputProduct{" +
                "giaNhapSp=" + giaNhapSp +
                ", tinhNhapSp='" + tinhNhapSp + '\'' +
                ", thue=" + thue +
                '}';
    }
}
