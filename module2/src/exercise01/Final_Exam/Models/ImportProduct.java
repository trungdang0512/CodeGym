package exercise01.Final_Exam.Models;

public class ImportProduct extends Product{
    public double importPirce;
    public String importFrom;
    public double importTax;

    public ImportProduct() {
    }

    public ImportProduct(double importPirce, String importFrom, double importTax) {
        this.importPirce = importPirce;
        this.importFrom = importFrom;
        this.importTax = importTax;
    }

    public ImportProduct(int id, String codeProduct, String nameProduct, double price, int amount, String madeIn, double importPirce, String importFrom, double importTax) {
        super(id, codeProduct, nameProduct, price, amount, madeIn);
        this.importPirce = importPirce;
        this.importFrom = importFrom;
        this.importTax = importTax;
    }

    public double getImportPirce() {
        return importPirce;
    }

    public void setImportPirce(double importPirce) {
        this.importPirce = importPirce;
    }

    public String getImportFrom() {
        return importFrom;
    }

    public void setImportFrom(String importFrom) {
        this.importFrom = importFrom;
    }

    public double getImportTax() {
        return importTax;
    }

    public void setImportTax(double importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return "ImportProduct{" +
                "importPirce=" + importPirce +
                ", importFrom='" + importFrom + '\'' +
                ", importTax=" + importTax +
                ", id=" + id +
                ", codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", madeIn='" + madeIn + '\'' +
                '}';
    }
}
