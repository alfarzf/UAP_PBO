package uap;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuKasirController {

    @FXML
    private Button btnBarang;

    @FXML
    private Button btnMakanan;

    @FXML
    private Button btnTransaksi;

    @FXML
    void openBarang(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuBarang.fxml"));
        Parent root = loader.load();
        Stage stage= (Stage) btnBarang.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void openMakanan(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuMakanan.fxml"));
        Parent root = loader.load();
        Stage stage= (Stage) btnMakanan.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    @FXML
    void openTransaksi(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuTransaksi.fxml"));
        Parent root = loader.load();
        Stage stage= (Stage) btnTransaksi.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

}
