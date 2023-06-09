package org.lessons.java.ciclabile;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Ciclabile ciclabile = new Ciclabile(array);

        while (ciclabile.hasAncoraElementi()) {
            int elemento = ciclabile.getElementoSuccessivo();
            System.out.println(elemento);
        }
    }
}

