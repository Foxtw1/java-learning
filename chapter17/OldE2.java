import java.util.Scanner;

import com.sun.javafx.css.StyleClassSet;

class OldE2 {

    public static void main(String[] args) {
        
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number you would like to go to?");
        num = scan.nextInt();

        int totalsq = 0;
        int i = 0;
        while (i < num) {
            i ++;
            totalsq = totalsq + i * i;


        }

        int totalcb = 0;
        i = 0;
        while (i < num) {
            i ++;
            totalcb = totalcb + i * i * i;


        }

        System.out.println("The total squares added up is: " + totalsq);
        System.out.println("The total cubes added up is: " + totalcb);









    }





}