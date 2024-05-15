import java.util.Scanner;

public class Sum_of_odd_and_even_number {
    public static void main(String[] args) {
         @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        int number ;
        char choice;
        int sumofeven =0;
        int sumofodd = 0;
       do
       { System.out.print("Enter the number :");
        number =console.nextInt();
        if(number % 2 == 0)
        {
            sumofeven += number;
        }
        else
        {
            sumofodd += number;
        }
        System.out.print("please enter if continue : y/n");
        choice = console.next().charAt(0);
    }while(choice=='y' || choice =='Y');
            System.out.println("Sum of the even number is : " + sumofeven);
            System.out.println("Sum of the odd number is : " + sumofodd);


        
 }

}

