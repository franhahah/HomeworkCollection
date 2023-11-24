import static org.junit.Assert.assertEquals;

public class test {
    @Test
    void passByValueTest() {
        int myValue = 1337;
//Act
        addOne(myValue);
//Assert
        assertEquals(1337, myValue);
    }

    void addOne(int number) {
        number = number + 1;
    }
//
}