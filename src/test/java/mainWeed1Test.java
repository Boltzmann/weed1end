import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class mainWeed1Test {
   @Test
   public void nameTest() {

      assertEquals("Hello Weed!", mainWeed1.sayName("Weed"));
   }

   @Test
   public void nameL00pTest() {
      assertEquals("WeedWeedWeedWeedWeed", mainWeed1.nameL00p("Weed"));
   }

}
