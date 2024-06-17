public class TableEasy {

    public static void table(int wins, int losses, int ties, int totalGames) {
        double statistics = wins * 100.0 / (totalGames - ties);
        System.out.print("+");
        System.out.print("-------".repeat(8));
        System.out.println("+");
        System.out.println("| ПОБЕД | ПОРАЖЕНИЙ | НИЧЬЯ |  ВСЕГО ИГР | ПРОЦЕНТ ПОБЕД |");
        System.out.println("|-------+-----------+-------+------------+---------------+");
        System.out.printf("|    %d  |        %d  |    %d  |         %d  |   %10.2f  |\n", wins, losses, ties,
                totalGames, statistics);
        System.out.print("+");
        System.out.print("-------".repeat(8));
        System.out.println("+");
    }
}