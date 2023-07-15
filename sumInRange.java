import java.util.*;

class sumInRange {
    public static void main(String[] args) {
        int start, end, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting range value:");
        start = sc.nextInt();
        System.out.println("Enter ending range value:");
        end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("Sum of the range from " + start + " to " + end + " is :" + sum);
    }
}