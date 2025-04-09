import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("Enter a number till fibonacci to be calculated: ");
        int fib=input.nextInt();
        input.close();
        System.out.println(a);
        System.out.println(b);
        while((fib-3)>=0){
            int c=b;
            b=a+b;
            a=c;
            System.out.println(b);
            fib--;
        }
    }
}
