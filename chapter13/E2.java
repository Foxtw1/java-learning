import java.util.Scanner;

class E2 {

    public static void main (String[] args){

        double sec;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        sec = scan.nextDouble();
     

        double d = (0.5) * (sec * sec * 1.0) * 32.174;
        System.out.println(d);


    }



}