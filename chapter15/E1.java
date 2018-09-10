import java.util.Scanner;

class E1 {

    public static void main(String[] args) {
    int start;
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the starting number?");
    start = scan.nextInt();

    int end;
    System.out.println("What is the ending number?");
    end = scan.nextInt();


        while (start <= end) {

            System.out.println(start);
            start ++;

        }




    }



}