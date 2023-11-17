import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyFirstTest {

    @Test
    void helloFromTest() {
        //Arrange
        String myValue = "Hello World";

        //Act
        String result = myValue + "!";

        //Assert
        assertEquals("Hello World!", result);

        int largestNumberForInt = 2147483647;
        int smallestNumberForInt = -2147483648;

        assertEquals(2147483647, largestNumberForInt);
        double avogadro = 6.02214076E23;
        assertEquals(avogadro, 6.02214076E23);

        double valueFromInt = largestNumberForInt;
        assertEquals(2147483647, valueFromInt);

        int avogadroAsInt = (int) avogadro;
        assertEquals(2147483647, avogadroAsInt);





    }
}
//
//    double price= 9.99;
//    byte slices=6;
//    boolean vegetarian=true;
//    string name= "Piet veerman";