
import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class no2 {
    public static void main(String[] args) {
        String ayam = JOptionPane.showInputDialog(null, "1. Menu Makanan\n2.Password Wifi");
        if ("1".equals(ayam))
        {
              String kucing = JOptionPane.showInputDialog(null, "Pilih menu dibawah ini\nPilihNomor\n\n1. Nasi Goreng   Rp.15000\n2. Nasi Ayam Rica-Rica   Rp.17000"
                      + "\n3.Nasi Ayam Cryspi  Rp.18000\n4.Nasi Goreng Spesial UAS   Rp. 20000\n5.Keluar");
              if ("1".equals(kucing))
              {
                  String kadal = JOptionPane.showInputDialog(null, "Masukkan nominal uang pembayaran anda");
                  int kadalint = Integer.parseInt(kadal);
                  if(kadalint < 15000)
                  {
                      JOptionPane.showMessageDialog(null, "Uang anda tidak cukup");
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null, "Kembalian anda = " + (kadalint - 15000));
                  }
              }
              else if ("2".equals(kucing))
              {
                  String kadal = JOptionPane.showInputDialog(null, "Masukkan nominal uang pembayaran anda");
                  int kadalint = Integer.parseInt(kadal);
                  if(kadalint < 17000)
                  {
                      JOptionPane.showMessageDialog(null, "Uang anda tidak cukup");
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null, "Kembalian anda = " + (kadalint - 17000));
                  }
              }
              else if ("3".equals(kucing))
              {
                  String kadal = JOptionPane.showInputDialog(null, "Masukkan nominal uang pembayaran anda");
                  int kadalint = Integer.parseInt(kadal);
                  if(kadalint < 18000)
                  {
                      JOptionPane.showMessageDialog(null, "Uang anda tidak cukup");
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null, "Kembalian anda = " + (kadalint - 18000));
                  }
              }
              else if ("4".equals(kucing))
              {
                  String kadal = JOptionPane.showInputDialog(null, "Masukkan nominal uang pembayaran anda");
                  int kadalint = Integer.parseInt(kadal);
                  if(kadalint < 20000)
                  {
                      JOptionPane.showMessageDialog(null, "Uang anda tidak cukup");
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null, "Kembalian anda = " + (kadalint - 20000));
                  }
              }
              else
              {
                  exit();
              }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Password wifi = duagarisbiruhehehe");
        }
    }
}
