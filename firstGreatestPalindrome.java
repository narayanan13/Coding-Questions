//first greatest palindrome number of a given number
import java.util.*;

class firstGreatestPalindrome {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its immediate first greatest palindrome number:");
        number = sc.nextInt();
        int result = number;
        boolean flag = true;

        while (flag == true) {
            result += 1;
            if (result == reversed(result)) {
                flag = false;
                System.out.println("Palindrome number is : " + result);
                break;
            }
            else{
                flag=true;
            }
        }
    }

    private static int reversed(int result) {
        int reverse = 0;
        while (result >= 0) {
            int temp = result % 10;
            reverse = reverse * 10 + temp;
            result = result / 10;
        }
        return reverse;
    }
}