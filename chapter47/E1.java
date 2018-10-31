import java.lang.Math;

public class E1{





    public static void main(String[] args) {
        
        double r = 6;
        double h = 4;
        double s = slantHeight(r, h);
        double angle = angle(r, h);

        System.out.println(s);
        System.out.println(angle);


    }


    public static double slantHeight(double r, double h){


        double s = r * r + h * h;
        return Math.sqrt(s);



    }

    public static double angle(double r, double h){


        double angle = Math.atan(r / h);
        return angle;



    }







}