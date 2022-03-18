package SS01_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class check_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the year that you want to check:");
        int year = scanner.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 ==0){
                    System.out.printf("'%s' is a leap year",year);
                } else {
                    System.out.printf("'%s' is not a leap year",year);
                }
            }else {
                System.out.printf("'%s' is a leap year",year);
            }
        }

    }
}
