import java.util.Scanner;

class E3 {

    public static void main (String[] args){

        double d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a double: ");
        d = scan.nextDouble();
     

        double a = Math.log(d) / Math.log(2);

        System.out.println(a);


    }



}