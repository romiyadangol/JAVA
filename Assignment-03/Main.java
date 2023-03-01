import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {    
        System.out.println("Guess the Number.");
        System.out.println("Pick a number between 1 and 10.You will have 5 turns.");

        int[] num = {1,2,3,4,5,6,7,8,9,10};

        //random number
        Random random = new Random();
        int randNumber = random.nextInt(10);
        int pickNum = num[randNumber];

         System.out.println(pickNum);
       
        int number = 0;       
        
        Scanner input = new Scanner(System.in);
        //loop
        for (int i = 0; i < 5; i++)
        {
            number++;    
            System.out.print("Turn " + number + ": ");
            int guess = input.nextInt();
            if (guess < pickNum) 
            {
                System.out.println("Your guess "+ guess +" is too low. Please guess a higher number.");  

            } 
            else if (guess > pickNum) 
            {
                System.out.println("Your guess "+ guess + " is too high. Please guess a lower number.");
            } 
            else 
            {
                System.out.println("You guessed it right!! The number was " + pickNum);
                return;
            }
        }
        System.out.println("Sorry, you're out of guesses. The number was " + pickNum);
    }
}

