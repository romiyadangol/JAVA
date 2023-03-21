//Write the java program to  calculate Fibonacci Series up to n numbers.
//(Research on your own regarding the Fibonacci Series)
package FibonnaciSeries;

public class Fibo {
    public int fiboSeries(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fiboSeries(n - 1) + fiboSeries(n - 2);
        }
    }
}
