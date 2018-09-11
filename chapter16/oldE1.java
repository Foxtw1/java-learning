import java.util.Scanner;

class oldE1 {


    public static void main(String[] args) {
        
        int times;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many integers will be added?");
        times = scan.nextInt();

        int total = 0;
        int i = 0;
        while (i < times) {

            int integer;
            System.out.println("Enter an integer");
            integer = scan.nextInt();

            total = total + integer;
            i ++;



        }

        System.out.println("The total is: " + total);

    }





}