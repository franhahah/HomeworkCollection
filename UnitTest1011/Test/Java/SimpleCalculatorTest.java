import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import org.junit.jupiter.api.Test;


public class SimpleCalculatorTest {
    @Test
    public void testAdd() {
        // Arrange
        SimpleCalculator calculator = new SimpleCalculator();
        int a = 10;
        int b = 20;
        int expectedResult = 30;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals("The add method should add two numbers", expectedResult, result);
        System.out.println("exp:" + expectedResult);
        System.out.println("result" + result);
    }

    @Test
    public void testSubtract() {
        // Arrange
        SimpleCalculator calculator = new SimpleCalculator();
        int a = 60;
        int b = 40;
        int expectedResult = 20;


        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals("The subtract method should subtract two numbers", expectedResult, result);
        System.out.println("exp:" + expectedResult);
        System.out.println("result" + result);
    }

    @Test
    public void testmultiply() {
        //arrange
        SimpleCalculator calculator = new SimpleCalculator();
        int a = 6;
        int b = 3;
        int expectedResult = 18;

        //act
        int result = calculator.multiply(a, b);

        //assert
        assertEquals(expectedResult, result);
        System.out.println("exp:" + expectedResult);
        System.out.println("result" + result);

    }

    @Test
    public void testdivide() {
        SimpleCalculator calculator = new SimpleCalculator();
        int a = 6;
        int b = 3;
        double expectedResult = 2.0;

        //act
        double result = calculator.divide(a, b);

        //assert
        assertEquals(expectedResult, result, 0);
        System.out.println("exp:" + expectedResult);
        System.out.println("result" + result);

    }





    @Test
    public void testadd() {
        //arrange
        SimpleCalculator calculator = new SimpleCalculator();
        int a = 10;
        int b = 6;
        int expectedResult = 16;
        int result;
        //act
        result = calculator.add(a, b);

        //assert

        assertEquals(expectedResult, result);
        System.out.println("exp:" + expectedResult);
        System.out.println("result" + result);
    }
}











