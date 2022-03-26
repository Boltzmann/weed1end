public class mainWeed1 {
    public static void main(String[] args) {

        System.out.println(sayName("Marlin"));
        System.out.println("Hallo "+nameL00p("Stefan")+"!");
        System.out.println(greaterZero(3));
        System.out.println(greaterZero(-1));
        System.out.println(fizzbuzzInRange(1,100));
    }

    public static String sayName(String name) {
        return "Hello " + name + "!";
    }

    public static String nameL00p(String name) {
        return String.valueOf(name).repeat(5);
    }

    public static boolean greaterZero(int i) {
        return i > 0;
    }

    public static String[] numberOneToTenAsWords() {
        String[] numbersAsWords = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
        return numbersAsWords;
    }

    public static String simpleValueToWord(int number) {
        return switch (number) {
            case 1 -> "Eins";
            case 2 -> "Zwei";
            case 3 -> "Drei";
            case 4 -> "Vier";
            case 5 -> "Fünf";
            case 6 -> "Sechs";
            case 7 -> "Sieben";
            case 8 -> "Acht";
            case 9 -> "Neun";
            default -> "";
        };
    }

    public static String fizzbuzz(int i) {
        if (i % 3 == 0) {
            if (i % 5 == 0)
                return "#$" + i;
            return "#" + i;
        } else if (i % 5 == 0) {
            return "$" + i;
        }
        return Integer.toString(i);
    }

    public static String fizzbuzzInRange(int from, int to) {
        StringBuilder output = new StringBuilder();
        for (int i = from; i <= to; i++) {
            output.append(fizzbuzz(i));
            if (i != to) {
                output.append(" ");
            }
        }
        return output.toString();
    }
}
