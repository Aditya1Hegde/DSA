import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second Number: ");
        int b = input.nextInt();
        input.close();
        if (a > b) {
            System.out.println("a is the Largest number.");
        }
        else if(a == b){
            System.out.println("a and b are same.");
        }
        else{
            System.out.println("b is the Largest number.");
        }
    }

    }

