import java.io.* ;
import javax.xml.crypto.Data;

public class E1
{

  public static void main ( String[] args )  
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    // declare the sum
    int sum = 0;

    // compute the sum
    for ( int row=0; row < data.length; row++){



        for ( int col=0; col < data[row].length; col++) {
            if ( data[row] == null ){
                break;
            }
        
            sum = sum + data[row][col];

        }
    }
      
    // write out the sum
    System.out.println( sum );

  }
}      