import java.sql.SQLOutput;
import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n=sc.nextInt();

        int num=1;
        int sum=0;

        while(num<=n){
            sum+=num;
            num++;
        }

        System.out.println("Sum of "+ n +"numbers is: "+ sum);
    }
}
