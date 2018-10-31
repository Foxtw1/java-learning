import java.util.Scanner;

public class E1 {


    public static void main(String[] args) {
        
        String name  = askForName();

        printName(name);


    }


    public static String askForName(){

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the name?");
        String name = scan.nextLine();
        return name;



    }


    public static void printName(String name){

        System.out.println(name);




    }






}