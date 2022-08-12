package exercise01.SS01_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class Bmi_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số cân nặng: ");
        double weight = scanner.nextDouble();

        System.out.printf("Nhập chiều cao: ");
        double height = scanner.nextDouble();

        double bmiNumber  = weight / Math.pow(height,2);

        if (bmiNumber < 18.5){
            System.out.printf("Underweight!!!!!");
        }else if (bmiNumber < 25.0){
            System.out.printf("Normal");
        }else if (bmiNumber < 30.0){
            System.out.printf("Overweight!!!");
        }else {
            System.out.printf("Obese");
        }
    }
}
