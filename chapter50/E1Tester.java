class E1Tester
{

  public static void main ( String[] args ){
  
    E1 box1 = new E1(2.5, 5.0, 6.0);

    E1 box2 = new E1(box1.getWidth() * 2, box1.getHeight() * 0.75, box1.getLength() * 2);


    System.out.println(box1.checkFitsIn(box1.getWidth(), box2.getWidth(), box1.getHeight(), box2.getHeight(), box1.getLength(), box2.getLength()));




    System.out.println( "Area: " + box1.area() + " volume: " + box1.volume() );

    System.out.println( "length: " + box1.length + " height: " + box1.height + " width: " + box1.width )  ;

    System.out.println( "Area: " + box2.area() + " volume: " + box2.volume() );



  }
}