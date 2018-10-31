import java.lang.Math.*;

public class E2{

    public double volume(double r, double h){



        //this.r = r;
        //this.h = h;


        double volume = Math.PI * r * r * h;
        return volume;





    }

    public double surfaceArea(double r, double h){


        double volume = 2 * Math.PI * (r * r) + 2 * Math.PI * r * h;
        return volume; 





    }






}