package SS04_ClassObject.bai_tap;

import SS04_ClassObject.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        System.out.println("QuadraticEquation: " + a +"x2" + " + " + b + "x" + " + " + c + " = 0");

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("Delta= " + quadraticEquation.getDiscriminant(a,b,c));
        if (quadraticEquation.getDiscriminant(a,b,c) == 0){
            System.out.println("The equation has one root: " + quadraticEquation.getRoot1(a,b,c));
        }else if (quadraticEquation.getDiscriminant(a,b,c) < 0){
            System.out.println("The equation has no roots!!");
        }else {
            System.out.println("The equation has two roots: " + quadraticEquation.getRoot1(a,b,c) + " and " + quadraticEquation.getRoot2(a,b,c));
        }

    }
}
