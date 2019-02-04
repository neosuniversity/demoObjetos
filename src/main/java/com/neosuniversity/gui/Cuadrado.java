package com.neosuniversity.gui;

import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado implements  Figura{

    private int x;
    private int y;
    private Color color;
    private int size;
    private boolean isFilled;

    public Cuadrado() {

        this.x = 0;
        this.y = 0;
        this.color = Color.DARK_GRAY;
        this.size = 60;

    }

    public Cuadrado (int size, Color color, int x, int y) {
        this.size = size;
        this.color = color;
        this.x = x;
        this.y = y;

    }

    public Cuadrado (int size, Color color, int x, int y, boolean isFilled) {
        this.size = size;
        this.color = color;
        this.x = x;
        this.y = y;
        this.isFilled = isFilled;

    }

    public void draw(Graphics g) {
        g.setColor(this.color);
        if (this.isFilled) {
            g.fillRect(x,y,size,size);
         } else {
            g.drawRect(x,y,size,size);
        }

    }

    public double area(){
        return size*size;
    }
}
