package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChristmasWishList {
    public static void main(String[] args) {
        ArrayList<String> wishlist = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        Boolean continueAdding = true;
        while (continueAdding) {
            System.out.print("Inserisci il nome del regalo da aggiungere alla lista: ");
            String gift = scan.nextLine();
            wishlist.add(gift);

            System.out.println("Lunghezza della lista: " + wishlist.size());

            System.out.print("Vuoi aggiungere un altro regalo? (s/n): ");
            String choice = scan.nextLine();
            continueAdding = choice.equalsIgnoreCase("s");
        }

        Collections.sort(wishlist);

        System.out.println("Lista dei regali inseriti:");
        for (String gift : wishlist) {
            System.out.println(gift);
        }
    }
}
