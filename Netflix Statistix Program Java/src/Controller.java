import TablesNetflixStatistix.Account;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TableView<Account> accountTable;
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
    private TextField newAccountIdTextField;
    @FXML
    private TextField newEmailTextField;
    @FXML
    private TextField newLandTextField;
    @FXML
    private TextField newProvincieTextField;
    @FXML
    private TextField newPlaatsTextField;
    @FXML
    private TextField newStraatTextField;
    @FXML
    private TextField newHuisnummerTextField;
    @FXML
    private TextField newToevoegingTextField;
    @FXML
    private TextField newPostcodeTextField;
    @FXML
    private TextField deleteAccountIdTextField;


    private ObservableList<Account> getAccount;
    private DatabaseConnection dc;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dc = new DatabaseConnection();
        accountTable.setEditable(true);
        columnLand.setCellFactory(TextFieldTableCell.forTableColumn());
    }

    @FXML
    public void loadAccountDataFromDataBase() {
        try {
            Connection conn = dc.Connect();
            getAccount = FXCollections.observableArrayList();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * From Account");
            while (rs.next()) {
                getAccount.add(new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));
            }
        } catch (SQLException ex) {
            System.err.println("Errror" + ex);
        }

        columnAccountId.setCellValueFactory(new PropertyValueFactory<>("AccountId"));
        columnEmail.setCellValueFactory(new PropertyValueFactory<>("EMail"));
        columnLand.setCellValueFactory(new PropertyValueFactory<>("Land"));
        columnProvincie.setCellValueFactory(new PropertyValueFactory<>("Provincie"));
        columnPlaats.setCellValueFactory(new PropertyValueFactory<>("Plaats"));
        columnStraat.setCellValueFactory(new PropertyValueFactory<>("Straat"));
        columnHuisnummer.setCellValueFactory(new PropertyValueFactory<>("Straat"));
        columnToevoeging.setCellValueFactory(new PropertyValueFactory<>("Toevoeging"));
        columnPostcode.setCellValueFactory(new PropertyValueFactory<>("Postcode"));

        accountTable.setItems(null);
        accountTable.setItems(getAccount);
    }

    public void updateCellAccount(TableColumn.CellEditEvent edittedCell) {
        try {
            Connection conn = dc.Connect();
            conn.createStatement().executeQuery("Update Account SET " + edittedCell.getTableColumn().getText() + "='" + edittedCell.getNewValue().toString()
                    + "' WHERE AccountId='" + (accountTable.getSelectionModel().getSelectedItem()).getAccountId() +"'");
        } catch (SQLException ex) {
            System.err.println("No result set returned and not needed! Data edit complete!" + ex);
        }
    }

    @FXML
    public void addNewAccount() {
        String newToevoeging = null;

        if (!newToevoegingTextField.getText().isEmpty()) {
            newToevoeging = "'" + newToevoegingTextField.getText() + "'";
        }

        try {
            Connection conn = dc.Connect();
            conn.createStatement().executeQuery("INSERT INTO Account (AccountId, EMail, Land, Provincie, " +
                    "Plaats, Straat, Huisnummer, Toevoeging, Postcode) VALUES ('" + newAccountIdTextField.getText() + "', '" + newEmailTextField.getText() + "', '" + newLandTextField.getText() + "', " +
                    "'" + newProvincieTextField.getText() + "','" + newPlaatsTextField.getText() + "' , '" + newStraatTextField.getText() + "', '" + newHuisnummerTextField.getText() + "', " + newToevoeging + ", '" + newPostcodeTextField.getText() + "');");
        } catch (SQLException ex) {
            System.err.println("No result set returned and not needed! Data added complete!" + ex);
        }

        loadAccountDataFromDataBase();
    }

    public void deleteAccount() {
        try {
            Connection conn = dc.Connect();
            conn.createStatement().executeQuery("DELETE FROM Account WHERE AccountId='" + deleteAccountIdTextField.getText() + "';");
        } catch (SQLException ex) {
            System.err.println("No result set returned and not needed! Data delete complete!" + ex);
        }

        loadAccountDataFromDataBase();
    }
}
