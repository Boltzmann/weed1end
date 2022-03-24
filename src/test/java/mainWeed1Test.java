import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class mainWeed1Test {

   // +++ novice +++
   @Test
   public void nameTest() {

      assertEquals("Hello Weed!", mainWeed1.sayName("Weed"));
   }

   @Test
   public void nameL00pTest() {
      assertEquals("WeedWeedWeedWeedWeed", mainWeed1.nameL00p("Weed"));
   }

   @Test
   public void greaterZeroTestTrue(){
      assertTrue(mainWeed1.greaterZero(1));
   }

   @Test
   public void greaterZeroTestFalse(){
      assertFalse(mainWeed1.greaterZero(0));
   }

   @Test
   public void squareEasyTest(){
      assertEquals(4, mainWeed1.square(2));
   }

   @Test
   public void square_expect16_when4Test(){
      assertEquals(16, mainWeed1.square(4));
   }

   // +++ intermediate +++
   @Test
   public void numToWord_expectVier_when4 () {
      assertEquals("Vier", mainWeed1.numToWord(4));
   }
   @Test
   public void numToWord_expectAcht_when8 () {
      assertEquals("Acht", mainWeed1.numToWord(8));
   }

}
