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
import javafx.scene.control.Label;
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
    @FXML
    private Label text1;
    @FXML
    private Label text2;
    @FXML
    private Button hmm3;
    @FXML
    private Button hmm;
    @FXML
    private Button hmm2;
    @FXML
    private Button reboot2;
    @FXML
    private Button reboot;
    @FXML
    private Button recovery;
    @FXML
    private Button bootloader;
    @FXML
    private Button rebootbiasa;
    @FXML
    private TextField port;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TextFields.bindAutoCompletion(ip,"192.168.100.","192.168.");
    }    
    

    @FXML
    private void connect(ActionEvent event) throws IOException {
        status.clear();
        String portnya = port.getText();
        String x;
        String ayam = ip.getText();
        Runtime kucing = Runtime.getRuntime();
        Process kambing3 = kucing.exec("adb connect " + ayam + ":" + portnya);
        Process kambing2 = kucing.exec("adb disconnect " + ayam + ":" + portnya);
        Process kambing = kucing.exec("adb connect " + ayam + ":" + portnya);

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
        String portnya = port.getText();
        String x;
        String ayam = ip.getText();
        Runtime kucing = Runtime.getRuntime();
        Process kambing = kucing.exec("adb disconnect " + ayam + ":" + portnya);
        Process kambing2 = kucing.exec("adb disconnect " + ayam + ":" + portnya);
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

    @FXML
    private void reboot(ActionEvent event) {
        ip.setVisible(false);
        status.setVisible(false);
        konek.setVisible(false);
        diskonek.setVisible(false);
        text1.setVisible(false);
        text2.setVisible(false);
        hmm.setVisible(false);
        hmm3.setVisible(false);
        hmm2.setVisible(false);
        reboot2.setVisible(true);
        reboot.setVisible(false);
        recovery.setVisible(true);
        bootloader.setVisible(true);
        rebootbiasa.setVisible(true);
        port.setVisible(false);
    }

    @FXML
    private void reboot2(ActionEvent event) {
        ip.setVisible(true);
        status.setVisible(true);
        konek.setVisible(true);
        diskonek.setVisible(true);
        text1.setVisible(true);
        text2.setVisible(true);
        hmm.setVisible(true);
        hmm3.setVisible(true);
        hmm2.setVisible(true);
        reboot2.setVisible(false);
        reboot.setVisible(true);
        recovery.setVisible(false);
        bootloader.setVisible(false);
        rebootbiasa.setVisible(false);
        port.setVisible(true);
    }

    @FXML
    private void recovery(ActionEvent event) throws IOException {
        Runtime kucing = Runtime.getRuntime();
        Process kambing = kucing.exec("adb reboot recovery");
    }

    @FXML
    private void bootloader(ActionEvent event) throws IOException {
        Runtime kucing = Runtime.getRuntime();
        Process kambing = kucing.exec("adb reboot bootloader");
    }

    @FXML
    private void rebootbiasa(ActionEvent event) throws IOException {
        Runtime kucing = Runtime.getRuntime();
        Process kambing = kucing.exec("adb reboot");
    }
    
}
