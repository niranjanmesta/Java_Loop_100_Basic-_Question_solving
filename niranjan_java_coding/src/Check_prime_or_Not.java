// Write a program that prompts the user to input a postive number .
// It should then output a message indicating whether the number is a prime number.

import java.util.Scanner;

public class Check_prime_or_Not {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        int number;

        System.out.print("Enter the Nummber : ");
        number = console.nextInt();

        boolean flag =true;
        for(int i=2;i<number;i++){
            if(number % i==0){
                flag=false;
                break;
            }
        }
        if(flag&&number >1){
            System.out.println(+number+ " is prime :");
        }
        else
        {
            System.out.println(+number+" is not Prime : ");
        }
    }
    
}
