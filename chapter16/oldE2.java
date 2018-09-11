import java.util.Scanner;

class oldE2 {

    public static void main(String[] args) {
        
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is N?");
        n = scan.nextInt();


        double sum = 0;
        int i = 1;
        while (i <= n) {

            sum = sum + 1.0 / i;

            i ++;
        }

        System.out.println(sum);


    }



}