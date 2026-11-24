import java.util.Scanner;
public class GuessingGamesubroutine {
    static void playgame() {
        Scanner sc = new Scanner(System.in);
        int Comnum;
        int Guess;
        int Guesscount = 0;
        Comnum = (int) ((Math.random() * 100) + 1);
        while (true) {

            System.out.println("Enter a number, you have "+(6-Guesscount) + " chances to find the computer's number");
            Guess = sc.nextInt();
            Guesscount++;
            if (Guess == Comnum) {
                System.out.println("You guessed the correct number after " + Guesscount + " guesses.");
                break;
            }
            if (Guesscount == 6) {
                System.out.println("Sorry you have used all your chances, the number was "+Comnum);
                break;
            }
            if (Guess < Comnum) {
                System.out.println("Your guess is lower than the number, try again");
            }
            if (Guess > Comnum) {
                System.out.println("Your guess is higher than the number, try again");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean play ;
        do {
            playgame();
            System.out.println("Would you like to play again? ");
            play = sc.nextBoolean();
        } while (play);
    }
}
