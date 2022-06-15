package SS01_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class Day_of_month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bạn muốn biết số ngày trong tháng nào? ");
        int month = scanner.nextInt();
        String dayInMonth;

        switch (month){
            case 2:
                dayInMonth = "28 hoặc 29 ngày";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
               dayInMonth = "30";
               break;
            default:
               dayInMonth = "";
        }
        if (!dayInMonth.equals("")) System.out.printf("Tháng '%d' có %s ngày!", month, dayInMonth);
        else System.out.print("Số tháng không hợp lệ!");
    }
}
