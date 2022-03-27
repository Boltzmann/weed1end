import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntermediateTest {
    @Test
    void returnBackwardsTest() {
        Assertions.assertEquals("tseT", Intermediate.returnBackwards("Test"));
    }

    @Test
    void permutationTest() {
        int[] input = new int[]{2, 1};
        int[] expected = new int[]{1, 2};
        Assertions.assertArrayEquals(expected, Intermediate.permute(input, 0, 1));
    }

    @Test
    void pickOutSortTest() {
        int[] input = new int[]{6, 2, 8, 3, 9, 6};
        int[] expected = new int[]{2, 3, 6, 6, 8, 9};
        Assertions.assertArrayEquals(expected, Intermediate.pickOutSort(input));
    }
}
