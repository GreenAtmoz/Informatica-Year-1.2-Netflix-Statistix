import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public TableColumn<,String> nameColumn;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        accountID = new TableColumn<>("Name");
        accountID.setCellValueFactory(new PropertyValueFactory<>("name"));
    }


