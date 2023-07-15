import java.util.*;

class nNaturalSum {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = sc.nextInt();

        for (int start = 1; start <= number; start++) {
            sum += start;
        }

        System.out.println("Sum of first " + number + " Natural numbers is :" + sum);

    }
}