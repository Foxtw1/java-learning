class E3 {

public static void main(String[] args){
        
        double rads = 30 * Math.PI/180;

        double a = Math.sin(rads);
        double b = Math.cos(rads);
        double c = (a * a) + (b * b);

        System.out.println("sine: " + a + " cos: " + b + " sum of squares: " + c);

    }



}