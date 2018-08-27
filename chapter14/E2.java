import java.util.Scanner;

class E2 {

    public static void main(String[] args) {
        double initialdeposit;
        Scanner scanid = new Scanner(System.in);
        System.out.println("Initial Deposit ");
        initialdeposit = scanid.nextDouble();

        double interestrate;
        Scanner scanir = new Scanner(System.in);
        System.out.println("Interest Rate: ");
        interestrate = scanir.nextDouble();
        
        double timesperyear;
        Scanner scantpy = new Scanner(System.in);
        System.out.println("Times per year: ");
        timesperyear = scantpy.nextDouble();

        double numberofyears;
        Scanner scannoy = new Scanner(System.in);
        System.out.println("Number of years: ");
        numberofyears = scannoy.nextDouble();

        double value;
        value = initialdeposit *  java.lang.Math.pow((1 + interestrate / timesperyear),(timesperyear * numberofyears));
        System.out.println("Value: " + value);


    }




}