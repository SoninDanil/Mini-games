public class MechanicsEasy {
    public static String calculation(ChoiceEasy userInput, ChoiceEasy randomChoice) {
        if ((userInput == ChoiceEasy.PAPER && randomChoice == ChoiceEasy.ROCK) ||
                (userInput == ChoiceEasy.ROCK && randomChoice == ChoiceEasy.SCISSORS) ||
                (userInput == ChoiceEasy.SCISSORS && randomChoice == ChoiceEasy.PAPER)) {
            System.out.println("Победил пользователь!");
            return "win";
        } else if ((userInput == ChoiceEasy.PAPER && randomChoice == ChoiceEasy.SCISSORS) ||
                (userInput == ChoiceEasy.ROCK && randomChoice == ChoiceEasy.PAPER) ||
                (userInput == ChoiceEasy.SCISSORS && randomChoice == ChoiceEasy.ROCK)) {
            System.out.println("Победила программа!");
            return "lose";
        } else {
            System.out.println("Ничья!");
            return "tie";
        }
    }
}
