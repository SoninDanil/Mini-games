public class Mechanics {
    public static String calculation(Choice userInput, Choice randomChoice) {
        if ((userInput == Choice.PAPER && (randomChoice == Choice.ROCK || randomChoice == Choice.SPOCK)) ||
                (userInput == Choice.ROCK && (randomChoice == Choice.SCISSORS || randomChoice == Choice.LIZARD)) ||
                (userInput == Choice.SCISSORS && (randomChoice == Choice.PAPER || randomChoice == Choice.LIZARD)) ||
                (userInput == Choice.LIZARD && (randomChoice == Choice.SPOCK || randomChoice == Choice.PAPER)) ||
                (userInput == Choice.SPOCK && (randomChoice == Choice.ROCK || randomChoice == Choice.SCISSORS))) {
            System.out.println("Победил пользователь!");
            return "win";
        } else if ((randomChoice == Choice.PAPER && (userInput == Choice.ROCK || userInput == Choice.SPOCK)) ||
                (randomChoice == Choice.ROCK && (userInput == Choice.SCISSORS || userInput == Choice.LIZARD)) ||
                (randomChoice == Choice.SCISSORS && (userInput == Choice.PAPER || userInput == Choice.LIZARD)) ||
                (randomChoice == Choice.LIZARD && (userInput == Choice.SPOCK || userInput == Choice.PAPER)) ||
                (randomChoice == Choice.SPOCK && (userInput == Choice.ROCK || userInput == Choice.SCISSORS))) {
            System.out.println("Победила программа!");
            return "lose";
        } else {
            System.out.println("Ничья!");
            return "tie";
        }
    }
}
