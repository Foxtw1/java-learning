import java.util.Scanner;



class E3 {

    public static void main(String[] args) {
        
        int len;
        String chapter;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the first word?");
        chapter = scan.nextLine();

        String pageNumber;
        System.out.println("What is the page number?");
        pageNumber = scan.nextLine();

        len = chapter.length() + pageNumber.length();


        System.out.println(chapter);


        int dot = 0;
        while (dot < 30 - len) {

            System.out.println(".");
            dot ++;
        }
        System.out.println(pageNumber);


    }





}