import java.util.Scanner;

import javax.swing.text.GapContent;

import jdk.nashorn.internal.ir.Flags;

class OldE2 {

    public static void main(String[] args) {
        




        boolean done = false;

        while(done != true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("What is the Initial Miles? (- to quit)");
            int InitialMiles = scan.nextInt();

            if(InitialMiles < 0) {
                System.out.println("bye");
                break;
            }


            System.out.println("What is the Final Miles?");
            int FinalMiles = scan.nextInt();

            System.out.println("What is the Gallons?");
            double Gallons = scan.nextDouble();

            System.out.println("Miles per Gallon: " + (FinalMiles - InitialMiles) / Gallons);


            

        }







    }



}