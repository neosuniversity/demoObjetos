package com.neosuniversity.gui;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lienzo extends JPanel {

    private List<Figura> figuras = new ArrayList<>();

    private Lienzo lienzo2;



    public void addLienzo2(Lienzo lienzo2) {
        this.lienzo2 = lienzo2;
    }

    public Lienzo(List<Figura> figuras) {

        this.figuras = figuras;

        JButton boton = new JButton("Mover Figuras");
        this.add(boton);
        boton.addActionListener((e)-> {
            if (this.figuras.size()>=0) {
                Figura f = this.figuras.remove(this.figuras.size()-1);
                this.lienzo2.addFigura(f);

                repaint();
            }

        });
    }

    public void addFigura(Figura figura){
        this.figuras.add(figura);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        figuras.stream().forEach((f) -> {
            f.draw(g);
            System.out.println("Area: " + f.getClass().getName() + ":"+  f.area());
        });

    }


}
