import java.util.Scanner;

class OldE3 {


    public static void main(String[] args) {
        
        int times;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers?");
        times = scan.nextInt();

        double avg = 0;
        double avgsquare = 0;
        int i = 0;
        while (i < times) {

            double num;
            System.out.println("Enter an number");
            num = scan.nextDouble();

            avgsquare = (num * num) + avgsquare;
            avg = avg + num;
            i ++;

        }

        avg = avg * avg;
        double sd = 0;
        sd = Math.sqrt(avgsquare - avg);
        System.out.println("The standard deviation is: " + sd);

    }





}