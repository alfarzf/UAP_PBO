package uap;
import db.BarangModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class MenuBarangController implements Initializable{

    @FXML
    private TextField namaBarang;

    @FXML
    private TextField hargaBarang;

    @FXML
    private TextField jumlahBarang;

    @FXML
    private TextField diskonBarang;

    @FXML
    private TextField barcodeBarang;

    @FXML
    private Button btnTambah;

    @FXML
    private Button btnHapus;

    @FXML
    private Button btnMenu;

    @FXML
    private TableView<Barang> tableView;

    @FXML
    private TableColumn<Barang, String> colNama;

    @FXML
    private TableColumn<Barang, Double> colHarga;

    @FXML
    void hapusData(ActionEvent event) throws IOException {
        Barang brg=new Barang(barcodeBarang.getText());
        BarangModel model=new BarangModel();
        model.deleteProduk(brg);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuBarang.fxml"));
        Parent root = loader.load();
        Stage stage= (Stage) btnHapus.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void openMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuTransaksi.fxml"));
        Parent root = loader.load();
        Stage stage= (Stage) btnMenu.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void tambahData(ActionEvent event) throws IOException {
        Barang brg=new Barang(barcodeBarang.getText(),namaBarang.getText(),Double.parseDouble(hargaBarang.getText()),Integer.parseInt(jumlahBarang.getText()), Double.parseDouble(diskonBarang.getText()));
        BarangModel model=new BarangModel();
        model.addBarang(brg);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuBarang.fxml"));
        Parent root = loader.load();
        Stage stage= (Stage) btnTambah.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        BarangModel model=new BarangModel();
        colNama.setCellValueFactory(new PropertyValueFactory<>("nama_produk"));
        colHarga.setCellValueFactory(new PropertyValueFactory<>("harga"));
        tableView.setItems(model.getBarang());
    }
    
}
