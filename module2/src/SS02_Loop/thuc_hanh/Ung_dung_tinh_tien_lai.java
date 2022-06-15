package SS02_Loop.thuc_hanh;

import java.util.Scanner;

public class Ung_dung_tinh_tien_lai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double rate = 1.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so tien gui: ");
        money = input.nextDouble();

        System.out.println("Nhap so thang gui: ");
        month = input.nextInt();

        System.out.println("Nhap lai suat: ");
        rate = input.nextDouble();

        double total = 0;

        for (int i =  0; i < month; i++){
            total += money*(rate/100)/12 * month;
        }

        System.out.println("Lai suat nhan duoc: " + total);

    }
}
