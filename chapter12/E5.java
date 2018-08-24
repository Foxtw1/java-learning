import java.util.Scanner;

class E5 {

    public static void main (String[] args){

        String input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        input = scan.nextLine();

        int e;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the end index: ");
        e = s.nextInt();        

        String sub = input.substring(e);

        System.out.println(sub);


    }



}