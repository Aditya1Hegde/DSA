import java.util.Scanner;

public class Currency_Convertor{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter indian rupees to be converted to dollars: ");
        int ind=input.nextInt();
        input.close();
        float dol= ind/80f;
        System.out.println("Rupees to dollars: "+"$"+dol);
    }
}
