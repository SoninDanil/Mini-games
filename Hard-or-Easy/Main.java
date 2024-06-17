import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("В какую игру вы хотите сыграть ?");
            System.out.print("Усложненную нажмите (1). Обычную нажмите (2): ");
            int choicePlay = scanner.nextInt();
            if (choicePlay == 1) {
                Hard.main(args);
                break;
            } else if (choicePlay == 2) {
                Easy.main(args);
                break;
            } else {
                System.out.println("Ввод не верный ! Попробуйте еще раз");
                continue;
            }
        }
    }
}
