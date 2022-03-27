import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;

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
}
