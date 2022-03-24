import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class mainWeed1Test {
   @Test
   public void nameTest() {
      Assertions.assertEquals("Hello Weed!", mainWeed1.sayName("Weed"));
   }

}
