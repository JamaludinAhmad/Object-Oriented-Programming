package sesi1;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        //no 1
        System.out.println("Belajar Java");
        System.out.println("Sangat mudah sekali");
        System.out.println("dan sangat menyenangkan");

        // soal no 2
        String masukan = JOptionPane.showInputDialog(null, "Anda sedang belajar apa? ");

        JOptionPane.showMessageDialog(null, "Belajar " + masukan + " sangat mudah");
    }
}
