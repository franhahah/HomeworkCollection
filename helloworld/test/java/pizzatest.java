import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class pizzatest {



    @Test void pizzaTest(){

        String pizzaSmall = "small";
        String pizzaMedium = "medium";
        String pizzalarge = "large";

        float priceS=7.99F;
        float priceM=10.99F;
        float priceL=13.99F;

        byte slicesPizzaS=6;
        byte slicesPizzaM=8;
        byte slicesPizzaL=10;

        boolean vegetarianS =false;
        boolean vegetarianM =true;
        boolean vegetarianL =false;

        String name= "John Doe";
        String phone= 1234567890L;



        String order= pizzaSmall+priceS;
        System.out.println("Name: " + name + "\n" +  "Phonenr:" + phone);
        System.out.println("pizza: " + pizzaSmall + " \n Price:" + priceS + " \n" + "Slices:  " + slicesPizzaS);
        System.out.println("veggie: " + vegetarianS);

// pizza medium

        System.out.println("Name: " + name + "\n" +  "Phonenr:" + phone);
        System.out.println("pizza: " + pizzaMedium + " \n Price:" + priceM + " \n" + "Slices:  " + slicesPizzaM);
        System.out.println("veggie: " + vegetarianM);

//total of 3 pizzas with 10 % discount

        System.out.println("Name: " + name + "\n" +  "Phonenr:" + phone);
        System.out.println("pizza: " + pizzaMedium + " \n Price:" + priceM + " \n" + "Slices:  " + slicesPizzaM);
        System.out.println("veggie: " + vegetarianM);

        float totalPrice= 3* priceS;
        float discountPrice= (float)(0.1 * totalPrice);
        System.out.println("Total Price of 3" +  pizzaSmall + " pizza's : " +  totalPrice);

        System.out.println("with 10 % discount: Total Price of 3  " +  pizzaSmall + " pizza's : " +  discountPrice);




    }
}
