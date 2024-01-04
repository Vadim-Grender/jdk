package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MontyHallProblem {
    private static final int TOTAL_TESTS = 1000;

    public static void main(String[] args) {
        Map<Integer, String> results = new HashMap<>();

        for (int i = 1; i <= TOTAL_TESTS; i++) {
            boolean playerWins = playMontyHall();
            results.put(i, playerWins ? "Win" : "Lose");
        }

        int wins = (int) results.values().stream().filter(result -> result.equals("Win")).count();
        int losses = TOTAL_TESTS - wins;

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static boolean playMontyHall() {
        Random random = new Random();
        int carPosition = random.nextInt(3);
        int playerChoice = random.nextInt(3);

        int goatDoor;
        do {
            goatDoor = random.nextInt(3);
        } while (goatDoor == carPosition || goatDoor == playerChoice);

        int newChoice;
        do {
            newChoice = random.nextInt(3);
        } while (newChoice == playerChoice || newChoice == goatDoor);

        return newChoice == carPosition;
    }
}
