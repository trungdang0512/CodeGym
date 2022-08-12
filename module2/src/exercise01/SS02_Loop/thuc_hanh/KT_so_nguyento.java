package exercise01.SS02_Loop.thuc_hanh;

import java.util.Scanner;

public class KT_so_nguyento {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int inputNumber;

        System.out.print("Input the Number: ");
        inputNumber = scanner.nextInt();

        while (inputNumber < 1){
            System.out.println("Input the Number > 1: ");
            inputNumber =scanner.nextInt();
        }

        if (inputNumber < 2){
            System.out.println(inputNumber + " is not a prime!");
        }else {
            int i = 2;
            boolean checker = true;

            while (i < Math.sqrt(inputNumber)){
                if (inputNumber%i == 0){
                    checker = false;
                    break;
                }
                i++;
            }

            if (checker = true){
                System.out.println(inputNumber + " is a prime!");
            }else {
                System.out.println(inputNumber + " is not a prime!");
            }
        }
    }
}
