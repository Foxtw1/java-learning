import java.util.Scanner;

class E8 {

    public static void main(String[] args) {
        


        double age;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        age = scan.nextDouble();

        double time;
        System.out.println("What is the time?");
        time = scan.nextDouble();

        double price = 0;

        if (age > 13 && time > 1700) {

            price = 5;

        }
        if (age > 13 && time < 1700) {

            price = 8;

        }
        if (age < 13 && time > 1700) {

            price = 2;

        }
        if (age < 13 && time < 1700) {

            price = 4;

        }
        System.out.println("The price is: $" + price);

    }





}