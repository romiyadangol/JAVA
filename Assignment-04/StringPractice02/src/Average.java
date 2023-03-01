public class Average {
    int sum1,sum2,sum3;
    Average(int a,int b,int c){
        sum1 = a;
        sum2 = b;
        sum3 = c;
    }
    void Average(){
        int sum = sum1 + sum2 + sum3;
        double Average= (sum1 + sum2 + sum3)/3;
        System.out.println("Average of three numbers : "+Average);
    }
}
