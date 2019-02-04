package com.neosuniversity.gui;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo implements Figura {

    private double radio;
    private Color color;
    private int x;
    private int y;
    private boolean isFilled;


    public Circulo() {
        this.radio = 50;
        this.color = Color.BLACK;
        this.x = 0;
        this.y = 0;
    }

    public Circulo (double radio, Color color, int x, int y) {
        this.radio = radio;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Circulo(double radio, Color color, int x, int y, boolean isFilled) {
        this(radio,color,x,y);
        this.isFilled = isFilled;
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public void draw(Graphics g) {
        g.setColor(this.color);
        if (isFilled) {
            g.fillOval(x,y,(int)radio*2,(int)radio*2);
        } else{
            g.drawOval(x,y,(int)radio*2,(int)radio*2);
        }


    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}' +  "Area : " + this.area();
    }



}
