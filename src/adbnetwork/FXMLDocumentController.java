/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adbnetwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import org.controlsfx.control.textfield.TextFields;

/**
 *
 * @author Favian Azwadt R
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField ip;
    @FXML
    private TextArea status;
    @FXML
    private Button konek;
    @FXML
    private Button diskonek;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TextFields.bindAutoCompletion(ip,"192.168.100.","192.168.");
    }    
    

    @FXML
    private void connect(ActionEvent event) throws IOException {
        status.clear();
        String x;
        String ayam = ip.getText();
        Runtime kucing = Runtime.getRuntime();
        Process kambing3 = kucing.exec("adb connect " + ayam);
        Process kambing2 = kucing.exec("adb disconnect " + ayam);
        Process kambing = kucing.exec("adb connect " + ayam);

        BufferedReader Input = new BufferedReader(new InputStreamReader(kambing.getInputStream()));
        while ((x = Input.readLine()) != null) {
                status.appendText(x);
            }
        String ular = status.getText();
        String subular = ular.substring(0, 9);
        if("connected".equals(subular)){
            konek.setVisible(false);
            ip.setEditable(false);
            diskonek.setVisible(true);
        }
    }

    @FXML
    private void cara(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "***Pastikan HP dan komputer/laptop dalam jaringan yang sama \n\n1. Masuk ke Setelan => Tentang ponsel \n2. Tap beberapa kali pada Nomor bentukan \n3. akan ada pemberitahuan jika Anda sudah masuk ke menu pengembang. \n4. "
                + "Keluar dari menu Tentang ponsel dan masuk ke menu Opsi pengembang \n5. Aktifkan Android Debugging \n6. Aktifkan ADB melalui jaringan \n7. Cek IP hp anda \n8. Masukkan alamat IP HP anda dalam kolom aplikasi");
    }

    @FXML
    private void disconnect(ActionEvent event) throws IOException {
        status.clear();
        String x;
        String ayam = ip.getText();
        Runtime kucing = Runtime.getRuntime();
        Process kambing = kucing.exec("adb disconnect " + ayam);
        Process kambing2 = kucing.exec("adb disconnect " + ayam);
        BufferedReader Input = new BufferedReader(new InputStreamReader(kambing2.getInputStream()));
        while ((x = Input.readLine()) != null) {
                status.appendText(x);
            }
        konek.setVisible(true);
        ip.setEditable(true);
        diskonek.setVisible(false);
        
    }

    @FXML
    private void devices(ActionEvent event) throws IOException {
        status.clear();
        String x;
        Runtime kucing = Runtime.getRuntime();
        Process kambing = kucing.exec("adb devices");
        BufferedReader Input = new BufferedReader(new InputStreamReader(kambing.getInputStream()));
        while ((x = Input.readLine()) != null) {
                status.appendText(x);
            }
    }

    @FXML
    private void myphone(ActionEvent event) throws IOException {

        Runtime kucing = Runtime.getRuntime();
        Process kambing = kucing.exec("scrcpy");

    }
    
}
