package Code;


import Database.AgentDB;
import TravelExpertsClasses.Agents;
import javafx.application.Platform;
import javafx.event.ActionEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane apLogin;

    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnSignIn;

    @FXML
    private AnchorPane apImage;

    @FXML
    private SplitPane splitPane;

    public static boolean agentExists = false;

    @FXML
    void initialize() {

        assert apLogin != null : "fx:id=\"apLogin\" was not injected: check your FXML file 'Login.fxml'.";
        assert txtUsername != null : "fx:id=\"txtUsername\" was not injected: check your FXML file 'Login.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'Login.fxml'.";
        assert btnSignIn != null : "fx:id=\"btnSignIn\" was not injected: check your FXML file 'Login.fxml'.";
        assert apImage != null : "fx:id=\"apImage\" was not injected: check your FXML file 'Login.fxml'.";




    }

    public void signIn(ActionEvent event) {


        String username = txtUsername.getText();
        String password = txtPassword.getText();

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning Dialog");

        if(username.isEmpty() || password.isEmpty()){


            alert.setHeaderText("Enter a username and password");
            alert.setContentText("You must enter a valid username and password!");
            alert.showAndWait();
            return;
        }

        try {

            String Entered_pass = encryptPassword(password);
            System.out.println(Entered_pass);
            AgentDB db = new AgentDB();
            Agents agent = db.getAgent(username,Entered_pass);

            if(agentExists)
            {
                System.out.println("success");
                System.out.println(agent);
                try{
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(this.getClass().getResource("../Code/mainInterface.fxml"));
                /*
                 * if "fx:controller" is not set in fxml
                 * fxmlLoader.setController(NewWindowController);
                 */
                Scene scene = new Scene(fxmlLoader.load(), 850, 545);
                scene.getStylesheets().addAll(getClass().getResource("../resources/dashboardStyles.css").toExternalForm());

                Stage stage = new Stage();
                stage.setTitle("Travel Experts");
                stage.setScene(scene);
                //stage.setMaximized(true);
                //stage.setFullScreen(true);
                stage.show();
                closeLogin(); // closes login window after successful login
                
            } catch (IOException e) {
                Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }

            }
            else {

                alert.setHeaderText("Invalid Credentials");
                alert.setContentText("You must enter a valid username and password!");
                alert.showAndWait();
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


        private static final String ALGO = "AES";
        private static final byte[] keyValue =
                new byte[]{'T', 'h', 'e', 'B', 'e', 's', 't', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y'};

    private String encryptPassword(String p) throws Exception{

        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(p.getBytes());
        return Base64.getEncoder().encodeToString(encVal);

    }


    /**
     * Generate a new encryption key.
     */
    private static Key generateKey() throws Exception {
        return new SecretKeySpec(keyValue, ALGO);
    }
    
    
    // closes login page after successful login
    public void closeLogin() {
        Stage stage1 = (Stage) btnSignIn.getScene().getWindow();
        stage1.close();
   }
}
