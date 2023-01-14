package ngodingalakadarnya.belajarGUI;

import javax.swing.*;
import java.awt.*;

public class MyForm extends JFrame{
    
    JButton b1 = new JButton("Tombol 1");
    JButton b2 = new JButton("Tombol 2");
    JButton b3 = new JButton("Tombol 3");
    JButton b4 = new JButton("Tombol 4");
    JButton b5 = new JButton("Tombol 5");


    MyForm(){
        super("Belajar GUI");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.BLUE);
        setLocationRelativeTo(null);

        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        setLayout(fl);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }

    public static void main(String[] args) {
        MyForm my = new MyForm();
    }
}
