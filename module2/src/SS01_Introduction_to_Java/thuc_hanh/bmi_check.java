package SS01_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class bmi_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.printf("Input you weight: ");
        weight = scanner.nextDouble();

        System.out.printf("Input you height: ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height,2);

        if (bmi >= 30.0){
            System.out.printf("Your body is Obese!");
        }else if (bmi < 30.0 && bmi >= 25.0){
            System.out.printf("Your body is Overweight!");
        }
    }
}
