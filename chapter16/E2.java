import java.util.Scanner;


class E2 {

    public static void main(String[] args) {
        
        double bolt;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter botls: ");
        bolt = scan.nextDouble();

        double nut;
        System.out.println("Enter nuts: ");
        nut = scan.nextDouble();

        double washer;
        System.out.println("Enter wahsers: ");
        washer = scan.nextDouble();

        double discountedprice;
        if (nut <= bolt) {
            
            System.out.println("Grow some nuts");

        }
        if (2 * washer <= bolt) {
            System.out.println("Need more washers");


        }
        System.out.println("bolts: " + bolt);
        System.out.println("wahsers:" + washer);
        System.out.println("nut: " + nut);


    }
}