import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExpertExerciseTest {
    @Test
    void returnBackwardsTest() {
        Assertions.assertEquals("tseT", ExpertExercises.returnBackwards("Test"));
    }

    @Test
    void permutationTest() {
        int[] input = new int[]{2, 1};
        int[] expected = new int[]{1, 2};
        Assertions.assertArrayEquals(expected, ExpertExercises.permute(input, 0, 1));
    }

    @Test
    void pickOutSortTest() {
        int[] input = new int[]{6, 2, 8, 3, 9, 6};
        int[] expected = new int[]{2, 3, 6, 6, 8, 9};
        Assertions.assertArrayEquals(expected, ExpertExercises.pickOutSort(input));
    }

    @Test
    void separateStringByComma() {
        String input = "Wort, Name.";
        Assertions.assertEquals("Wort", ExpertExercises.separateStringByComma(input)[0]);
        Assertions.assertEquals(" Name.", ExpertExercises.separateStringByComma(input)[1]);
    }

    @Test
    void separateStringByComma2() {
        String input = "Teil1, Teil2.";
        Assertions.assertEquals("Teil1", ExpertExercises.separateStringByComma(input)[0]);
        Assertions.assertEquals(" Teil2.", ExpertExercises.separateStringByComma(input)[1]);
    }

    @Test
    void checksumSmallNumber() {
        Assertions.assertEquals(3, ExpertExercises.checksum(12));
    }

    @Test
    void replaceLiteralWithNumberOfOccurenceOfInt() {
        Assertions.assertEquals("CCCC", ExpertExercises.numberOccurencesOfIntAsLiterals(499, 100, "C"));
        Assertions.assertEquals("X".repeat(9), ExpertExercises.numberOccurencesOfIntAsLiterals(98, 10, "X"));
    }

    @Test
    void asRomanNumber_expectLXXXXVIII_when98() {
        // Gib eine Ganzzahl (1-100) als römische Zahl aus (12 = XII)
        // I V  X  L   C
        // 1 5 10 50 100
        Assertions.assertEquals("LXXXXVIII", ExpertExercises.asRomanNumber(98));
        Assertions.assertEquals("XII", ExpertExercises.asRomanNumber(12));
    }
}
