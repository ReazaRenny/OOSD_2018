package Database;

import Code.DBConnect;
import TravelExpertsClasses.Agents;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
                agentExists = true;
            }

            conn.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return agent;
    }
}
