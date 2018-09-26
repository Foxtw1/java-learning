import java.util.Scanner;

class OldE4 {

    public static void main(String[] args) {
        
        int start;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many stars should it start with?");
        start = scan.nextInt();


        while (start > 0) {

            String str = "";
            int n = 0;
            while (n < start) {
                str = str + "*";
                n++;
            }
            System.out.println(str);
            start--;
        }



    }




}