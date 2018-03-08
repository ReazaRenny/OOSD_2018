package TravelExpertsClasses;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Customers {
    private int customerId;
    private String custFirstName;
    private String custLastName;
    private String custAddress;
    private String custCity;
    private String custProv;
    private String custPostal;
    private String custCountry;
    private String custHomePhone;
    private String custBusPhone;
    private String custEmail;
    private Integer agentId;

    @Id
    @Column(name = "CustomerId")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "CustFirstName")
    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    @Basic
    @Column(name = "CustLastName")
    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    @Basic
    @Column(name = "CustAddress")
    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    @Basic
    @Column(name = "CustCity")
    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    @Basic
    @Column(name = "CustProv")
    public String getCustProv() {
        return custProv;
    }

    public void setCustProv(String custProv) {
        this.custProv = custProv;
    }

    @Basic
    @Column(name = "CustPostal")
    public String getCustPostal() {
        return custPostal;
    }

    public void setCustPostal(String custPostal) {
        this.custPostal = custPostal;
    }

    @Basic
    @Column(name = "CustCountry")
    public String getCustCountry() {
        return custCountry;
    }

    public void setCustCountry(String custCountry) {
        this.custCountry = custCountry;
    }

    @Basic
    @Column(name = "CustHomePhone")
    public String getCustHomePhone() {
        return custHomePhone;
    }

    public void setCustHomePhone(String custHomePhone) {
        this.custHomePhone = custHomePhone;
    }

    @Basic
    @Column(name = "CustBusPhone")
    public String getCustBusPhone() {
        return custBusPhone;
    }

    public void setCustBusPhone(String custBusPhone) {
        this.custBusPhone = custBusPhone;
    }

    @Basic
    @Column(name = "CustEmail")
    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    @Basic
    @Column(name = "AgentId")
    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customers customers = (Customers) o;
        return customerId == customers.customerId &&
                Objects.equals(custFirstName, customers.custFirstName) &&
                Objects.equals(custLastName, customers.custLastName) &&
                Objects.equals(custAddress, customers.custAddress) &&
                Objects.equals(custCity, customers.custCity) &&
                Objects.equals(custProv, customers.custProv) &&
                Objects.equals(custPostal, customers.custPostal) &&
                Objects.equals(custCountry, customers.custCountry) &&
                Objects.equals(custHomePhone, customers.custHomePhone) &&
                Objects.equals(custBusPhone, customers.custBusPhone) &&
                Objects.equals(custEmail, customers.custEmail) &&
                Objects.equals(agentId, customers.agentId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerId, custFirstName, custLastName, custAddress, custCity, custProv, custPostal, custCountry, custHomePhone, custBusPhone, custEmail, agentId);
    }
}
