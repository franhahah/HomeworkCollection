import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@Test
void passByValueTest() {
        }

        void addOne(int number) {
        number = number + 1;
        }


//Arrange
        int myValue = 1337;
//Act
        addOne(myValue);
//Assert
        assertEquals( number , myValue);

    }
}