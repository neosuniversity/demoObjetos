package com.neosuniversity.gui;

import java.awt.Color;
import java.awt.Graphics;

/**
 * The type Cuadrado.
 */
public class Cuadrado implements  Figura{

    private int x;
    private int y;
    private Color color;
    private int size;
    private boolean isFilled;

    /**
     * Instantiates a new Cuadrado.
     */
    public Cuadrado() {

        this.x = 0;
        this.y = 0;
        this.color = Color.DARK_GRAY;
        this.size = 60;

    }

    /**
     * Instantiates a new Cuadrado.
     *
     * @param size  the size
     * @param color the color
     * @param x     the x
     * @param y     the y
     */
    public Cuadrado (int size, Color color, int x, int y) {
        this.size = size;
        this.color = color;
        this.x = x;
        this.y = y;

    }

    /**
     * Instantiates a new Cuadrado.
     *
     * @param size     the size
     * @param color    the color
     * @param x        the x
     * @param y        the y
     * @param isFilled the is filled
     */
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
