import java.util.Scanner;


class E4 {

    public static void main(String[] args) {
        
        double weight;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight: ");
        weight = scan.nextDouble();

        if (weight <= 220 || weight >= 280) {
            
            System.out.println("you suck at weight");

        }
        else {

            System.out.println("you can now eat some pie");


        }

    }
}