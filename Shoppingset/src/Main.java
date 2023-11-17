import java.awt.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Set<String> userCard = new HashSet<>();
        Set<String> productsOnSale = new HashSet<String>();

        String item=("tel"+"ef"+"oon");
        userCard.add(item);
        userCard.add("Phone");
        userCard.add("Tablet");
        userCard.add("HeadPhones");

        //for (String i : userCard) {
           // System.out.println(i);
       // }

        productsOnSale.add("Phone");
        productsOnSale.add("HeadPhones");
        productsOnSale.add("Speakers");

        System.out.println("item userCard :" + userCard);
        System.out.println("item proOnSale:" + productsOnSale);

        Set<String> combinedProducts = new HashSet<>(userCard);
        combinedProducts.addAll(productsOnSale);

        Set<String> commonProducts = new HashSet<>(userCard);
        commonProducts.retainAll(productsOnSale);
        System.out.println("CommonProducts: " + commonProducts);


        Set<String> prodNotOnSale = new HashSet<>(userCard);
        prodNotOnSale.removeAll(productsOnSale);
        System.out.println("card - onsale products" + prodNotOnSale);

        System.out.println("combined prodincard + onsale" + combinedProducts);

        Scanner scanner = new Scanner(System.in);
// invoer op scherm, toevoegen aan card
        for(int i=0 ; i<2 ; i++ ){
        System.out.println("type a product:");

        String productNew = scanner.next();
        System.out.println("Product:" + productNew);

        userCard.add(productNew);
        System.out.println("Op de kaart staat nu : "+userCard);


        }
        boolean yes=true;

        System.out.println("wil je een artikel verwijderen?" + userCard);
        String minProduct = scanner.next();

        System.out.println("Dit artikele verwijderen?  " + minProduct);

        if (yes){
        userCard.remove(minProduct);
        System.out.println("Kaart bevat nu : "+ userCard);}
        else {System.out.println("NOOOOO");}

    }


}