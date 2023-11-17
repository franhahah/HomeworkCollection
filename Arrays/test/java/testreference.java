public class testreference {int myValue = 1337;
    //Act
    addOne(myValue);
    //Assert
    }

    @Test
    void passByValueTest() {
    }

    void addOne(int number) {
        number = number + 1;
    }
}
