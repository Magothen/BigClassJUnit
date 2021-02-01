import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class BigClassTest {

    @Test
    void testBigClassConstructor(){  //tom konstruktor
        BigClass testObject = new BigClass();
        BigClass testObject2 = new BigClass(0, "hej");
        BigClass testObject3 = new BigClass(0);
        BigClass testObject4 = new BigClass("hej");
        Assertions.assertEquals(0, testObject.getNumber());
        Assertions.assertNull(null, testObject.getText());
        Assertions.assertEquals(0, testObject3.getNumber());
        Assertions.assertNull(null, testObject4.getText());
        Assertions.assertNull(null, testObject2.getText());
        Assertions.assertEquals(0, testObject2.getNumber());
    }

    @Test
    void testTextGetAndSet(){
        BigClass testObject = new BigClass(); //ska inte skriva in något här inom prentes för att veta att det är just get/set som fixar att sätta värdet
        String expected = "Maria";
        testObject.setText("Maria");  // testa att skriva något annat i stringen
        Assertions.assertEquals(expected, testObject.getText());
    }

    @Test
    void testNumberGetAndSet(){
        BigClass testObject1 = new BigClass ();
        BigClass testObject2 = new BigClass ();
        int expected1 = 3;
        int expected2 = 0; //testa skriva ett negativt tal - number borde sättas till 0 och ett felmeddelande ska komma från else
        testObject1.setNumber(3); // testa att skriva en annan siffra, t.ex. om man skriver ett negativt tal så kommer det upp meddelande från else
        testObject2.setNumber(-3);
        Assertions.assertEquals(expected1, testObject1.getNumber());
        Assertions.assertEquals(expected2, testObject2.getNumber());
    }

    @Test
    @DisplayName("testar metoden toUpperCase")
    void testToUpperCase(){
        BigClass testObject = new BigClass();
        testObject.setText("blabla");
        String actual = testObject.textToUpperCase();
        String expected = "BLABLA"; // testa att skriva något annat
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("testar metodet textToNull")
    void testTextToNull(TestInfo testInfo){
        BigClass testObject = new BigClass();
        String actual = testObject.textToNull();
        Assertions.assertNull(actual);
        System.out.println("Test " + testInfo.getDisplayName() + " concluded");
    }

    @Test
    @DisplayName("testar metoden AddNumber")
    void testAddNumber(){
        BigClass testObject = new BigClass(5);
        int expected = 8;
        int actual = testObject.addNumber(3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("testar metoden toString")
    void testToString(){
        BigClass testObject = new BigClass(0, null);
        Assertions.assertEquals("0 + null", testObject.toString());
    }
}
