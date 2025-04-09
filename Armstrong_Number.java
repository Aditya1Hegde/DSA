import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        //Armstrong number=12---(1+^Number of their digit i.e 2)+(2+^ 2)
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=input.nextInt();
        input.close();

        int originalNumber=number;
        int sum=0;
        int NumDigits=String.valueOf(number).length();
        while(number>0){
            int digit=number%10;
            sum+=Math.pow(digit,NumDigits);
            number/=10;
        }
        System.out.println("Armstrong value is: "+sum);

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

    }
}
