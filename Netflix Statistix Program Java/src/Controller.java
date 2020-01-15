import TablesNetflixStatistix.Account;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    public TableView<Account> table;
    public TableColumn<Account, String> accountID;
    public TableColumn<Account,String> email;
    public TableColumn<Account,String> land;
    public TableColumn<Account,String> provincie;
    public TableColumn<Account,Double> plaats;
    public TableColumn<Account,Double> straat;
    public TableColumn<Account,Double> toevoeging;
    public TableColumn<Account,Double> postcode;

    private ObservableList<Account> getAccount(){
        ObservableList<Account> Account = FXCollections.observableArrayList();
        Account.add(new Account(" reg","r "," r"," r","r ","r "," r"," r"," r"));


        return Account;
    }

    public void initialize(URL arg0, ResourceBundle arg1) {


        accountID.setCellValueFactory(new PropertyValueFactory<>("AccoundID"));


        email.setCellValueFactory(new PropertyValueFactory<>("Email"));


        land.setCellValueFactory(new PropertyValueFactory<>("Land"));


        provincie.setCellValueFactory(new PropertyValueFactory<>("Provincie"));


        plaats.setCellValueFactory(new PropertyValueFactory<>("Plaats"));


        straat.setCellValueFactory(new PropertyValueFactory<>("Straat"));


        straat.setCellValueFactory(new PropertyValueFactory<>("Straat"));


        toevoeging.setCellValueFactory(new PropertyValueFactory<>("Toevoeging"));


        postcode.setCellValueFactory(new PropertyValueFactory<>("Postcode"));


    }

}
