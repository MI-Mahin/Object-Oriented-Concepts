public class FirstClass {
    public static void main(String[] args) {
        int switchValue = 4;

        switch (switchValue) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> System.out.println("Value is 4,5,6");
            default -> System.out.println("Value is not anything");
        }
        String month = "January";
        System.out.println(getQuarter(month));
    }
    public static String getQuarter(String month){
        return switch (month) {
            case "January" -> "1st";
            case "February" -> "2nd";
            case "March" -> "3rd";
            default -> month;
        };
    }
}
