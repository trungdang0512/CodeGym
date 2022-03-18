package SS01_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class day_of_month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which month that you want to count day?");
        int month = scanner.nextInt();
        switch (month){
            case 2:
                System.out.print("The month '2' has 28 or 29 days");
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("The month '" + month + "' has 31 days!");
//                cách viết thứ 2: month truyền vào '%s'
//                System.out.printf("The month '%s' has 31 days!", month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("The month '" + month + "' has 31 days!");
                break;
            default:
                System.out.print("Invalid Input!");
        }
    }
}
