package Code;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import TravelExpertsClasses.Agents;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class mainInterfaceController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane spMenu;

    @FXML
    private AnchorPane pAgentProfile;

    @FXML
    private Text txtProfile;

    @FXML
    private AnchorPane pCustomers;

    @FXML
    private Text txtCustomers;

    @FXML
    private AnchorPane pTags;

    @FXML
    private Text txtTags;

    @FXML
    private AnchorPane pPackages;

    @FXML
    private Text txtPackages;

    @FXML
    private AnchorPane pLogout;

    @FXML
    private Text txtLogout;

    @FXML
    private AnchorPane spContent;

    @FXML
    private AnchorPane mainAP;


    @FXML
    void initialize() {

        assert spMenu != null : "fx:id=\"spMenu\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert pAgentProfile != null : "fx:id=\"pAgentProfile\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert txtProfile != null : "fx:id=\"txtProfile\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert pCustomers != null : "fx:id=\"pCustomers\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert txtCustomers != null : "fx:id=\"txtCustomers\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert pTags != null : "fx:id=\"pTags\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert txtTags != null : "fx:id=\"txtTags\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert pPackages != null : "fx:id=\"pPackages\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert txtPackages != null : "fx:id=\"txtPackages\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert pLogout != null : "fx:id=\"pLogout\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert txtLogout != null : "fx:id=\"txtLogout\" was not injected: check your FXML file 'mainInterface.fxml'.";
        assert spContent != null : "fx:id=\"spContent\" was not injected: check your FXML file 'mainInterface.fxml'.";

    }


    //remove the current anchor pane and replace it with the agent profile
    public void loadAgentProfile(javafx.scene.input.MouseEvent mouseEvent) {

        mainAP.getChildren().remove(spContent);

        try {
            mainAP.getChildren().add(FXMLLoader.load(getClass().getResource("AgentProfile.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}