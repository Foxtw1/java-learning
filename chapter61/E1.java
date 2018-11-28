import java.io.* ;

class E1
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    // declare and initialize three sums
    
    int oddTotal = 0;
    int evenTotal = 0;
    int total = 0;
    // compute the sums
    for ( int i=0; i < data.length; i++)
    {
        if(i % 2 == 1){
            oddTotal = oddTotal + data[i];
        }
        if(i % 2 == 0){
            evenTotal = evenTotal + data[i];
        }
        total = total + data[i];
    }
      
    // write out the three sums
    System.out.println(oddTotal);
    System.out.println(evenTotal);
    System.out.println(total);

  }
}      