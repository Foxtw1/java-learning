import java.util.Scanner;

class E4 {

    public static void main(String[] args) {
        
        double x;
        Scanner scanx = new Scanner(System.in);
        System.out.println("Enter X: ");
        x = scanx.nextDouble();

        double y;
        Scanner scany = new Scanner(System.in);
        System.out.println("Enter Y: ");
        y = scany.nextDouble();

        double h;
        h = 2 / (1/x + 1/y);
        System.out.println("Harmonic mean: " + h);

        double a;
        a = (y + x) / 2;
        System.out.println("Arithmetic mean: " + a);


    }



}