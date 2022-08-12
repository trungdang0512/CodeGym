package exercise01.SS01_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class PT_bac_nhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a  * x + b = c', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        if (a != 0){
            double answer = (c-b)/a;
            System.out.printf("PT 1 nghiem voi x = %f!\n", answer);
        }
        else {
            if (b==c){
                System.out.printf("PT vo so nghiem");
            }else {
                System.out.printf("PT vo nghiem!");
            }
        }
    }
}
