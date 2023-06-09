package org.lessons.java.ciclabile;

import java.util.NoSuchElementException;

public class Ciclabile {
    private int[] elementi;
    private int indiceCorrente;
    private boolean haAncoraElementi;

    public Ciclabile(int[] array) {
        elementi = array;
        indiceCorrente = 0;
        haAncoraElementi = array.length > 0;
    }

    public int getElementoSuccessivo() {
        if (!haAncoraElementi) {
            throw new NoSuchElementException("Non ci sono più elementi da restituire.");
        }

        int elemento = elementi[indiceCorrente];
        indiceCorrente = (indiceCorrente + 1) % elementi.length;

        if (indiceCorrente == 0) {
            haAncoraElementi = false;
        }

        return elemento;
    }

    public boolean hasAncoraElementi() {
        return haAncoraElementi;
    }
}