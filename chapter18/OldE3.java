import java.util.Scanner;

class OldE3 {

    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the upper range?");
        int upper = scan.nextInt();

        System.out.println("What is the lower range?");
        int lower = scan.nextInt();

        boolean done = false;
        int inTotal = 0;
        int outTotal = 0;
        int num = 0;

        while(!done) {

            System.out.println("What is the number? (0 for end)");
            num = scan.nextInt();

            if (num == 0) {
                break;
            }

            if(num <= upper && num >= lower) {
                inTotal = inTotal + num;

            }
            else{
                outTotal = outTotal + num;


            }



        }

        System.out.println("Sum of numbers in range: " + inTotal);
        System.out.println("Sum of numbers out of range: " + outTotal);



    }




}