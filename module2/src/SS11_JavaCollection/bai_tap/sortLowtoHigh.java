package SS11_JavaCollection.bai_tap;

import java.util.Comparator;

public class sortLowtoHigh implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
