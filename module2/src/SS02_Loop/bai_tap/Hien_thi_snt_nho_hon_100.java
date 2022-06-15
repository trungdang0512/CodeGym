package SS02_Loop.bai_tap;

public class Hien_thi_snt_nho_hon_100 {
    public static void main(String[] args) {

        for (int num = 2;num < 100; num++){
            int i = 2;
            boolean checker  = true;
            while (i <= Math.sqrt(num)){
                if (num % i == 0){
                    checker =false;
                    break;
                }
                i++;
            }
            if (checker){
                System.out.println(num +"");
            }
        }
    }
}
