package udemy;

/**
 * In this exercise we calculated the megabytes and the remaining kilobytes from the kilobytes parameters
 * Obs.: exercise from Udemy course 'Java Programming Masterclass covering Java 11 & Java 17' by Tim Buchalka
 */
public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    //print the calculated the megabytes and the remaining kilobytes from the kilobytes parameters
    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        int mb, kb;
        double conversionMBtoKB;
        //check if is an invalid value
        if(kilobytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            //1 MB = 1024 KB
            conversionMBtoKB = (double) kilobytes / 1024;
            mb = (int) Math.floor(conversionMBtoKB);
            kb = (int) Math.round((conversionMBtoKB - mb) * 1024);
            //print conversion
            System.out.println(kilobytes + "KB = " + mb + " MB and " + kb + " KB");
        }
    }
}
