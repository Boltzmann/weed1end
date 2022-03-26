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

   @Test
   public void numbersDividableBy3_expRaute3_when3() {
      assertEquals("#3", mainWeed1.fizzbuzz(3));
   }

   @Test
   public void numbersDividableBy3_expRaute6_when6() {
      assertEquals("#6", mainWeed1.fizzbuzz(6));
   }

   @Test
   public void numbersDividableBy5_expDollar5_when5() {
      assertEquals("$5", mainWeed1.fizzbuzz(5));
   }

   @Test
   public void numbersDividableBy5_expDollar100_when100() {
      assertEquals("$100", mainWeed1.fizzbuzz(100));
   }

   @Test
   public void numbersDividableBy5And3_expRauteDollar15_when15() {
      assertEquals("#$15", mainWeed1.fizzbuzz(15));
   }

   @Test
   public void fizzbussInRangeOneToSix() {
      String partOfExpected = "1 2 #3 4 $5 #6";
      assertEquals(partOfExpected, mainWeed1.fizzbuzzInRange(1,6));
   }

   @Test
   public void fizzbuzzInRangeOneToHundred() {
      String partOfExpected = "$95 #96 97 98 #99 $100";
      assertEquals(partOfExpected, mainWeed1.fizzbuzzInRange(95,100));
   }
}
