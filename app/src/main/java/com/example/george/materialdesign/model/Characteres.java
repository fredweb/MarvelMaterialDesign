package com.example.george.materialdesign.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 10/11/15.
 */
public class Characteres {

    public Characteres()
    {
        caracter = new ArrayList<Character>();
    }

    private List<Character> caracter;

    public List<Character> getCaracter() {
        return caracter;
    }

    public void setCaracter(List<Character> caracter) {
        this.caracter = caracter;
    }
}
