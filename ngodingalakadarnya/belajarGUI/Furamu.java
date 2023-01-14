package ngodingalakadarnya.belajarGUI;

import java.awt.*;
import javax.swing.*;

public class Furamu extends JFrame{
    
    public Furamu(){
        super("Contoh");
        
        setVisible(true);
        setSize(350 ,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        

        JPanel redpanel = new JPanel();
        redpanel.setBounds(0, 0, 150, 50);
        redpanel.setBackground(Color.red);
        redpanel.setLayout(null);
        add(redpanel);

        JPanel bluepanel = new JPanel();
        bluepanel.setBounds(0, 150, 150, 50);
        bluepanel.setBackground(Color.blue);
        bluepanel.setLayout(null);
        add(bluepanel);
        
    }

    public static void main(String[] args) {
        Furamu fr = new Furamu();
    }

}
