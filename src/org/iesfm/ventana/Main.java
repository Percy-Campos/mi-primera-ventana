package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds( 10, 10, 500, 200) ;
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Este es el panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setForeground(Color.cyan);

        //Este es un componente de tipo etiqueta (label)
        JLabel nameLabel = new JLabel("Hola mundo");
        nameLabel.setForeground(Color.red);

        //Creamos una caja de texto:
        JTextField nameText = new JTextField(30);

        //Creamos un boton
        JButton boton = new JButton("aceptar");

        //Añadimos la etiqueta al panel, textfield y button
        mainPanel.add(nameLabel);
        mainPanel.add(nameText);
        mainPanel.add(boton);

        //Hacemos que dentro del panel aparezca la etiqueta
        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();

    }
}
