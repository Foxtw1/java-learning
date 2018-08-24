import java.util.Scanner;

class E4 {

    public static void main (String[] args){

        double involtage;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the voltage: ");
        involtage = scan.nextDouble();

        double inr;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the resistance: ");
        inr = s.nextDouble();        

        double i = (involtage) / inr;

        System.out.println(i);


    }



}