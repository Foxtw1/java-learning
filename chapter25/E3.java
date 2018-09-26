import java.sql.SQLClientInfoException;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class E3 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("What is the upper limit?");
        int upper = scan.nextInt();

        System.out.println("What is the lower limit?");
        int lower = scan.nextInt();



        int total = 1;
        int square = 1;

        for(double i = lower; i < upper; i++) {
            int sq = 0;
            int tri = 0;
            triangle = triangle + i;

            for(int n = 0; n < i; n++) {
                square = n * n;
                if(n + 1 == Math.sqrt(i) % i) {
                    n = n + total;
                    total = n + 1;
                }

            }

           
            System.out.println(tri);

            if((Math.sqrt(i) % i) == 0){

                sq = 1;
            }


            if(tri == 1 && sq == 1){
                //System.out.println(i);
            }









        }






    }


}