package exercise01.final_exam_02.controller;

import exercise01.final_exam_02.model.Account;
import exercise01.final_exam_02.model.PaymentAccount;
import exercise01.final_exam_02.model.SavingAccount;
import exercise01.final_exam_02.service.BankService;

import java.util.List;
import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static BankService bankService = new BankService();


    public static void main(String[] args) {
        mainMenu();
    }


    public static void mainMenu() throws NumberFormatException{
        boolean check = true;
        while (check) {
            System.out.println("___Menu___\n" +
                            "1. Add new Account\n" +
                            "2. Delete Account\n" +
                            "3. Display Banking Account\n" +
                            "4. Search Account\n" +
                            "5. Exit");
            System.out.print("In put your choice: ");

            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {
                    create();
                    break;
                }
                case 2: {
                    delete();
                    break;
                }
                case 3: {
                    display();
                    break;
                }
                case 4: {
                    bankService.searching();
                    break;
                }
                case 5: {
                    System.exit(0);
                }
                default:
                    break;
            }
        }
    }

    public static void create(){
        Account account;
        int choice;
        do {
            System.out.println("Choice type of Account to create:\n" +
                    "1. Saving Account\n" +
                    "2. Payment Account\n" +
                    "3. Back to Mainmenu");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    mainMenu();
                    break;
            }
        } while (choice <= 0 || choice > 3);

        int tempID = 0;
        System.out.print("1. Account code:");
        String code = scanner.nextLine();
        System.out.print("2. Owner Name: ");
        String name = scanner.nextLine();
        System.out.print("3. Create Date: ");
        String date = scanner.nextLine();
        if (choice== 1){
            System.out.print("4. Input Saving Money: ");
            double inputMoney = Double.parseDouble(scanner.nextLine());
            System.out.print("5. Saving Date: ");
            String savingDate = scanner.nextLine();
            System.out.print("6. % Lai suat: ");
            double lai = Double.parseDouble(scanner.nextLine());
            System.out.print("7. Time to Saving: (month)");
            int month = Integer.parseInt(scanner.nextLine());
            account = new SavingAccount(tempID,code,name,date,inputMoney,savingDate,lai,month);
        } else {
            System.out.print("4. Input Card Number: ");
            String cardNumber = scanner.nextLine();
            System.out.print("5. Input Current Money: ");
            double currentMoney = Double.parseDouble(scanner.nextLine());
            account = new PaymentAccount(tempID,code,name,date,cardNumber,currentMoney);
        }

        bankService.create(account);
        System.out.println("Create successfully");
    }

    public static void display(){
        List<Account> accounts = bankService.findAll();
        for (Account account: accounts) {
            System.out.println(account);
        }
    }

    public static void delete(){
        System.out.print("Enter ID of account which you want to DELETE: ");
        int deleteID = Integer.parseInt(scanner.nextLine());
        int choice;
        do {
            System.out.println("After DELETE, you can recover your account, Are you SURE? \n" +
                    "1. YES\n" +
                    "2. NO");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    bankService.delete(deleteID);
                    System.out.println("Deleted successfully");
                    display();
                    break;
                case 2:
                    mainMenu();
                    break;
            }
        } while (choice <= 0 || choice > 2);
    }


}
