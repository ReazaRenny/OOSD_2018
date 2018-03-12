package TravelExpertsClasses;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Packages {
    private int packageId;
    private String pkgName;
    private Timestamp pkgStartDate;
    private Timestamp pkgEndDate;
    private String pkgDesc;
    private BigDecimal pkgBasePrice;
    private BigDecimal pkgAgencyCommission;

    @Id
    @Column(name = "PackageId")
    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    @Basic
    @Column(name = "PkgName")
    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }

    @Basic
    @Column(name = "PkgStartDate")
    public Timestamp getPkgStartDate() {
        return pkgStartDate;
    }

    public void setPkgStartDate(Timestamp pkgStartDate) {
        this.pkgStartDate = pkgStartDate;
    }

    @Basic
    @Column(name = "PkgEndDate")
    public Timestamp getPkgEndDate() {
        return pkgEndDate;
    }

    public void setPkgEndDate(Timestamp pkgEndDate) {
        this.pkgEndDate = pkgEndDate;
    }

    @Basic
    @Column(name = "PkgDesc")
    public String getPkgDesc() {
        return pkgDesc;
    }

    public void setPkgDesc(String pkgDesc) {
        this.pkgDesc = pkgDesc;
    }

    @Basic
    @Column(name = "PkgBasePrice")
    public BigDecimal getPkgBasePrice() {
        return pkgBasePrice;
    }

    public void setPkgBasePrice(BigDecimal pkgBasePrice) {
        this.pkgBasePrice = pkgBasePrice;
    }

    @Basic
    @Column(name = "PkgAgencyCommission")
    public BigDecimal getPkgAgencyCommission() {
        return pkgAgencyCommission;
    }

    public void setPkgAgencyCommission(BigDecimal pkgAgencyCommission) {
        this.pkgAgencyCommission = pkgAgencyCommission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Packages packages = (Packages) o;
        return packageId == packages.packageId &&
                Objects.equals(pkgName, packages.pkgName) &&
                Objects.equals(pkgStartDate, packages.pkgStartDate) &&
                Objects.equals(pkgEndDate, packages.pkgEndDate) &&
                Objects.equals(pkgDesc, packages.pkgDesc) &&
                Objects.equals(pkgBasePrice, packages.pkgBasePrice) &&
                Objects.equals(pkgAgencyCommission, packages.pkgAgencyCommission);
    }

    @Override
    public int hashCode() {

        return Objects.hash(packageId, pkgName, pkgStartDate, pkgEndDate, pkgDesc, pkgBasePrice, pkgAgencyCommission);
    }
}
