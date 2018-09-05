import java.util.Scanner;
import java.lang.Math;


class E7 {

    public static void main(String[] args) {
        
        double secyears;
        double secmonths;
        double secdays;
        double sectotal;

        double years;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age in years: ");
        years = scan.nextDouble();

        double months;
        System.out.println("Enter the months: ");
        months = scan.nextDouble();

        double days;
        System.out.println("Enter the days: ");
        days = scan.nextDouble();

        secyears = years * 365 * 24 * 60 * 60;
        secmonths = months * 30 * 24 * 60 * 60;
        secdays = days * 24 * 60 * 60;
        sectotal = secdays + secmonths + secyears;

        System.out.println("You are " + sectotal + " seconds old.");
    }
}