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

   @Test
   public void greaterZeroTestTrue(){
      assertTrue(mainWeed1.greaterZero(1));
   }

   @Test
   public void greaterZeroTestFalse(){
      assertFalse(mainWeed1.greaterZero(0));
   }

   @Test
   public void stringArrayOne2Ten() {
      String[] expect = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
      assertArrayEquals(expect, mainWeed1.numberOneToTenAsWords());
   }

   @Test
   public void simpleValueToWord_expectOne_when1() {
      assertEquals("Eins", mainWeed1.simpleValueToWord(1));
   }

   @Test
   public void simpleValueToWord_expectTwo_Nine_when2_9() {
      String[] expect = {"Null","Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
      for (int i = 2; i < 10; i++) {
         assertEquals(expect[i], mainWeed1.simpleValueToWord(i));
      }
   }

}
