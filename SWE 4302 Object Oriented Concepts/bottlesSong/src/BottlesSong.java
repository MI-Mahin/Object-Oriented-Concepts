public class BottlesSong {
    public static void main(String[] args) {
        for (int NumberOfBottles=99; NumberOfBottles>=0; NumberOfBottles--){
            System.out.println(BeerBottle(NumberOfBottles));
        }

    }

    public  static String BeerBottle(int numberOfBottles) {
        return switch (numberOfBottles) {
            case 0 -> "No more bottles of milk on the wall, no more bottles of milk.\n" +
                    "Go to the store and buy some more, 99 bottles of milk on the wall.";

            case 1 -> "1 bottle of milk on the wall, 1 bottle of milk.\n" +
                    "Take it down and pass it around, no more bottles of milk on the wall.";

            case 2 -> "2 bottles of milk on the wall, 2 bottles of milk.\n" +
                    "Take one down and pass it around, 1 bottle of milk on the wall.";

            default -> numberOfBottles + " bottles of milk on the wall, " + numberOfBottles + " bottles of milk.\n" +
                    "Take one down and pass it around, " + (numberOfBottles - 1) + " bottles of milk on the wall.\n";

        };
    }
}
