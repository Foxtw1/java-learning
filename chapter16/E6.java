import java.util.Scanner;
import java.lang.Math;


class E6 {

    public static void main(String[] args) {
        
        double windSpeed;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Wind Speed: ");
        windSpeed = scan.nextDouble();

        double temp;
        System.out.println("Enter Temerpature: ");
        temp = scan.nextDouble();


        double windChill;
        if (windSpeed < 3) {
            
            windChill = temp;
        }
        else if (temp > 50){

            windChill = temp;


        }
        else {

            windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temp * Math.pow(windSpeed, 0.16);

        }
        
        System.out.println("Wind Chill: " + windChill);



    }
}