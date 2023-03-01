package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String userChoice = getUserInput(sc);
            String computerChoice = getComputerInput();
            System.out.println("\nComputer choose: "+computerChoice);
            winnerCheck(userChoice,computerChoice);

            System.out.println("\nDo you want to play again? (y/n)");
            String playAgain = sc.nextLine();
            if (!playAgain.equals("y"))
                break;
        }
    }
    private static String getUserInput(Scanner sc) {
        System.out.println("\nOptions to choose from: \n1. Rock\n2. Paper\n3. Scissor");
        String userChoice;
        while (true){
            System.out.println("Please make your choice: ");
            userChoice= sc.nextLine().toLowerCase();
            if (isValidInput(userChoice))
                break;
            System.out.println(userChoice+" is not a valid move");
        }
        return userChoice;
    }
    private static boolean isValidInput(String userInput) {
        return userInput.equalsIgnoreCase("rock")||
                userInput.equalsIgnoreCase("paper")||
                userInput.equalsIgnoreCase("scissor");
    }
    private static String getComputerInput() {
        Random rand = new Random();
        int numberChoice = rand.nextInt(3)+1;
        String computerChoice;
        if (numberChoice==1)
            computerChoice="rock";
        else if (numberChoice==2)
            computerChoice="paper";
        else
            computerChoice="scissor";
        return computerChoice;
    }
    private static void winnerCheck(String userChoice, String computerChoice) {
        if (computerChoice.equalsIgnoreCase(userChoice)){
            System.out.println("The game is tied.");
        }
        else if (userChoice.equalsIgnoreCase("rock")) {
            if (computerChoice.equals("scissor"))
                System.out.println("You Win!!");
            else if (computerChoice.equals("paper"))
                System.out.println("You lose!");
        }
        else if (userChoice.equalsIgnoreCase("paper")) {
            if (computerChoice.equals("rock"))
                System.out.println("You Win!!");
            else if (computerChoice.equals("scissor"))
                System.out.println("You lose!");
        }
        else if (userChoice.equalsIgnoreCase("scissor")) {
            if (computerChoice.equals("paper"))
                System.out.println("You Win!!");
            else if (computerChoice.equals("rock"))
                System.out.println("You lose!");
        }
    }
}
