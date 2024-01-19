import java.util.Scanner;
import java.util.Random;

class NumberGuess 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int score = 0;
        int option = 1;
        int n = 5;

        System.out.println("Let's start the game");

        while (option == 1) 
        {
            int num = r.nextInt(100) + 1;

            int attempt = 0;
            int i;

            for (i = 1; i <= n; i++) 
            {
                attempt++;

                System.out.println("\nEnter your guess: ");
                int guess = sc.nextInt();

                if (guess == num) 
                {
                    System.out.println("\nYou won. Your guess is correct");
                    score += 100;
                    break;
                } 
                
                else if (guess < num) 
                {
                    System.out.println("\nYour guess is too low"); 
                    score -= 10;
                } 
                
                else if (guess > num) 
                {
                    System.out.println("\nYour guess is too high");
                    score += 25;
                } 
                
                else 
                {
                    System.out.println("\nInvalid guess.");
                }

                if (i == n) 
                { 
                    System.out.println("\nOops! You've run out of attempts.");
                }

            }

            System.out.println();
            System.out.println("\nDo you want to Play again (1 for yes, 0 for no)");
            option = sc.nextInt();

            if (option == 0) {
                System.out.println("Your total score is: " + score);
                System.out.println("THANK YOU!");
            }
        }
    }
}