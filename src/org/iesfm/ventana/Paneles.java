package org.iesfm.ventana;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class Paneles {
    public static void main(String[] args) {
        //creamos la ventana
        JFrame ventana= new JFrame();
        ventana.setVisible(true);
        ventana.setBounds(50,50, 350,450);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.cyan);
        ventana.setTitle("Paneles Redondeados");

        //Creamos un panel gris
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBounds(10,10,90,90);
        panelPrincipal.setBackground(Color.gray);

        //Añadimos las distintasetiuetas
        ventana.add(panelPrincipal);

        //Para finalizar
        ventana.setContentPane(panelPrincipal);
        ventana.repaint();
        ventana.revalidate();
        System.out.println("comentario de prueba");
    }
}
