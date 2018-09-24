import java.text.BreakIterator;
import java.util.Scanner;

class OldE1 {

    public static void main(String[] args) {
        



        Scanner scan = new Scanner(System.in);
        System.out.println("What is the grade? (0 to quit)");
        int grade = scan.nextInt();

        double i = 1;
        int total = grade;
        while(grade != 0) {
            System.out.println("What is the grade?");
            grade = scan.nextInt();

            if(grade == 0) {

                break;
            }
            i ++;

            total = total + grade;
            


        }

        System.out.println("Sum of integers: " + total/i);






    }



}