package exercise01.SS07_AbstractClass_Interface.thuc_hanh.TH_trien_khai_Comparable_cho_cac_lop_hinh_hoc;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5,"indigo", false);

        System.out.println("Pre-sorted: ");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted: ");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
