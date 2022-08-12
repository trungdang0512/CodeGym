package exercise01.Final_Exam.Models;

public class ExportProduct extends Product{
    public double exportPirce;
    public String exportTo;

    public ExportProduct() {
    }

    public ExportProduct(double exportPirce, String exportTo) {
        this.exportPirce = exportPirce;
        this.exportTo = exportTo;
    }

    public ExportProduct(int id, String codeProduct, String nameProduct, double price, int amount, String madeIn, double exportPirce, String exportTo) {
        super(id, codeProduct, nameProduct, price, amount, madeIn);
        this.exportPirce = exportPirce;
        this.exportTo = exportTo;
    }

    public double getExportPirce() {
        return exportPirce;
    }

    public void setExportPirce(double exportPirce) {
        this.exportPirce = exportPirce;
    }

    public String getExportTo() {
        return exportTo;
    }

    public void setExportTo(String exportTo) {
        this.exportTo = exportTo;
    }

    @Override
    public String toString() {
        return "ExportProduct{" +
                "exportPirce=" + exportPirce +
                ", exportTo='" + exportTo + '\'' +
                ", id=" + id +
                ", codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", madeIn='" + madeIn + '\'' +
                '}';
    }
}
