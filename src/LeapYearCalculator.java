/**
 * In this exercise a leap year calculator is coded
 * Obs.: exercise from Udemy course 'Java Programming Masterclass covering Java 11 & Java 17' by Tim Buchalka
 */
public class LeapYearCalculator {
    public static void main (String[] args) {
        System.out.println(isLeapYear(-100));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(1600));
    }
    //this function returns if year in parameter is a leap year
    public static boolean isLeapYear(int year) {
        //check if value is positive
        if(year < 0) return false;
        //the year must be divided by 400, 4 and 100 to be a leap year
        if(year % 400 == 0 && year % 100 == 0 && year % 4 == 0) return true;
        else return false;
    }
}
