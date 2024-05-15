// Write a program that promts the user to input a postive integer.it should then print the mulplication table of that number.0

import java.util.Scanner;

public class Multiplication_table {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.println("Enter the number : ");
         num = console.nextInt();
         System.out.println("mulplication table of " +num);
         for(int i=1;i<=10;i++)
         {
           System.out.println(num+ " X " +i+ " = 5" +(num*i));
    }
}
}