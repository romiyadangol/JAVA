import Correctcode.Bird;
import CurrencyConverter.Converter;
import FibonnaciSeries.Fibo;
import Multiplication.Multiply;
import PermutationArray.PerArray;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //MULTIPLICATION
        Multiply obj = new Multiply();
        System.out.println("-----Multiplication-----");
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        obj.multiply(number);

        //convert currency
        System.out.println("\n");
        Converter obj1 = new Converter();
        System.out.println("-----Nepali Rupees to US Dollar Converter-----");
        System.out.println("Enter amount in Nepali Rupees: ");
        double npr = input.nextDouble();
        obj1.convertUSD(npr);

        //Fibonacci series
        System.out.println("\n");
        Fibo obj2 = new Fibo();
        System.out.println("-----Fibonacci Series-----");
        System.out.println("Enter a number : ");
        int n = input.nextInt();
        System.out.print("Fibonacci Series up to " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(obj2.fiboSeries(i) + " ");
        }

        //CorrectCode
        System.out.println("\n");
        System.out.println("Correcting Code");
        System.out.println("-----OUTPUT-----");
        System.out.println("Hello world");
        Bird bird = new Bird();
        bird.fly();
        bird.eat();
        bird.walk();

        //zero-based permutation
        System.out.println("\n");
        int[] nums = new int[6];
        System.out.println("Enter the array elements from 0 to 5 :");
        for (int i = 0; i < 6; i++) {
            nums[i] = input.nextInt();
        }
        PerArray obj5 = new PerArray();
//        int[] nums = {0, 2, 1, 5, 3, 4};
//        int[] nums = {5, 0, 1, 2, 3, 4};
        int[] sortedNums = obj5.array(nums);
        System.out.println(Arrays.toString(sortedNums));

    }
}