import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntermediateTest {
    @Test
    void returnBackwardsTest() {
        Assertions.assertEquals("tseT", Intermediate.returnBackwards("Test"));
    }
}
