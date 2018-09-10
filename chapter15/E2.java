import java.util.Scanner;

class E2 {

    public static void main(String[] args) {
        String word;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the word?");
        word = scan.nextLine();

        int len;
        len = word.length();


        int times = 1;
        while (times < len) {

            System.out.println(word);
            times ++;

        }




    }



}