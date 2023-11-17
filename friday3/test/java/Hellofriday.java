import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Hellofriday {

    @Test
    void helloFromTest() {
        //Arrange
        String myValue = "Hello World";

        //Act
        String result = myValue + "!";

        //Assert
        assertEquals("Hello World!", result);

        //Arrange
        int numberOfElements = 500;

        //we can use a short (signed 16-bit integer) it will fit our values
        //  unless we increase the numberOfElements > Short.MAX_VALUE then we need another type
        short[] data = new short[numberOfElements];

        //Act
        //       the single letter `i` is often used in for loops to indicate the counter
        //             could be shorthand for `index`
        for (int i = 0; i < data.length; i++) {
            data[i] = (short) (i + 1);
            System.out.println("The value of index " + i + " is " + data[i]);

        }


        //Assert
        //  We can also use a while loop that has the same behavior as a for loop
        //      note: under the hood a for loop is compiled to an optimized while loop
        int index = 0;
        while (index < data.length) {
            //                           we use the 'post increment' operator '++'
            //                           you can see this construction of accessing arrays with a ++
            //                           in terse optimized code
            //                           can you figure out how this works?
            //
            //                                v
            assertEquals(index + 1, data[index++]);



        }
    }
}