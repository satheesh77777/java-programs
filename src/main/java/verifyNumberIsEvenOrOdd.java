import java.util.Scanner;

public class verifyNumberIsEvenOrOdd {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("kindly enter the Number:");
        int Num = sc.nextInt();
        if (Num%2==0){

            System.out.println("The given number is even number");
        }else {
            System.out.println("The given number is odd number");

        }

    }
}
