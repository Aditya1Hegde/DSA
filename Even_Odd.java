import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        // Number even or odd----input from user---scanner
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= input.nextInt();

        if(number%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is odd");
        }
        input.close();
    }
}