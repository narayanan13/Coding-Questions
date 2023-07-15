import java.util.*;

class digitSum {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number greater than two digit:");
        number = sc.nextInt();
        int value = number;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits of number " + value + " is: " + sum);
    }
}