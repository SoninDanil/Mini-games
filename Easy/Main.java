import java.util.Scanner;
import java.util.Random;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static Choice[] choice = Choice.values();
    private static int wins = 0;
    private static int losses = 0;
    private static int ties = 0;
    private static int totalGames = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите (PAPER, ROCK, или SCISSORS) или 'EXIT' для окончания игры: ");
            String user = scanner.nextLine();
            if (user.equalsIgnoreCase("EXIT")) {
                Table.table(wins, losses, ties, totalGames);
                break;
            }
            if (!isValidChoice(user)) {
                System.out.println("Некорректный ввод.\n Пожалуйста, введите: PAPER, ROCK, или SCISSORS.");
                continue;
            }
            roundResult(user);
        }
    }

    public static void roundResult(String user) {
        Choice userInput = Choice.valueOf(user);
        int randomIndex = random.nextInt(choice.length);
        Choice randomChoice = choice[randomIndex];
        System.out.println("Вы выбрали: " + userInput);
        System.out.println("Программа выбрали: " + randomChoice);
        String result = Mechanics.calculation(userInput, randomChoice);
        switch (result) {
            case "win":
                wins++;
                totalGames++;
                break;
            case "lose":
                losses++;
                totalGames++;
                break;
            case "tie":
                ties++;
                totalGames++;
                break;
        }
    }

    private static boolean isValidChoice(String userInput) {
        for (Choice choice : Choice.values()) {
            if (choice.name().equalsIgnoreCase(userInput)) {
                return true;
            }
        }
        return false;
    }
}