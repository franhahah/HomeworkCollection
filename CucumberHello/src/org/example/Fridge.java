package org.example;

import static org.junit.Assert.assertThrows;

public class Fridge {
    private int stock;


    public Fridge(int stock) {
        this.stock = stock;
    }

    //check if amount>=stock
    // error message
    // else stock=stock-amount
    public void Take(int amount) {
            if (amount <= stock) {

                stock = stock - amount;
            } else
            {
                //throw new IllegalArgumentException("TO MUCH");
                stock = 0;
            }
        }


    public int getStock() {
        return stock;
    }
}