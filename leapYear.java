import java.util.*;

class leapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to find leap year or not:");
        year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("Year " + year + " is leap year.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Year " + year + " is leap year.");
        } else {
            System.out.println("Year " + year + " is not a leap year.");
        }
    }
}