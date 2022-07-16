/**
 * In this exercise we convert km/h (kilometer per hour) to rounded value of mph (miles per hour)
 * Obs.: exercise from Udemy course 'Java Programming Masterclass covering Java 11 & Java 17' by Tim Buchalka
 */
public class SpeedConverter {
    public static void main(String[] args) {
        //call conversion
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    //print the rounded conversion method
    public static void printConversion(double kilometersPerHour) {
        long mph = toMilesPerHour(kilometersPerHour);
        //check if conversion is valid
        if(mph < 0) System.out.println("Invalid Value"); //print string 'invalid value'
        else        System.out.println(mph);             //print the rounded conversion
    }
    //return the rounded value of mph
    public static long toMilesPerHour(double kilometersPerHour) {
        double conversion;
        //invalid value
        if(kilometersPerHour < 0) return -1;
        else {
            //1 mile/h = 1.609 km/h
            conversion = kilometersPerHour / 1.609;
            //return a rounded value
            return Math.round(conversion);
        }
    }
}
