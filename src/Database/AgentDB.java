package Database;

import Code.DBConnect;
import TravelExpertsClasses.Agents;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

import java.sql.*;

import static Code.LoginController.agentExists;

public class AgentDB {


    public Agents getAgent(String username, String password)  {

        Agents agent = new Agents();

        try {

            Connection conn = new DBConnect().getConnection();

            // TODO Auto-generated method stub

            PreparedStatement stmt = conn.prepareStatement("select * from agents WHERE Username = ? AND Password = ?");
            stmt.setString(1, username.trim());
            stmt.setString(2, password.trim());
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                agent.setAgentId(rs.getInt("AgentId"));
                agent.setAgtFirstName(rs.getString("AgtFirstName"));
                agent.setAgtMiddleInitial(rs.getString("AgtMiddleInitial"));
                agent.setAgtLastName(rs.getString("AgtLastName"));
                agent.setAgtBusPhone(rs.getString("AgtBusPhone"));
                agent.setAgtEmail(rs.getString("AgtEmail"));
                agent.setAgtPosition(rs.getString("AgtPosition"));
                agent.setAgencyId(rs.getInt("AgencyId"));
                agent.setUsername(rs.getString("Username"));
                agent.setPassword(rs.getString("Password"));
                agentExists = true;
            }

            conn.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return agent;
    }

    public Agents getAgent(int aID)  {

        Agents agent = new Agents();

        try {

            Connection conn = new DBConnect().getConnection();

            // TODO Auto-generated method stub

            PreparedStatement stmt = conn.prepareStatement("select * from agents WHERE AgentId = ?");
            stmt.setInt(1, aID);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                agent.setAgentId(rs.getInt("AgentId"));
                agent.setAgtFirstName(rs.getString("AgtFirstName"));
                agent.setAgtMiddleInitial(rs.getString("AgtMiddleInitial"));
                agent.setAgtLastName(rs.getString("AgtLastName"));
                agent.setAgtBusPhone(rs.getString("AgtBusPhone"));
                agent.setAgtEmail(rs.getString("AgtEmail"));
                agent.setAgtPosition(rs.getString("AgtPosition"));
                agent.setAgencyId(rs.getInt("AgencyId"));
                agent.setUsername(rs.getString("Username"));
                agent.setPassword(rs.getString("Password"));
                agentExists = true;
            }

            conn.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return agent;
    }


    public boolean updateAgent(Agents ua){

        try {
            Connection conn = new DBConnect().getConnection();

            String query = "UPDATE agents SET AgtFirstName = ?, AgtMiddleInitial = ?, AgtLastName = ?," +
                    "AgtBusPhone = ?, AgtEmail = ?, AgtPosition = ?, AgencyId = ?, Username = ? WHERE AgentId = ?";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, ua.getAgtFirstName());
            preparedStmt.setString(2, ua.getAgtMiddleInitial());
            preparedStmt.setString(3, ua.getAgtLastName());
            preparedStmt.setString(4, ua.getAgtBusPhone());
            preparedStmt.setString(5, ua.getAgtEmail());
            preparedStmt.setString(6, ua.getAgtPosition());
            preparedStmt.setInt(7, ua.getAgencyId());
            preparedStmt.setString(8, ua.getUsername());
            preparedStmt.setInt(9, ua.getAgentId());

            preparedStmt.executeUpdate();

            Alert complete = new Alert(Alert.AlertType.INFORMATION);
            complete.setTitle("Agent updated");
            complete.setHeaderText(null);
            complete.setContentText("The Agent edits have been saved to the database!");

            complete.showAndWait();
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }

    }

    public boolean updatePassword(String pw, int id){

        try {
            Connection conn = new DBConnect().getConnection();

            String query = "UPDATE agents SET Password = ? WHERE AgentId = ?";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, pw);
            preparedStmt.setInt(2, id);

            preparedStmt.executeUpdate();

            Alert complete = new Alert(Alert.AlertType.INFORMATION);
            complete.setTitle("Agent updated");
            complete.setHeaderText(null);
            complete.setContentText("The Agent password has been updated!");

            complete.showAndWait();
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }

    }
}
