import java.util.Scanner;
//v4
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, "+ args[0]);
        Scanner sc= new Scanner(System.in);
        System.out.println("a =  ");
        double a =sc.nextDouble();
        System.out.println("x = ");
        double x= sc.nextDouble();
        double z= Math.log(Math.exp(a*a*a*a*a*a*a))+Math.atan(x*x)+Math.PI/Math.sqrt(Math.exp(a+x));
        System.out.println(z);
    }
}
