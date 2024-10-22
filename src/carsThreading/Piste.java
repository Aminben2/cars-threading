package carsThreading;

import javax.swing.*;
import java.awt.*;

public class Piste extends JFrame {
    public Piste(String title, int width, int height){
        super(title);
        setSize(width, height);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,1));
    }
}
