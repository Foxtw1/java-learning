import java.util.Scanner;

class E1 {

    public static void main (String[] args){

        double input;
        Scanner scan = new Scanner(System.in);
        System.out.println("kilowatt per hour in dollars: ");
        input = scan.nextDouble();

        double e;
        Scanner s = new Scanner(System.in);
        System.out.println("killowatt hours used in a year: ");
        e = s.nextDouble();        

        double cost = input * e;
        System.out.println("$" + cost);


    }



}