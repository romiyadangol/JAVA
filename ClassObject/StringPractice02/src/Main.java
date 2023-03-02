//2. Print the average of three numbers entered by user by creating a
//  class named 'Average' having a method to calculate and print the average.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int sum1 =sc.nextInt();
        System.out.println("Enter second number: ");
        int sum2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int sum3 = sc.nextInt();
        int sum = sum1 + sum2 + sum3;
        double Average= sum/3;
        System.out.println("Average of three numbers : "+Average);
    }

}