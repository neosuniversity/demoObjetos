package com.neosuniversity.gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class AppFiguras {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame ventana2 = getVentana("Ventana 2");
            Lienzo lienzo2  = new Lienzo(new ArrayList<>());
            ventana2.add(lienzo2);
            ventana2.setLocation(600,0);


            List<Figura> list = new ArrayList<>();
            list.add(new Circulo());
            list.add(new Circulo(79, Color.GREEN, 45, 78, true));
            list.add(new Circulo(56, Color.ORANGE, 100, 100, true));
            list.add(new Cuadrado( 70, Color.MAGENTA, 100,150,true));
            list.add(new Cuadrado());

            JFrame ventana = getVentana("Ventana 1");
            Lienzo lienzo = new Lienzo(list);
            lienzo.addLienzo2(lienzo2);
            lienzo2.addLienzo2(lienzo);
            ventana.add(lienzo);

            ventana.setVisible(true);
            ventana.setLocation(0,0);
            ventana2.setVisible(true);


        });



    }

    public static JFrame getVentana (String title){

        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setTitle(title);
        ventana.setSize(800, 800);

        return  ventana;

    }
}
