import java.util.Scanner;

class E2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number?");
        int n = scan.nextInt();

        int totalOdd = 0;
        int total = 0;
        for (int i = 0; i <= n; i++) {
            
            if (i % 2 != 0){
                totalOdd = totalOdd + i;
            
            }



        }

    


        System.out.println("The sum of all odd numbers: " + totalOdd + ".    The number squared: " + (n * n));






    }



}