import java.util.Scanner;

public class PantryTester
{
  public static void main ( String[] args )
  {


    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your selcetion");
    int selection = scan.nextInt();

    System.out.println("Enter your amount to spread");
    int spread = scan.nextInt();

    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    Pantry hubbard = new Pantry( goose, apple, rhub );
    System.out.println( hubbard );

    hubbard.select(selection);
    hubbard.spread(spread);
    System.out.println( hubbard );


    if(spread < 2){

      Jam goose = Jam( "mixed Fruit", "7/4/86", 12 );


    }


    hubbard.select(selection);
    hubbard.spread(spread);
    System.out.println( hubbard );
  }
}