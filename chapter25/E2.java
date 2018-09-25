import java.util.Scanner;


class E2 {

    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        System.out.println("How many people are at the party?");
        int people = scan.nextInt();





        for(int i = 0; i <= people; i++){
            double total = 1;
            
            for(int n = 0; n <= i; n++){
                total = total * ((365 - n) / 365.0);
            }

            System.out.println(total);
        }









    }




}