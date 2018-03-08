package TravelExpertsClasses;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Suppliercontacts {
    private int supplierContactId;
    private String supConFirstName;
    private String supConLastName;
    private String supConCompany;
    private String supConAddress;
    private String supConCity;
    private String supConProv;
    private String supConPostal;
    private String supConCountry;
    private String supConBusPhone;
    private String supConFax;
    private String supConEmail;
    private String supConUrl;
    private String affiliationId;
    private Integer supplierId;

    @Id
    @Column(name = "SupplierContactId")
    public int getSupplierContactId() {
        return supplierContactId;
    }

    public void setSupplierContactId(int supplierContactId) {
        this.supplierContactId = supplierContactId;
    }

    @Basic
    @Column(name = "SupConFirstName")
    public String getSupConFirstName() {
        return supConFirstName;
    }

    public void setSupConFirstName(String supConFirstName) {
        this.supConFirstName = supConFirstName;
    }

    @Basic
    @Column(name = "SupConLastName")
    public String getSupConLastName() {
        return supConLastName;
    }

    public void setSupConLastName(String supConLastName) {
        this.supConLastName = supConLastName;
    }

    @Basic
    @Column(name = "SupConCompany")
    public String getSupConCompany() {
        return supConCompany;
    }

    public void setSupConCompany(String supConCompany) {
        this.supConCompany = supConCompany;
    }

    @Basic
    @Column(name = "SupConAddress")
    public String getSupConAddress() {
        return supConAddress;
    }

    public void setSupConAddress(String supConAddress) {
        this.supConAddress = supConAddress;
    }

    @Basic
    @Column(name = "SupConCity")
    public String getSupConCity() {
        return supConCity;
    }

    public void setSupConCity(String supConCity) {
        this.supConCity = supConCity;
    }

    @Basic
    @Column(name = "SupConProv")
    public String getSupConProv() {
        return supConProv;
    }

    public void setSupConProv(String supConProv) {
        this.supConProv = supConProv;
    }

    @Basic
    @Column(name = "SupConPostal")
    public String getSupConPostal() {
        return supConPostal;
    }

    public void setSupConPostal(String supConPostal) {
        this.supConPostal = supConPostal;
    }

    @Basic
    @Column(name = "SupConCountry")
    public String getSupConCountry() {
        return supConCountry;
    }

    public void setSupConCountry(String supConCountry) {
        this.supConCountry = supConCountry;
    }

    @Basic
    @Column(name = "SupConBusPhone")
    public String getSupConBusPhone() {
        return supConBusPhone;
    }

    public void setSupConBusPhone(String supConBusPhone) {
        this.supConBusPhone = supConBusPhone;
    }

    @Basic
    @Column(name = "SupConFax")
    public String getSupConFax() {
        return supConFax;
    }

    public void setSupConFax(String supConFax) {
        this.supConFax = supConFax;
    }

    @Basic
    @Column(name = "SupConEmail")
    public String getSupConEmail() {
        return supConEmail;
    }

    public void setSupConEmail(String supConEmail) {
        this.supConEmail = supConEmail;
    }

    @Basic
    @Column(name = "SupConURL")
    public String getSupConUrl() {
        return supConUrl;
    }

    public void setSupConUrl(String supConUrl) {
        this.supConUrl = supConUrl;
    }

    @Basic
    @Column(name = "AffiliationId")
    public String getAffiliationId() {
        return affiliationId;
    }

    public void setAffiliationId(String affiliationId) {
        this.affiliationId = affiliationId;
    }

    @Basic
    @Column(name = "SupplierId")
    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suppliercontacts that = (Suppliercontacts) o;
        return supplierContactId == that.supplierContactId &&
                Objects.equals(supConFirstName, that.supConFirstName) &&
                Objects.equals(supConLastName, that.supConLastName) &&
                Objects.equals(supConCompany, that.supConCompany) &&
                Objects.equals(supConAddress, that.supConAddress) &&
                Objects.equals(supConCity, that.supConCity) &&
                Objects.equals(supConProv, that.supConProv) &&
                Objects.equals(supConPostal, that.supConPostal) &&
                Objects.equals(supConCountry, that.supConCountry) &&
                Objects.equals(supConBusPhone, that.supConBusPhone) &&
                Objects.equals(supConFax, that.supConFax) &&
                Objects.equals(supConEmail, that.supConEmail) &&
                Objects.equals(supConUrl, that.supConUrl) &&
                Objects.equals(affiliationId, that.affiliationId) &&
                Objects.equals(supplierId, that.supplierId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(supplierContactId, supConFirstName, supConLastName, supConCompany, supConAddress, supConCity, supConProv, supConPostal, supConCountry, supConBusPhone, supConFax, supConEmail, supConUrl, affiliationId, supplierId);
    }
}
