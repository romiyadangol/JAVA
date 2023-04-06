
//Take a number as input and print the multiplication table for it. The multiplication table should start from 1 to 10. The output should be on format like this
//        Suppose user gave 5 as a input:
//        5 x 1 = 5
//        5 x 2 = 10
//        …. (repeat)
//        5 x 10 = 50
package Multiplication;
public class Multiply {
    public void multiply(int number){
        for(int i = 1 ; i <= 10 ; i ++){
            int multiply = number * i;
            System.out.println(number +" x "+ i +" = " +multiply);
        }
    }
}

