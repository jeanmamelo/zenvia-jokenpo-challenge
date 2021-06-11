package main;

import java.util.Scanner;

public class Jokenpo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int playerMove;

        Player playerOne = new Player();
        Player playerTwo = new Player();

        for (int i = 1; i <= 2; i++) {
            System.out.println("Player " + i + " - Choose a number to describe your move:");
            System.out.println(validMoves());

            try {
                playerMove = scan.nextInt();
                while (playerMove < 0 || playerMove > 2) {
                    System.out.println("Not a valid move. Please choose a valid one (0-2):");
                    System.out.println(validMoves());
                    playerMove = scan.nextInt();
                }
            } catch(Exception e) {
                System.out.println("Sorry, only numbers allowed.");
                return;
            }

            if (i == 1) {
                playerOne.setMove(playerMove);
            } else {
                playerTwo.setMove(playerMove);
            }
        }

        String gameResult = checkGameResult(playerOne.getMove(), playerTwo.getMove());
        System.out.println(gameResult);
    }

    private static String validMoves() {
        return "0 - Rock\n1 - Paper\n2 - Scissors";
    }

    public static String checkGameResult(int playerOneMove, int playerTwoMove) {

        String result = "";

        if (playerOneMove == playerTwoMove) {
            return "A tie.";
        }

        switch (playerOneMove) {
            case 0:
                result = playerTwoMove == 1 ? "Player Two Wins." : "Player One Wins.";
                break;
            case 1:
                result = playerTwoMove == 2 ? "Player Two Wins." : "Player One Wins.";
                break;
            case 2:
                result = playerTwoMove == 0 ? "Player Two Wins." : "Player One Wins.";
                break;
        }

        return result;
    }
}