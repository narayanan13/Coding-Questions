import java.util.*;
class PositiveNegative{
    public static void main(String[]args){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        if(number>0){
            System.out.println("The number "+number+" is positive.");
        }
        else if(number<0){
            System.out.println("The number "+number+" is negative.");
        }
        else{
            System.out.println("The number is Zero.");
        }
    }
}