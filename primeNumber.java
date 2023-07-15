import java.util.*;

class primeNumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find prime or not:");
        number = sc.nextInt();

        int count = 0;
        if (number < 2) {
            System.out.println("The number " + number + " is not a prime number.");
        } else {

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count += 1;
                }
            }
        }

        if (count > 2) {
            System.out.println("The number " + number + " is not a prime number.");
        } else {
            System.out.println("The number " + number + " is a prime number.");
        }
    }
}