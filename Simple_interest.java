import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        int principal = input.nextInt();
        System.out.println("Enter Time: ");
        int time=input.nextInt();
        System.out.println("Enter Rate: ");
        int rate=input.nextInt();
        input.close();
        int amount=(principal*time*rate)/100;
        System.out.println("Simple Interest is: "+amount);
    }
}
