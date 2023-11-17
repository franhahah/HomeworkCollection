package org.example;

public class Fridge {
    private int stock;

    public Fridge(int stock) {
        this.stock = stock;
    }
//check if amount>=stock
    // error message
    // else stock=stock-amount
    public void Take(int amount) {
/*
        if (amount>= stock) {
            throw new IllegalArgumentException("amount is too big, there is not enough"); }
        else{
*/
        stock = stock - amount;
    }

    public int getStock() {
        return stock;

    }
}
