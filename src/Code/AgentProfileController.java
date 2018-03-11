package Code;

import java.awt.*;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

import Database.AgentDB;
import TravelExpertsClasses.Agents;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.util.Pair;
import javafx.geometry.Insets;

import javax.swing.*;


public class AgentProfileController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane profilePane;

    @FXML
    private TextField txtAgentId;

    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtFirstName;

    @FXML
    private Text txtProfileHeading;

    @FXML
    private TextField txtMiddleInitial;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextField txtPhone;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPosition;

    @FXML
    private TextField txtAgencyId;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnChangePassword;

    private Agents agent_login;
    private int count;

    @FXML
    void changePassword(ActionEvent event) throws Exception {

        // Create the custom dialog.
        Dialog dialog = new Dialog<>();
        dialog.setTitle("Change Password");
        dialog.setHeaderText("Change Password");

        // Set the icon (must be included in the project).
        //dialog.setGraphic(new ImageView(this.getClass().getResource("login.png").toString()));

        // Set the button types.
        ButtonType loginButtonType = new ButtonType("Confirm", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

        // Create the username and password labels and fields.
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        PasswordField oldpassword = new PasswordField();
        oldpassword.focusedProperty().addListener((arg0, oldPropertyValue, newPropertyValue) -> {
            if (newPropertyValue)
            {
                dialog.setHeaderText("Please enter your old password");
            }
            else
            {
                dialog.setHeaderText("Change Password");
            }
        });
        oldpassword.setPromptText("Old Password");

        PasswordField newpassword = new PasswordField();
        newpassword.focusedProperty().addListener((arg0, oldPropertyValue, newPropertyValue) -> {
            if (newPropertyValue)
            {
                dialog.setHeaderText("Please enter a new password");
            }
            else
            {
                dialog.setHeaderText("Change Password");
            }
        });

        newpassword.setPromptText("New Password");

        PasswordField confirmpassword = new PasswordField();
        confirmpassword.focusedProperty().addListener((arg0, oldPropertyValue, newPropertyValue) -> {
            if (newPropertyValue)
            {
                dialog.setHeaderText("Please confirm your new password");
            }
            else
            {
                dialog.setHeaderText("Change Password");
            }
        });

        confirmpassword.setPromptText("Confirm New Password");

        grid.add(new Label("Old Password:"), 0, 0);
        grid.add(oldpassword, 1, 0);
        grid.add(new Label("New Password:"), 0, 1);
        grid.add(newpassword, 1, 1);
        grid.add(new Label("Re-Enter Password:"), 0, 2);
        grid.add(confirmpassword, 1, 2);

        dialog.getDialogPane().setContent(grid);

        Optional result = dialog.showAndWait();
        //System.out.println(result);

        if (result.isPresent()){

            if(oldpassword.getText().isEmpty()||newpassword.getText().isEmpty()||confirmpassword.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning Dialog");
                alert.setHeaderText("");
                alert.setContentText("Please fill out all of the text fields!");

                alert.showAndWait();
                changePassword(event);

            }

            LoginController encrypt = new LoginController();

            String current_pass = agent_login.getPassword().trim();
            String entered_oldpass = encrypt.encryptPassword(oldpassword.getText().trim());
            String new_pass = encrypt.encryptPassword(newpassword.getText().trim());
            String confirmed_pass = encrypt.encryptPassword(confirmpassword.getText().trim());


                if(current_pass.equals(entered_oldpass) && new_pass.equals(confirmed_pass)){
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Confirmation Dialog");
                    alert.setHeaderText("Change Password?");
                    alert.setContentText("Are you sure you want to change your password?");
                    Optional<ButtonType> r = alert.showAndWait();
                    if (r.get() == ButtonType.OK){
                        System.out.println("test");
                        AgentDB update_pass = new AgentDB();
                        update_pass.updatePassword(encrypt.encryptPassword(newpassword.getText()), agent_login.getAgentId());
                        refreshInfo();
                        return;
                    } else {
                        changePassword(event);
                    }


                }else {

                    return;
                }

        } else {

            return;
        }

    }

    @FXML
    void updateInfo(ActionEvent event) {


        if(count==1){
            enableFields();
            btnUpdate.setText("Confirm");
        }else{

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Dialog");
            alert.setHeaderText("Submit Information");
            alert.setContentText("Are you sure you want to submit the updated information?");

            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK){

                AgentDB db = new AgentDB();
                Agents updatedAgent = getUpdatedAgent();
                db.updateAgent(updatedAgent);
                refreshInfo();

            } else {

                refreshInfo();
                return;
            }

        }


        count++;
    }

    private void refreshInfo() {

        disableFields();
        setAgentInfo();
        count=1;
        btnUpdate.setText("Update Agent Info");
    }

    private Agents getUpdatedAgent() {

        int ID = Integer.parseInt(txtAgentId.getText());
        String username = txtUsername.getText();
        String firstname = txtFirstName.getText();
        String middleinitial = txtMiddleInitial.getText();
        String lastname = txtLastName.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        String position = txtPosition.getText();
        String password = agent_login.getPassword();
        int agencyid = Integer.parseInt(txtAgencyId.getText());
        Agents agent = new Agents(ID,firstname,middleinitial,lastname,phone,email,position,agencyid,username, password);

        return agent;
    }


    @FXML
    void initialize() {
        assert txtAgentId != null : "fx:id=\"txtAgentId\" was not injected: check your FXML file 'AgentProfile.fxml'.";
        assert txtUsername != null : "fx:id=\"txtUsername\" was not injected: check your FXML file 'AgentProfile.fxml'.";
        assert txtFirstName != null : "fx:id=\"txtFirstName\" was not injected: check your FXML file 'AgentProfile.fxml'.";
        assert txtProfileHeading != null : "fx:id=\"txtProfileHeading\" was not injected: check your FXML file 'AgentProfile.fxml'.";
        assert txtMiddleInitial != null : "fx:id=\"txtMiddleInitial\" was not injected: check your FXML file 'AgentProfile.fxml'.";
        assert txtLastName != null : "fx:id=\"txtLastName\" was not injected: check your FXML file 'AgentProfile.fxml'.";
        assert txtPhone != null : "fx:id=\"txtPhone\" was not injected: check your FXML file 'AgentProfile.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'AgentProfile.fxml'.";
        assert txtPosition != null : "fx:id=\"txtPosition\" was not injected: check your FXML file 'AgentProfile.fxml'.";
        assert txtAgencyId != null : "fx:id=\"txtAgencyId\" was not injected: check your FXML file 'AgentProfile.fxml'.";
        assert btnUpdate != null : "fx:id=\"btnUpdate\" was not injected: check your FXML file 'AgentProfile.fxml'.";
        assert btnChangePassword != null : "fx:id=\"btnChangePassword\" was not injected: check your FXML file 'AgentProfile.fxml'.";


        agent_login = Globals.agent;
        refreshInfo();
        count=1;

    }

    private void setAgentInfo(){

        Agents agent = (new AgentDB()).getAgent(agent_login.getAgentId());

        if(agent.getUsername().substring(agent.getUsername().length()-1).equals("s")){
            txtProfileHeading.setText(agent.getUsername()+"'"+" Profile");
        }else{
            txtProfileHeading.setText(agent.getUsername()+"'s"+" Profile");
        }

        txtAgentId.setText(String.valueOf(agent.getAgentId()));
        txtUsername.setText(agent.getUsername());
        txtFirstName.setText(agent.getAgtFirstName());
        txtMiddleInitial.setText(agent.getAgtMiddleInitial());
        txtLastName.setText(agent.getAgtLastName());
        txtPhone.setText(agent.getAgtBusPhone());
        txtEmail.setText(agent.getAgtEmail());
        txtPosition.setText(agent.getAgtPosition());
        txtAgencyId.setText(String.valueOf(agent.getAgencyId()));

    }

    private  void enableFields() {

        AnchorPane pane = profilePane;

        for (Node node : pane.getChildren()) {

            if (node instanceof TextField) {
                ((TextField) node).setEditable(true);

            }
        }
    }

    private  void disableFields() {

        AnchorPane pane = profilePane;

        for (Node node : pane.getChildren()) {

            if (node instanceof TextField) {
                ((TextField) node).setEditable(false);

            }
        }
    }





}

