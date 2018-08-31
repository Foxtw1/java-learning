import java.util.Scanner;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane.ScalableIconUIResource;

class E4 {

    public static void main(String[] args) {
        
        int strength;
        Scanner scan = new Scanner(System.in);
        System.out.println("what would you like your strength to be?");
        strength = scan.nextInt();

        int health;
        System.out.println("what would you like your health to be?");
        health = scan.nextInt();

        int luck;
        System.out.println("what would you like your luck to be?");
        luck = scan.nextInt();

        if ((luck + strength + health) < 15){

            System.out.println("Strength: " + strength + " Health: " + health + " Luck: " + luck);

        }
        else {

            luck = 5;
            health = 5;
            strength = 5;
            System.out.println("You have given your character too many points! Default values have been assigned. " + "Strength: " + strength + " Health: " + health + " Luck: " + luck);



        }


    }





}