//package exercise01.Final_Exam.Service;
//
//import exercise01.Bai_tap_them.Quan_ly_Product.Model.ProductNhapKhau;
//import exercise01.Bai_tap_them.Quan_ly_Product.Model.ProductXuatKhau;
//import exercise01.Bai_tap_them.Quan_ly_Product.Util.ConstantUtil;
//import exercise01.Bai_tap_them.Quan_ly_Product.Util.FileHelper;
//import exercise01.Final_Exam.Controller.MainMenu;
//import exercise01.Final_Exam.Models.ExportProduct;
//import exercise01.Final_Exam.Models.ImportProduct;
//import exercise01.Final_Exam.Models.Product;
//import exercise01.Final_Exam.utils.Link;
//import exercise01.Final_Exam.utils.ReadWriteFile;
//import exercise01.Final_Exam.utils.RegexData;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class ProductService implements Link {
//
//
//    private List<Product> products = new ArrayList<>();
//    Product product;
//    Scanner scanner = new Scanner(System.in);
//    RegexData regexData = new RegexData();
//    private ReadWriteFile readWriteFile = new ReadWriteFile();
//
//
//    public int id;
//    public String codeProduct;
//    public String nameProduct;
//    public double price;
//    public int amount;
//    public String madeIn;
//    public double importPirce;
//    public String importFrom;
//    public double importTax;
//    public double exportPirce;
//    public String exportTo;
//
//
//    public void addImportProduct() {
//        int idLast = 0;
//        if (products.size() > 0) {
//            idLast = products.get(products.size() - 1).getId() + 1;
//        }
//
//        System.out.println("Input Product Info: ");
//        System.out.print("Product Code: ");
//        codeProduct = scanner.nextLine();
//        System.out.print("Product Name: ");
//        nameProduct = scanner.nextLine();
//
//        System.out.println("Price: ");
//        price = Integer.parseInt(scanner.nextLine());
//
//        System.out.print("Amount:");
//        amount = Integer.parseInt(scanner.nextLine());
//        System.out.print("Made in From: ");
//        madeIn = scanner.nextLine();
//        System.out.print("Import Price: ");
//        importPirce = Double.parseDouble(scanner.nextLine());
//        System.out.print("Import From: ");
//        importFrom = scanner.nextLine();
//        System.out.print("Import Tax: ");
//        importTax = Double.parseDouble(scanner.nextLine());
//
//        ImportProduct importProduct = new ImportProduct(idLast, codeProduct, nameProduct, price, amount, madeIn, importPirce, importFrom, importTax);
//        products.add(importProduct);
//        System.out.println("New product has been added successfully!!");
//    }
//
//    public void addExportProduct(Product product) {
//        int idLast = 0;
//        if (products.size() > 0) {
//            idLast = products.get(products.size() - 1).getId() + 1;
//        }
//
//        System.out.println("Input Product Info: ");
//        System.out.print("Product Code: ");
//        codeProduct = scanner.nextLine();
//        System.out.print("Product Name: ");
//        nameProduct = scanner.nextLine();
//        System.out.print("Price: ");
//        price = Double.parseDouble(scanner.nextLine());
//        System.out.print("Amount:");
//        amount = Integer.parseInt(scanner.nextLine());
//        System.out.print("Made in From: ");
//        madeIn = scanner.nextLine();
//        System.out.print("Export Price: ");
//        exportPirce = Double.parseDouble(scanner.nextLine());
//        System.out.print("Export To: ");
//        exportTo = scanner.nextLine();
//
//        product.setId( + 1);
//        products.add(product);
//        readWriteFile.writeFile(Link.path, Collections.singletonList(product), true);
//        System.out.println("New product has been added successfully!!");
//    }
//
//    public void deleteProduct() {
//        System.out.println("Input the Product Code: ");
//        String inputCode = scanner.nextLine();
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getCodeProduct().equals(inputCode)) {
//                boolean check = true;
//                while (check) {
//                    System.out.println("Do you want to delete this product?");
//                    System.out.println("1. Yes");
//                    System.out.println("2. No");
//                    Scanner scanner = new Scanner(System.in);
//                    switch (scanner.nextInt()) {
//                        case 1:
//                            products.remove(i);
//                            System.out.println("Product has been removed!!");
//                            MainMenu.mainMenu();
//                            break;
//                        case 2:
//                            MainMenu.mainMenu();
//                            break;
//                        default:
//                            break;
//                    }
//                }
//                return;
//            } else {
//                System.out.println("Invalid Product Code !!!");
//            }
//        }
//    }
//
//    public void displayProductList() {
//        if (products.isEmpty()) {
//            System.out.println("The list is empty!");
//        }
//        System.out.println("Product list: ");
//        for (int i = 0; i < products.size(); i++) {
//            System.out.println(products.get(i).toString());
//        }
//    }
//
//    public void findByProductCodeandName() {
//        System.out.println("Find Product by Inputting Product Code or Product Name below: ");
//        String input = scanner.nextLine();
//        if (products.isEmpty()) {
//            System.out.println("The list is empty!");
//        }
//        for (int i = 0; i < products.size(); i++) {
//            if (!input.equals(products.get(i).getCodeProduct()) || !input.equals(products.get(i).getNameProduct())) {
//                System.out.println("Can't find the Product with Code or Name: " + input);
//            }else {
//                System.out.println(products.get(i).toString());
//            }
//        }
//    }
//
//
//
//}
