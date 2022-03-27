import org.jetbrains.annotations.NotNull;

public class ExpertExercises {
    public static void main(String[] args) {
    }

    public static String returnBackwards(@NotNull String string2revert) {
        char tmp;
        String backwards = "";
        for (int i = string2revert.length() - 1; i > -1; i--) {
            tmp = string2revert.charAt(i);
            backwards = backwards.concat(String.valueOf(tmp));
        }
        return backwards;
    }

    public static int[] permute(int[] input, int back, int front) {
        int tmp = input[back];
        input[back] = input[front];
        input[front] = tmp;
        return input;
    }

    public static int[] pickOutSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int minimum = i;
            for(int a = i; a < input.length; a++) {
                if (input[a] < input[minimum]) {
                    minimum = a;
                }
            }
            permute(input, i, minimum);
        }
        return input;
    }

    public static String[] separateStringByComma(String toBeSeparated) {
        return toBeSeparated.split(",");
    }

    public static int checksum(int number) {
        char[] numberCharArray = Integer.toString(number).toCharArray();
        int checksum = 0;
        for (char c : numberCharArray) {
            checksum += Character.getNumericValue(c);
        }
        return checksum;
    }

    public static String asRomanNumber(int integer) {
        String romanNumber = "";
        if(integer/100 > 0) {
            romanNumber += "C".repeat(integer/100);
            integer %= 100;
        }
        if(integer/50 > 0) {
            romanNumber += "L".repeat(integer/50);
            integer %= 50;
        }
        if(integer/10 > 0) {
            romanNumber += "X".repeat(integer/10);
            integer %= 10;
        }
        if(integer/5 > 0) {
            romanNumber += "V".repeat(integer/5);
            integer %= 5;
        }
        if(integer > 0) {
            romanNumber += "I".repeat(integer);
        }
        return romanNumber;
    }

    public static String numberOccurencesOfIntAsLiterals(int integer, int romanIntToReplace, String romanLiteral) {
        String replaced = "";
        if(integer/romanIntToReplace > 0) {
            replaced += romanLiteral.repeat(integer/romanIntToReplace);
        }
        return replaced;
    }
}
