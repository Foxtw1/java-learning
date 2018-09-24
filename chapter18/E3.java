import java.util.Scanner;

class E3 {

    public static void main(String[] args) {
        
        double fr;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input right front pressure");
        fr = scan.nextDouble();

        double fl;
        System.out.println("Input left front pressure");
        fl = scan.nextDouble();

        double br;
        System.out.println("Input right back pressure");
        br = scan.nextDouble();

        double bl;
        System.out.println("Input left back pressure");
        bl = scan.nextDouble();

        if (fr == fl && br == bl && fr > 35 && fr < 45 && br > 35 && br < 45){

            System.out.println("Inflation is OK");


        
        }
        else {

            System.out.println("Inflation is not OK");


        }


    }   





}