package Thicuoimodule2.models;

import Thicuoimodule2.productshow.ProductShow;

public class Product extends ProductShow {
    private  int id;
    private  String maSp;
    private String tenSp;
    private  double giaSp;
    private  int soLuongSp;
    private  String NsxSp;

    public Product(int id, String maSp, String tenSp, double giaSp, int soLuongSp, String nsxSp) {
        this.id = id;
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.giaSp = giaSp;
        this.soLuongSp = soLuongSp;
        NsxSp = nsxSp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(double giaSp) {
        this.giaSp = giaSp;
    }

    public int getSoLuongSp() {
        return soLuongSp;
    }

    public void setSoLuongSp(int soLuongSp) {
        this.soLuongSp = soLuongSp;
    }

    public String getNsxSp() {
        return NsxSp;
    }

    public void setNsxSp(String nsxSp) {
        NsxSp = nsxSp;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", maSp='" + maSp + '\'' +
                ", tenSp='" + tenSp + '\'' +
                ", giaSp=" + giaSp +
                ", soLuongSp=" + soLuongSp +
                ", NsxSp='" + NsxSp + '\'' +
                '}';
    }
}
