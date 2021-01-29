import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
        BigClass testObject = new BigClass(); //ska inte skriva in något för att veta att det är just get/set som fixar det
        String expected = "Maria";
        testObject.setText("Maria");  // testa att skriva något annat i stringen
        Assertions.assertEquals(expected, testObject.getText());
    }

    @Test
    void testNumberGetAndSet(){
        BigClass testObject = new BigClass ();
        int expected = 0;
        testObject.setNumber(0); // testa att skriva en annan siffra
        Assertions.assertEquals(expected, testObject.getNumber());
    }

    @Test
    @DisplayName("testar metoden toUpperCase")
    void test(){
        BigClass testObject = new BigClass();
        testObject.setText("blabla");
        String actual = testObject.textToUpperCase();
        String expected = "BLABLA";
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


    /* //Om det inte finns en metod då kan man testa så
    @ParameterizedTest
    @DisplayName("testar metoden toUpperCase: andra sättet")
    @CsvSource({
            "MARIA, Maria",
            "ALEXEY, aLeXey"
    })
    void testToUpperCase(String expected, String input){
        String actual = input.toUpperCase();
        Assertions.assertEquals(expected, actual);
    }
    */



}
