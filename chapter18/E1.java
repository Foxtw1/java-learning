import java.util.Scanner;

class E1 {

    public static void main(String[] args) {
        
        double check;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the amount in your checking acount?");
        check = scan.nextDouble();


        double save;
        System.out.println("What is the amount in your savings acount?");
        save = scan.nextDouble();

        if (check > 1000 || save > 1500) {

            System.out.println("You have a $0.15 service charge for checks!");

        }
        else {

            System.out.println("You no service charge for checks!");

        }



    }






}