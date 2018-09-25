import java.util.Scanner;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;


class E4 {


        public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);
            System.out.println("What is the word?");
            String word = scan.nextLine();

            int len = word.length();

            int i = 0;

            while (len > i) {
                System.out.println(word.charAt(i));
                i++;



            }







        }

}