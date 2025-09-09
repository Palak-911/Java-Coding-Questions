import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter principle: ");
        float p = sc.nextFloat();;

        System.out.println("enter interest rate: ");
        float  rate = sc.nextFloat();;

        System.out.println("enter time: ");
        float time = sc.nextFloat();;;

        float SI=p*rate*time/100;

        System.out.println("SI is: "+ SI);

    }

}
