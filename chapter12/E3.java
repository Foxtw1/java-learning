class E3 {

    public static void main (String[] args){


        int t = 573;
        int d = t/100;
        int q = (t % 100) / 25;
        int i = ((t % 100) - q * 25) / 10;
        int p = ((t % 100) - q * 25 - i * 10) / 1;



        System.out.println("you need: " + d + " dollars, " + q + " quarters, " + i + " dimes, " + p + " pennies.");


    }



}