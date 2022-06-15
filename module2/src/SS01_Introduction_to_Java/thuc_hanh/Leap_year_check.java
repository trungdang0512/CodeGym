package SS01_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class Leap_year_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Nhập năm: ");
        year = scanner.nextInt();
        boolean checker = false;

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    checker = true;
                }else {
                    checker = false;
                }
            }else {
              checker = true;
            }
        }else {
            checker = false;
        }

        if (checker == true){
            System.out.printf("%d là năm nhuận!", year);
        }else {
            System.out.printf("%d không phải năm nhuận", year);
        }
    }
}
