import java.util.*;

class EvenOdd {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = sc.nextInt();

        //Brute-Force
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even number.");
        } else {
            System.out.println("The number " + number + " is odd number.");
        }
    }
}