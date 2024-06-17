public class Mechanics {
    public static String calculation(Choice userInput, Choice randomChoice) {
        if ((userInput == Choice.PAPER && randomChoice == Choice.ROCK) ||
                (userInput == Choice.ROCK && randomChoice == Choice.SCISSORS) ||
                (userInput == Choice.SCISSORS && randomChoice == Choice.PAPER)) {
            System.out.println("Победил пользователь!");
            return "win";
        } else if ((userInput == Choice.PAPER && randomChoice == Choice.SCISSORS) ||
                (userInput == Choice.ROCK && randomChoice == Choice.PAPER) ||
                (userInput == Choice.SCISSORS && randomChoice == Choice.ROCK)) {
            System.out.println("Победила программа!");
            return "lose";
        } else {
            System.out.println("Ничья!");
            return "tie";
        }
    }
}
