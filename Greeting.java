import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name= input.nextLine();
        System.out.print("Hello "+name);
        input.close();
    }
}
