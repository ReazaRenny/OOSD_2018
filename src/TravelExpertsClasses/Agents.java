package TravelExpertsClasses;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Agents {
    private int agentId;
    private String agtFirstName;
    private String agtMiddleInitial;
    private String agtLastName;
    private String agtBusPhone;
    private String agtEmail;
    private String agtPosition;
    private Integer agencyId;
    private String Username;
    private String Password;

    public Agents() {
    }

    public Agents(int agentId, String agtFirstName, String agtMiddleInitial, String agtLastName, String agtBusPhone, String agtEmail, String agtPosition, Integer agencyId, String username, String password) {
        this.agentId = agentId;
        this.agtFirstName = agtFirstName;
        this.agtMiddleInitial = agtMiddleInitial;
        this.agtLastName = agtLastName;
        this.agtBusPhone = agtBusPhone;
        this.agtEmail = agtEmail;
        this.agtPosition = agtPosition;
        this.agencyId = agencyId;
        this.Username = username;
        this.Password = password;
    }

    @Id
    @Column(name = "AgentId")
    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    @Basic
    @Column(name = "AgtFirstName")
    public String getAgtFirstName() {
        return agtFirstName;
    }

    public void setAgtFirstName(String agtFirstName) {
        this.agtFirstName = agtFirstName;
    }

    @Basic
    @Column(name = "AgtMiddleInitial")
    public String getAgtMiddleInitial() {
        return agtMiddleInitial;
    }

    public void setAgtMiddleInitial(String agtMiddleInitial) {
        this.agtMiddleInitial = agtMiddleInitial;
    }

    @Basic
    @Column(name = "AgtLastName")
    public String getAgtLastName() {
        return agtLastName;
    }

    public void setAgtLastName(String agtLastName) {
        this.agtLastName = agtLastName;
    }

    @Basic
    @Column(name = "AgtBusPhone")
    public String getAgtBusPhone() {
        return agtBusPhone;
    }

    public void setAgtBusPhone(String agtBusPhone) {
        this.agtBusPhone = agtBusPhone;
    }

    @Basic
    @Column(name = "AgtEmail")
    public String getAgtEmail() {
        return agtEmail;
    }

    public void setAgtEmail(String agtEmail) {
        this.agtEmail = agtEmail;
    }

    @Basic
    @Column(name = "AgtPosition")
    public String getAgtPosition() {
        return agtPosition;
    }

    public void setAgtPosition(String agtPosition) {
        this.agtPosition = agtPosition;
    }

    @Basic
    @Column(name = "AgencyId")
    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    @Basic
    @Column(name = "AgencyId")
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agents agents = (Agents) o;
        return agentId == agents.agentId &&
                Objects.equals(agtFirstName, agents.agtFirstName) &&
                Objects.equals(agtMiddleInitial, agents.agtMiddleInitial) &&
                Objects.equals(agtLastName, agents.agtLastName) &&
                Objects.equals(agtBusPhone, agents.agtBusPhone) &&
                Objects.equals(agtEmail, agents.agtEmail) &&
                Objects.equals(agtPosition, agents.agtPosition) &&
                Objects.equals(agencyId, agents.agencyId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(agentId, agtFirstName, agtMiddleInitial, agtLastName, agtBusPhone, agtEmail, agtPosition, agencyId);
    }

    @Override
    public String toString() {
        return "Agents{" +
                "agentId=" + agentId +
                ", agtFirstName='" + agtFirstName + '\'' +
                ", agtMiddleInitial='" + agtMiddleInitial + '\'' +
                ", agtLastName='" + agtLastName + '\'' +
                ", agtBusPhone='" + agtBusPhone + '\'' +
                ", agtEmail='" + agtEmail + '\'' +
                ", agtPosition='" + agtPosition + '\'' +
                ", agencyId=" + agencyId +
                '}';
    }
}
