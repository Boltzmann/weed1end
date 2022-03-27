import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class Intermediate {
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
}
