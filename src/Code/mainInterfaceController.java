package Code;

import javafx.fxml.FXML;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class mainInterfaceController {

    @FXML
    private SplitPane spFull;

    @FXML
    private AnchorPane spMenu;

    @FXML
    private AnchorPane spContent;

    @FXML
    private VBox vbMenu;

    @FXML
    private Pane pAgentProfile;

    @FXML
    private Pane pCustomers;

    @FXML
    private Pane pTags;

    @FXML
    private Pane pPackages;

    @FXML
    private Pane pLogout;


    @FXML
    void initialize() {


        assert spFull != null : "fx:id=\"spFull\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert spMenu != null : "fx:id=\"spMenu\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert vbMenu != null : "fx:id=\"vbMenu\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert pAgentProfile != null : "fx:id=\"pAgentProfile\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert pCustomers != null : "fx:id=\"pCustomers\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert pTags != null : "fx:id=\"pTags\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert pPackages != null : "fx:id=\"pPackages\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert pLogout != null : "fx:id=\"pLogout\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert spContent != null : "fx:id=\"spContent\" was not injected: check your FXML file 'mainInterface.fxml'.";



    }

}