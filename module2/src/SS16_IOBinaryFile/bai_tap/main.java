package SS16_IOBinaryFile.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    private static final String FILE_PATH = "D:\\CodeGym\\CodeGymdn\\CodeGym\\module2\\src\\SS16_IOBinaryFile\\bai_tap\\ProductList.txt";

    private static void writeObjectList(List<Product> productList) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(productList);
        oos.close();
    }

    private static List<Product> readObjectList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Product> productList = (List<Product>) ois.readObject();
        return productList;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(01, "Pepsi","Pepsico",15000));
        productList.add(new Product(02, "Revive","Pepsico",17000));
        productList.add(new Product(03, "7UP","Pepsico",15000));

//        writeObjectList(productList);
//        productList = readObjectList();
//        for (Product product: productList){
//            System.out.println(product);
//        }
        productList.add(new Product(04, "Cocacola", "Cocacola VN", 15000));
        productList.add(new Product(05,"Number One", "THP", 15000));
        writeObjectList(productList);
        productList = readObjectList();
        for (Product product: productList){
            System.out.println(product);
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input new product ID: ");
//        int newid = scanner.nextInt();
//        System.out.println("Input new product name: ");
//        String newname = scanner.next();
//        System.out.println("Input new product brand: ");
//        String brand = scanner.next();
//        System.out.println("Input new product price: ");
//        int newprice = scanner.nextInt();
//
//        productList.add(new Product(newid,newname,brand,newprice));
//        writeObjectList(productList);
//        productList = readObjectList();
//        for (Product product: productList){
//            System.out.println(product);
//        }
    }
}
