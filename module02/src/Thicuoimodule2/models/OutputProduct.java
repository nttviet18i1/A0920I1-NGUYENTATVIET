package Thicuoimodule2.models;

public class OutputProduct extends Product {
    private  double giaXuatSp;
    private  String quocGiaXuatSp;

    public OutputProduct(int id, String maSp, String tenSp, double giaSp, int soLuongSp, String nsxSp, double giaXuatSp, String quocGiaXuatSp) {
        super(id, maSp, tenSp, giaSp, soLuongSp, nsxSp);
        this.giaXuatSp = giaXuatSp;
        this.quocGiaXuatSp = quocGiaXuatSp;
    }

    public double getGiaXuatSp() {
        return giaXuatSp;
    }

    public void setGiaXuatSp(double giaXuatSp) {
        this.giaXuatSp = giaXuatSp;
    }

    public String getQuocGiaXuatSp() {
        return quocGiaXuatSp;
    }

    public void setQuocGiaXuatSp(String quocGiaXuatSp) {
        this.quocGiaXuatSp = quocGiaXuatSp;
    }

    @Override
    public String toString() {
        return "OutputProduct{" +
                "giaXuatSp=" + giaXuatSp +
                ", quocGiaXuatSp='" + quocGiaXuatSp + '\'' +
                '}';
    }
}
