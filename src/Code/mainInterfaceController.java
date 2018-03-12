package Code;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class mainInterfaceController {
	
	

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane pAnchor;

    @FXML
    private AnchorPane pDashboard;

    @FXML
    private Pane pAgentProfile;

    @FXML
    private Button btnPackages;

    @FXML
    private Button btnAgentProfile;

    @FXML
    private Button btnCustomers;

    @FXML
    private Button btnTags;

    @FXML
    private Button btnLogout;

    @FXML
    private AnchorPane pContent;

    @FXML
    void logoutOfApp(ActionEvent event) {

    }

    @FXML
    void openAgentProfile(ActionEvent event) {

    }

    @FXML
    void openCustomers(ActionEvent event) {

    }

    @FXML
    void openPackages(ActionEvent event) {

    }

    @FXML
    void openTags(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert pAnchor != null : "fx:id=\"pAnchor\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert pDashboard != null : "fx:id=\"pDashboard\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert pAgentProfile != null : "fx:id=\"pAgentProfile\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert btnPackages != null : "fx:id=\"btnPackages\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert btnAgentProfile != null : "fx:id=\"btnAgentProfile\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert btnCustomers != null : "fx:id=\"btnCustomers\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert btnTags != null : "fx:id=\"btnTags\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert btnLogout != null : "fx:id=\"btnLogout\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert pContent != null : "fx:id=\"pContent\" was not injected: check your FXML file 'mainInterface.fxml'.";

    }
}
