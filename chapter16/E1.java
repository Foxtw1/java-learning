import java.util.Scanner;


class E1 {

    public static void main(String[] args) {
        
        double amount;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount: ");
        amount = scan.nextDouble();

        double discountedprice;
        if (amount > 10) {
            
            discountedprice = amount * 0.9;
            System.out.println("discounted price: " + discountedprice);


        }

        else {
            System.out.println("price: " + amount);



        }



    }





}