import java.util.Scanner;


class E5 {

    public static void main(String[] args) {
        int weight;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the weight of the trash?");
        weight = scan.nextInt();

        int n = weight / 100;
        int price = 0;
        if (n < 2) {

            price = 20;

        }
        else {

            price = 8 * n + 20; 

        }
        System.out.println(n);

        System.out.println("Price: " + price);
    }

}