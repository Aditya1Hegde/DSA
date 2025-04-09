import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a =input.nextInt();
        System.out.println("Enter second Number");
        int b=input.nextInt();
        System.out.println("Choose mode of Operation: \n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        int c=input.nextInt();
        input.close();
        if(c==1){
            int add=a+b;
            System.out.println("Addition of a and b is "+add);
        }
        else if(c==2){
            int sub=a-b;
            System.out.println("Subtraction of a and b is "+sub);
        }
        else if(c==3){
            int mul=a*b;
            System.out.println("Multiplication of a and b is "+mul);
        }
        else if(c==4){
            int div=a/b;
            System.out.println("Division of a and b is "+div);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
