import java.util.Scanner;

    public class sumOfStreamNumbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;

            while (n!=-1){
                sum = sum + n;
                n = sc.nextInt();
            }
            System.out.println("Sum of "+ n +"numbers is: "+ sum);
        }
    }
