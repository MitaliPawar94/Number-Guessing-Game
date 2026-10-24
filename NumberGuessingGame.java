import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to Number Guessing Game!!!!!");
        System.out.println("The computer has selected a number between 1 and 100.");
        
        String choose;
        do {
            int num = random.nextInt(1,101);
            int count=0;
            while (true) {
                System.out.println("Enter your Number:");
                int a=sc.nextInt();
                System.out.println("Your Guess:"+a);
                count++;
    
                if (num==a) {
                    System.out.println("Correct! You guessed the number!");
                    System.out.println("Congratulations! You guessed the number in "+count+" attempts!");
                    break;
                }
               
                else if (a>num) {
                    System.out.println("Too high! Try a lower number.");
                }
                else if (a<num) {
                    System.out.println("Too low! Try a higher number.");
                }
                if (count ==7) {
                    System.out.println("Game Over! You have used all your attempts.");
                    break;
                } 
                
            }

            System.out.println("Do you want to play again (Yes/No):");
            choose = sc.next();

        }
        while (choose.equalsIgnoreCase("yes"));

        
        
        sc.close();
    }
}