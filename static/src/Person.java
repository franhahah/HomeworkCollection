public class Person {

// Variables (state)*

        String name;

        int age;

      // Constructor*

                public Person(String name, int age) {

this.name = name;

this.age = age;

}

// Methods (behavior)*

       public void displayInfo() {

System.out.println("Name: " + name + ", Age: " + age);

}

}