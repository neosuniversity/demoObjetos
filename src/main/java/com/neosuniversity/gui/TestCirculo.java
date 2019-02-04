package com.neosuniversity.gui;

import java.awt.Color;

public class TestCirculo {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        System.out.println(circulo);

        Circulo circulo1 = new Circulo(200,Color.BLUE, 0,0);
        System.out.println(circulo1);
    }
}
