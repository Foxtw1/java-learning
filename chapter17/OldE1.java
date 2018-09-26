import java.util.Scanner;

class OldE1 {

    public static void main(String[] args) {
        
        double hoursTraveled;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many hours did you travel?");
        hoursTraveled = scan.nextDouble();

        int timeZonesCrossed;
        System.out.println("How many time zones did you cross?");
        timeZonesCrossed = scan.nextInt();

        int departureTime;
        System.out.println("When did you depart in military time?");
        departureTime = scan.nextInt();

        int arrivalTime;
        System.out.println("When did you arrive rounded to the nearest hour?");
        arrivalTime = scan.nextInt();




        int depart = 0;
        if (departureTime > 12 && departureTime >= 18) {
            depart = 1;

        }
        else if (departureTime > 18 && departureTime >= 22) {
            depart = 3;

        }
        else if (departureTime > 22 && departureTime <= 1) {
            depart = 4;

        }
        else if (departureTime > 1 && departureTime >= 8) {
            depart = 5;

        }

        

        int arrive = 0;
        if (arrivalTime > 12 && arrivalTime >= 18) {
            arrive = 2;

        }
        else if (arrivalTime > 18 && arrivalTime >= 22) {
            arrive = 0;

        }
        else if (arrivalTime > 22 && arrivalTime <= 1) {
            arrive = 1;

        }
        else if (arrivalTime > 1 && arrivalTime >= 8) {
            arrive = 3;

        }


        double daysOfRecovery;
        daysOfRecovery = (hoursTraveled/2.0 + (timeZonesCrossed - 3) + depart + arrive) / 10.0;

        System.out.println(daysOfRecovery);
    }




}