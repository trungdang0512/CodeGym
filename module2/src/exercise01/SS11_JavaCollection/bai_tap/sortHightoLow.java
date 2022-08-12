package exercise01.SS11_JavaCollection.bai_tap;

import java.util.Comparator;

public class sortHightoLow implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
