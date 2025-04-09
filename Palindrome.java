import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int j =0;
        System.out.println("Enter String: ");
        String string=input.nextLine();
        input.close();
        char[] original=string.toCharArray();
        int length=original.length;
        char[] palindrome=new char[length];
        for(int i=length-1;i>=0;i--){
            palindrome[j]=original[i];
            j++;
        }
        System.out.println(palindrome);
    }
}
