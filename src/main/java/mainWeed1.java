
import java.util.Arrays;
import java.util.Scanner;
public class mainWeed1 {

    public static void main(String[] args) {

        /* +++ novice +++

        System.out.println(sayName("Marlin"));
        System.out.println("Hallo "+nameL00p("Stefan")+"!");
        System.out.println(greaterZero(3));
        System.out.println(greaterZero(-1));
        weedAntGreet();
        System.out.println(zahlenWoerter[2]);

         */
        countTo100();
        wordsToArray();

    }

    // +++ novice +++

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

    public static int square(int number) {
        return number *= number;
    }

    public static void weedAntGreet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib deinen Namen ein und drücke ENTER:");
        String input = scanner.nextLine();

        System.out.println(sayName(input));
    }

    // +++ intermediate +++

    static String[] zahlenWoerter = {
            "Eins",
            "Zwei",
            "Drei",
            "Vier",
            "Fünf",
            "Sechs",
            "Sieben",
            "Acht",
            "Neun",
            "Zehn"
    };

    public static String numToWord(int i) {
        switch (i) {
            case 1:
                return zahlenWoerter[0];
            case 2:
                return zahlenWoerter[1];

            case 3:
                return zahlenWoerter[2];

            case 4:
                return zahlenWoerter[3];

            case 5:
                return zahlenWoerter[4];

            case 6:
                return zahlenWoerter[5];

            case 7:
                return zahlenWoerter[6];

            case 8:
                return zahlenWoerter[7];

            case 9:
                return zahlenWoerter[8];

            default:
                return "Bitte nur einstellige Zahlen";

        }
    }

    public static void countTo100 () {
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("#$" + i);
            } else if ( i % 3 == 0) {
                System.out.println("#" + i);
            } else if ( i % 5 == 0) {
                System.out.println("$" + i);
            } else {
                System.out.println(i);
            }

        }
    }

    public static void wordsToArray (){
        String[] wordArr = new String[3];
        int ind = 0;
        for (int i = wordArr.length; i > 0; i--){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bereits eingegebene Wörter: " + Arrays.toString(wordArr));
            System.out.println("Noch " + i + " Eingaben übrig.");
            System.out.println("Gib 1 neues Wort ein:");
            String input = scanner.nextLine();
            wordArr[ind] = input;
            ind ++;

        }
    }

}
