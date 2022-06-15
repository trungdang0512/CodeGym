package SS01_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class Change_money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;

        System.out.println("Nhập số tiền USD muốn quy đổi: ");
        int usd = scanner.nextInt();

        int vnd = usd*rate;
        System.out.printf(usd + " USD trị giá bằng " + vnd + "VND");
    }
}
