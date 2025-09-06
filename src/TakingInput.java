//TAKING Integer INPUT:


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int num_1 = sc.nextInt();
//        System.out.println("Number is: "+num_1);
//
//    }
//}




//TAKING STRING INPUT:

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("name is "+ name);
    }
}