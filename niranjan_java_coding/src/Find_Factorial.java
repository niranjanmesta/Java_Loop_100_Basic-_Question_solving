// Find the Factorial value of any number entered through the keyboard.

import java.util.Scanner;

public class Find_Factorial {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        int num ;
        int factorial =1;
        System.out.print("Enter the number which you want factorial of that number : " );
        num = console.nextInt();
        System.out.println("Factorial number of " +num);

        for (int i=1;i<=num;i++){
            factorial *= i;



        }
        System.out.println("Factorial : " +factorial);
        



    }
}
