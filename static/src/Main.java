public class Main {

public static void main(String[] args) {

// Creating objects of the Person class*

//Person person1 = new Person();
//
//Person person2 = new Person();
//
//// Setting values for object variables*
//
//person1.name = "Alice";
//
//person1.age = 30;
//
//person2.name = "Bob";
//
//person2.age = 25;

    Person person3 = new Person("Al3", 100);

    Person person4 = new Person("Bob33", 100);


// Calling methods on objects*

person3.displayInfo(); // Output: Name: Alice, Age: 30*

person4.displayInfo(); // Output: Name: Bob, Age: 25*



    @Test void passByValueTest() {
        int myValue=1337;

    }

    void addOne(int number) {
        number = number + 1;
    }
addOne(myValue);


}

}

