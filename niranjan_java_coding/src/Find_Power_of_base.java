// Two numbers are entered through the keyboard .w.a.p to find the value of one number raised to power of another 

import java.util.Scanner;

public class Find_Power_of_base {
    public static void main(String[] args) {
         @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
         int base;
         int power;
         int result = 1;
         System.out.println("Enter your Base number ");
         base = console.nextInt();
         System.out.println("Enter your power number ");

         power=console.nextInt();
         for(int i=1; i<=power; i++){
            result *= base;
         }
System.out.println("Result : " +result);

    }
    
}
