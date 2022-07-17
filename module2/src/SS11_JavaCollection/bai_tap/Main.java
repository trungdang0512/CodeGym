package SS11_JavaCollection.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ProductManager product = new ProductManager();

        product.add(new Product(01, "CocaCola", 10000));
        product.add(new Product(02, "Redbull", 12000));
        product.add(new Product(03, "Revive", 13000));
        product.display();
        product.findByName("7up");
        product.findByName("Revive");
        product.remove(03);
//        product.changeProduct(02,"abc", 15000); chưa chạy đc
        product.add(new Product(03, "Monster", 40000));
        product.sortHighToLow();
        System.out.println("sort High to Low");
        product.display();
        product.sortLowToHigh();
        System.out.println("sort Low to High");
        product.display();



    }
}
