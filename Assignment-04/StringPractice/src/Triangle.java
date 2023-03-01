public class Triangle {
    double s1,s2,s3;

    Triangle(double a,double b,double c){
        s1 = a;
        s2 = b;
        s3 = c;
    }
    void Perimeter(){
        double Perimeter = s1 + s2 + s3;
        System.out.println("Perimeter of triangle : "+Perimeter);
    }

    void Area(){
        double s = (s1 + s2 + s3) / 2;
        double Area = Math.sqrt(s * (s - s1) * (s - s2)*(s - s3));
        System.out.println("Area of triangle : "+Area);

    }


}
