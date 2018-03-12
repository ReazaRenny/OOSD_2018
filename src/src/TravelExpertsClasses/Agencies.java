package TravelExpertsClasses;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Agencies {
    private int agencyId;
    private String agncyAddress;
    private String agncyCity;
    private String agncyProv;
    private String agncyPostal;
    private String agncyCountry;
    private String agncyPhone;
    private String agncyFax;

    @Id
    @Column(name = "AgencyId")
    public int getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(int agencyId) {
        this.agencyId = agencyId;
    }

    @Basic
    @Column(name = "AgncyAddress")
    public String getAgncyAddress() {
        return agncyAddress;
    }

    public void setAgncyAddress(String agncyAddress) {
        this.agncyAddress = agncyAddress;
    }

    @Basic
    @Column(name = "AgncyCity")
    public String getAgncyCity() {
        return agncyCity;
    }

    public void setAgncyCity(String agncyCity) {
        this.agncyCity = agncyCity;
    }

    @Basic
    @Column(name = "AgncyProv")
    public String getAgncyProv() {
        return agncyProv;
    }

    public void setAgncyProv(String agncyProv) {
        this.agncyProv = agncyProv;
    }

    @Basic
    @Column(name = "AgncyPostal")
    public String getAgncyPostal() {
        return agncyPostal;
    }

    public void setAgncyPostal(String agncyPostal) {
        this.agncyPostal = agncyPostal;
    }

    @Basic
    @Column(name = "AgncyCountry")
    public String getAgncyCountry() {
        return agncyCountry;
    }

    public void setAgncyCountry(String agncyCountry) {
        this.agncyCountry = agncyCountry;
    }

    @Basic
    @Column(name = "AgncyPhone")
    public String getAgncyPhone() {
        return agncyPhone;
    }

    public void setAgncyPhone(String agncyPhone) {
        this.agncyPhone = agncyPhone;
    }

    @Basic
    @Column(name = "AgncyFax")
    public String getAgncyFax() {
        return agncyFax;
    }

    public void setAgncyFax(String agncyFax) {
        this.agncyFax = agncyFax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agencies agencies = (Agencies) o;
        return agencyId == agencies.agencyId &&
                Objects.equals(agncyAddress, agencies.agncyAddress) &&
                Objects.equals(agncyCity, agencies.agncyCity) &&
                Objects.equals(agncyProv, agencies.agncyProv) &&
                Objects.equals(agncyPostal, agencies.agncyPostal) &&
                Objects.equals(agncyCountry, agencies.agncyCountry) &&
                Objects.equals(agncyPhone, agencies.agncyPhone) &&
                Objects.equals(agncyFax, agencies.agncyFax);
    }

    @Override
    public int hashCode() {

        return Objects.hash(agencyId, agncyAddress, agncyCity, agncyProv, agncyPostal, agncyCountry, agncyPhone, agncyFax);
    }
}
