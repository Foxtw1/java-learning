import java.util.Scanner;

class E3 {

    public static void main(String[] args) {

        double interestrate;
        Scanner scanir = new Scanner(System.in);
        System.out.println("Interest Rate: ");
        interestrate = scanir.nextDouble();
        
        
        double years;
        years = interestrate / 72.0;
        System.out.println("years: " + years);


    }




}