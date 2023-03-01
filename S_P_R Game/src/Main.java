
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //take user input
        //S,P,R
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Let's play scissor,paper,rock!!");
        char userMove;
        while (true)
        {
            System.out.println("Please enter S ,P, or R");
            userMove = inputObj.next().charAt(0);
            System.out.println("User's input: " + userMove);

            if (userMove == 'R' || userMove == 'S' || userMove == 'P') {
                break;
            }
            System.out.println("Invalid Move! Please enter a valid move (S, P or R)");
        }
        char[] maxMove = {'S', 'P', 'R'};
        Random random = new Random();
        //0-2
        int number = random.nextInt(3);
        char computerMove = maxMove[number];
        System.out.println("Computer move: " + computerMove);

        if (userMove == computerMove) {
            System.out.println("Draw!!!");
        } else if (userMove == 'S' && computerMove == 'P' || userMove == 'P' && computerMove == 'R' || userMove == 'R' && computerMove == 'S') {
            System.out.println("Congratulations !!!you have won.!!");
        } else {
            System.out.println("Computer won, better luck next time!!");
        }
    }
}


//        else if(userMove == 'P' && computerMove == 'S'){
//            System.out.println("Computer Wins!!");
//        }
//        else if(userMove == 'S' && computerMove == 'R'){
//            System.out.println("Computer Wins!!");
//        }
//        else if(userMove == 'P' && computerMove == 'R'){
//            System.out.println("Computer Wins!!");
//        }
//        else if(userMove == 'R' && computerMove == 'P'){
//            System.out.println("User Wins!!");
//        }
//        else if(userMove == 'S' && computerMove == 'P'){
//            System.out.println("User Wins!!");
//        }
//        else{
//            System.out.println("Invalid input!!");
//        }
//        //make computer to make move either S,P,R
//
//        //computer = user -> DRAW
//        //computer "S"
//        //user "P" -> computer wins.
//        //user wins.
//
//        //computer "P"
//        //user "S" -> user wins.
//        //computer wins.
//
//        //computer "R"
//        //user "S" -> computer wins.
//        //user wins.
//    }
//}