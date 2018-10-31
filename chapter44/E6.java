import java.util.Scanner;


public class E6{



    public static void main(String[] args) {
        
        String realPassword  = "individual bidibibdue bebebebe";

        String pass = askForPass();
        System.out.println(check(pass, realPassword));


    }


    public static String askForPass(){

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the password?");
        String pass = scan.nextLine();
        return pass;



    }

    public static String check(String pass, String realPassword){




        if(pass.equals(realPassword)){

            return "The password is correct";


        }

        return "The password is incorrect";


    }









}