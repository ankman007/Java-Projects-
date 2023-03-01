package NumberGussingGame;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(50)+1;
        numberGuess(sc, randomNumber);

        sc.close();
    }
    private static void numberGuess(Scanner sc, int randomNumber) {
        int count=0;
        while (true){
            System.out.println("\nEnter your guess (1-100): ");
            int playerGuess = sc.nextInt();
            count++;

            if (playerGuess== randomNumber){
                System.out.println("\nCorrect!! You Win!!");
                System.out.println("It took you "+count+" tries.");
                break;
            }
            else if (randomNumber >playerGuess)
                System.out.println("\nIncorrect, the number is higher. Guess again");
            else
                System.out.println("\nIncorrect, the number is lower. Guess again.");
        }
    }
}
