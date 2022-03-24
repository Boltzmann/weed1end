public class mainWeed1 {
    public static void main(String[] args) {

        System.out.println(sayName("Marlin"));
        System.out.println("Hallo "+nameL00p("Stefan")+"!");
        System.out.println(greaterZero(3));
        System.out.println(greaterZero(-1));
    }

    public static String sayName(String name) {
        return "Hello " + name + "!";
    }

    public static String nameL00p(String name) {
        String names = "";
        for (int i = 0; i < 5; i++) {
            names = names + name;
        }
        return names;

    }

    public static boolean greaterZero(int i) {
        if (i > 0){
            return true;
        } else {
            return false;
        }
    }

    public static String[] numberOneToTenAsWords() {
        String[] numbersAsWords = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
        return numbersAsWords;
    }

    public static String simpleValueToWord(int number) {
        switch(number) {
            case 1:
                return "Eins";
            case 2:
                return "Zwei";
            case 3:
                return "Drei";
            case 4:
                return "Vier";
            case 5:
                return "Fünf";
            case 6:
                return "Sechs";
            case 7:
                return "Sieben";
            case 8:
                return "Acht";
            case 9:
                return "Neun";
            default:
                return "";
        }
    }
}
