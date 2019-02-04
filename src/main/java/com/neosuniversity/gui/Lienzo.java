package com.neosuniversity.gui;


import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The type Lienzo.
 */
public class Lienzo extends JPanel {

    private List<Figura> figuras = new ArrayList<>();

    private Lienzo lienzo2;


    /**
     * Add lienzo 2.
     *
     * @param lienzo2 the lienzo 2
     */
    public void addLienzo2(Lienzo lienzo2) {
        this.lienzo2 = lienzo2;
    }

    /**
     * Instantiates a new Lienzo.
     *
     * @param figuras the figuras
     */
    public Lienzo(List<Figura> figuras) {

        this.figuras = figuras;

        JButton boton = new JButton("Mover Figuras");
        this.add(boton);
        boton.addActionListener((e)-> {
            if (this.figuras.size()>=1) {
                Figura f = this.figuras.remove(this.figuras.size()-1);
                this.lienzo2.addFigura(f);

                repaint();
            } else {
                JOptionPane.showMessageDialog(this, "NO hay objetos para mover");
            }

        });
    }

    /**
     * Add figura.
     *
     * @param figura the figura
     */
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

        try {
            BufferedImage image = ImageIO.read(new File("/Users/neossoftware/Downloads/duke.jpg"));
            g.drawImage(image, 200, 200, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
