
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Favian Azwadt R
 */
public class no1 {
    public static void main(String[] args) {
        String nilai = JOptionPane.showInputDialog(null,"Masukkan nilai (0-100)");
        int nilaiint = Integer.parseInt(nilai);
        
        if(nilaiint < 0 && nilaiint > 100)
        {
           JOptionPane.showMessageDialog(null, "Nilai tidak valid");
        }
        else if(nilaiint >= 80 && nilaiint <=100)
        {
            JOptionPane.showMessageDialog(null, "Nilai A");
        }
        else if(nilaiint >= 70 && nilaiint <=79)
        {
            JOptionPane.showMessageDialog(null, "Nilai B");
        }
        else if(nilaiint >= 60 && nilaiint <=69)
        {
            JOptionPane.showMessageDialog(null, "Nilai C");
        }
        else if(nilaiint >= 40 && nilaiint <=59)
        {
            JOptionPane.showMessageDialog(null, "Nilai D");
        }
        else if(nilaiint >= 0 && nilaiint <=39)
        {
            JOptionPane.showMessageDialog(null, "Nilai E");
        }
    }
}
