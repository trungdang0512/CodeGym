//package exercise01.Final_Exam.Controller;
//
//import exercise01.Final_Exam.Models.Product;
//import exercise01.Final_Exam.Service.ProductService;
//import exercise01.Final_Exam.utils.RegexData;
//
//import java.util.Scanner;
//
//public class MainMenu {
//    private static ProductService productService = new ProductService();
//    private static Scanner scanner = new Scanner(System.in);
//    private static RegexData regexData = new RegexData();
//
//
//    public static void mainMenu() {
//        boolean check = true;
//        while (check) {
//            System.out.println("1. Add new Product");
//            System.out.println("2. Delete product");
//            System.out.println("3. Display product list");
//            System.out.println("4. Search");
//            System.out.println("5. Exit");
//            Scanner scanner = new Scanner(System.in);
//
//            switch (scanner.nextInt()) {
//                case 1: {
//                    addProduct();
//                    break;
//                }
//                case 2: {
//                    productService.deleteProduct();
//                    break;
//                }
//                case 3: {
//                    productService.displayProductList();
//                    break;
//                }
//                case 4: {
//                    productService.findByProductCodeandName();
//                    break;
//                }
//                case 5: {
//                    System.exit(0);
//                    break;
//                }
//                default:
//                    break;
//            }
//        }
//    }
//
//    public static void addProduct() {
//        boolean check = true;
//        while (check) {
//            System.out.println("Choice type product which you want to create:");
//            System.out.println("1. Import ");
//            System.out.println("2. Export ");
//            System.out.println("3. Back to Mainmenu");
//            Scanner scanner = new Scanner(System.in);
//
//            switch (scanner.nextInt()) {
//                case 1: {
//                   productService.addImportProduct();
//                   mainMenu();
//                   break;
//                }
//                case 2: {
//                    productService.addExportProduct();
//                    mainMenu();
//                    break;
//                }
//                case 3: {
//                    mainMenu();
//                    break;
//                }
//                default:
//                    break;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        mainMenu();
//    }
//}
