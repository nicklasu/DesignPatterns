package teht8templatemethod;

import java.util.Random;
import java.util.Scanner;

public class BlackJack extends Game {
    int player;
    int house;
    String winner;

    @Override
    void initializeGame() {
        player = 0;
        house = 0;
        System.out.println("Blackjack.");
        makePlay(1);
        makePlay(1);
        makePlay(2);
        System.out.println("House: " + house);
        makePlay(2);
        choiceMenu();
    }

    void choiceMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (player > 21) {
                endOfGame();
                break;
            }
            System.out.println("Me: " + player);
            System.out.println("Hit or Stay (1 for hit, 2 for stay)");
            String choice = scanner.nextLine();
            try {
                if (Integer.parseInt(choice) == 1) {
                    makePlay(1);
                } else {
                    endOfGame();
                    break;
                }
            } catch (Exception e) {
                break;
            }
        }
    }

    @Override
    void makePlay(int player) {
        switch (player) {
            case 1 -> this.player += drawCard();
            case 2 -> this.house += drawCard();
            default -> {
            }
        }
    }

    int drawCard() {
        //Not really how cards or blackjack works.
        Random random = new Random();
        return random.nextInt(1, 10);
    }

    @Override
    boolean endOfGame() {
        if (player > 21) {
            winner = "house";
        } else {
            while (true) {
                if (player > house) {
                    makePlay(2);
                    //It is an important check, not "always true"
                } else if (house >= player && house <= 21) {
                    winner = "house";
                    break;
                } else {
                    winner = "me";
                    break;
                }
            }
        }
        printWinner();
        return true;
    }

    @Override
    void printWinner() {
        System.out.println("My cards: " + player + ". House cards: " + house);
        System.out.println("Winner is: " + winner + "\n");
        initializeGame();
    }
}
