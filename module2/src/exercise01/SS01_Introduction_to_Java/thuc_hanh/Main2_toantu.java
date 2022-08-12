package exercise01.SS01_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class Main2_toantu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = width*height;

        System.out.println("Area is: " + area);
    }
}
