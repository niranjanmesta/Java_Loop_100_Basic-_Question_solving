
// write a program the user to input an integer and then outputs the number with the digits reversed .
//for example if inputs is 12345 the outpyut shuld be 54321

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
         @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        int num ;
        int resevered_number = 0 ;
        System.out.println("Enter the number :");
        num = console.nextInt();
        int temp = num ;
        int rem =0;
        while(temp>0)
        {
            rem = temp % 10;
            resevered_number= resevered_number *10 +rem;
             temp /= 10;
        }
        System.out.println("Reverse of " +num + " is " +resevered_number);


    }
    
}
