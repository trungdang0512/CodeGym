package SS03_Array.bai_tap;

import java.util.Scanner;

public class BT_xoa_phan_tu {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0};
        Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập phần tử cần xóa: ");
            int x = scanner.nextInt();
            int indexDel = 0;
        int change = 0;

            for (int i = 0; i < array.length; i++) {
                if ( array[i] == x) {
                    System.out.println("Phần tử " + x + " nằm ở vị trí " + (i + 1));
                    indexDel = array[i] ;
                    for (int j = i; j < array.length - i; j++){
                        change = array[i+1];
                        array[i] = change;
                    }
                }
            }


        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
