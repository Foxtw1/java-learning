import java.util.Scanner;


class OldE7 {

    public static void main(String[] args) {
       
        
        int N;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N");
        N = scan.nextInt();

        int R;
        System.out.println("Enter R");
        R = scan.nextInt();


        if (R < 0 || N < 0 || R > N) {

            System.out.println("The numbers have to be positive, zero, or R has to be less than N.");

        }
        else {


            int i = 0;
            int totalR = 1;
            int totalN = 1;
            while (i < N) {
                i ++;

                if (i < (N - R)) {
                    totalR = totalR * i;

                }
                totalN = totalN * i;

            }

            System.out.println("The Permutation is: " + (totalN / totalR));

        }




    }


}