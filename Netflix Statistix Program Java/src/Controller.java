import TablesNetflixStatistix.Account;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TableView<Account> table;
    @FXML
    private TableColumn<Account,String> columnAccountId;
    @FXML
    private TableColumn<Account,String> columnEmail;
    @FXML
    private TableColumn<Account,String> columnLand;
    @FXML
    private TableColumn<Account,String> columnProvincie;
    @FXML
    private TableColumn<Account,String> columnPlaats;
    @FXML
    private TableColumn<Account,String> columnStraat;
    @FXML
    private TableColumn<Account,String> columnHuisnummer;
    @FXML
    private TableColumn<Account,String> columnToevoeging;
    @FXML
    private TableColumn<Account,String> columnPostcode;
    @FXML
    private Button buttonAccountLoad;

    private ObservableList<Account> getAccount;
    private DatabaseConnection dc;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dc = new DatabaseConnection();
    }

    @FXML
    public void loadAccountDataFromDataBase(javafx.event.ActionEvent actionEvent) {
        try {
            Connection conn = dc.Connect();
            getAccount = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * From Account");
            while (rs.next()) {
                getAccount.add(new Account(rs.getString(0), rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        } catch (SQLException ex) {
            System.err.println("Errror" + ex);
        }

        columnAccountId.setCellValueFactory(new PropertyValueFactory<>("AccoundID"));
        columnEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        columnLand.setCellValueFactory(new PropertyValueFactory<>("Land"));
        columnProvincie.setCellValueFactory(new PropertyValueFactory<>("Provincie"));
        columnPlaats.setCellValueFactory(new PropertyValueFactory<>("Plaats"));
        columnStraat.setCellValueFactory(new PropertyValueFactory<>("Straat"));
        columnHuisnummer.setCellValueFactory(new PropertyValueFactory<>("Straat"));
        columnToevoeging.setCellValueFactory(new PropertyValueFactory<>("Toevoeging"));
        columnPostcode.setCellValueFactory(new PropertyValueFactory<>("Postcode"));
    }
}
