package exercise01.SS01_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập họ và tên: ");
        String name = scanner.nextLine();

        System.out.print("Xin chào " + name);

    }
}
