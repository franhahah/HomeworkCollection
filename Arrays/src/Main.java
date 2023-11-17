import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);


        }
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "}, // first array
                {"Smith", "Jones"}         // second array
        };
// Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
// Ms. Jones
        System.out.println(names[0][2] + names[1][1]);

        long [] a= {3,6,9};
        long [] b={22,44,88};

         long [] answer = new long[a.length];
                 for ( int i=0; i<(a.length); i++) {
                 answer[i]= a[i] + b[i];
                     System.out.println("answer"+ i+  "=" +answer[i]);
        }

                 int[] items = new int[16];

//write*
        for (int i = 0; i < items.length; i++) {
            items[i] = i+1;
        }
//read*
        for (int i = 0; i < items.length; i++) {
 System.out.println("items :" + i + "=" + items[i]);
        }


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//enhanced for loop*
        for (int number : numbers) {
            System.out.println(number);
        }

        int dayOfWeek = 5;
        String dayName;
        switch (dayOfWeek)
        {
            case 1 : dayName = "Garfield day";
                break;
            case 2 : dayName = "Tuesday";
                break;
            case 3 : dayName = "Wednesday";
                break;
            case 4 : dayName = "Thor's day";
                break;
            case 5 : dayName = "Happy Day";
                break;
            case 6 : dayName = "Saturday";
                break;
            case 7 : dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day of week";
        }
        System.out.println(dayName);

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

            }


            //Assert
            //  We can also use a while loop that has the same behavior as a for loop
            //      note: under the hood a for loop is compiled to an optimized while loop
            int index = 0;
            while (index < data.length) {
                if (index % 100 == 0) {
                    System.out.println("The value of index " + index + " is " + data[index]);
                    //                           we use the 'post increment' operator '++'
                    //                           you can see this construction of accessing arrays with a ++
                    //                           in terse optimized code
                    //                           can you figure out how this works?
                    //                                v
                }
                assertEquals(index + 1, data[index++]);

            }
        }
}








