package exercise01.SS02_Loop.bai_tap;

import java.util.Scanner;

public class Hien_thi_20snt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhập số lượng: ");
        int amount = scanner.nextInt();
//        System.out.printf("Nhập snt bắt đầu: ");
//        int inputNumber = scanner.nextInt();
        int counter = 0;
        int i =2;
        boolean checker = true;

        for (int numberCheck = 2; counter < amount; numberCheck++ ){
            for (i=2; i < Math.sqrt(numberCheck);i++){
                if (numberCheck % i == 0){
                    checker = false;
                    break;
                }else {
                    checker = true;
                }

                if (checker){
                    System.out.println("Số nt thứ " + (counter + 1) + " la " + numberCheck);
                    counter++;
                }
            }
        }


    }
}
