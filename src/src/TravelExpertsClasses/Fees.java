package TravelExpertsClasses;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Fees {
    private String feeId;
    private String feeName;
    private BigDecimal feeAmt;
    private String feeDesc;

    @Id
    @Column(name = "FeeId")
    public String getFeeId() {
        return feeId;
    }

    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }

    @Basic
    @Column(name = "FeeName")
    public String getFeeName() {
        return feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    @Basic
    @Column(name = "FeeAmt")
    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(BigDecimal feeAmt) {
        this.feeAmt = feeAmt;
    }

    @Basic
    @Column(name = "FeeDesc")
    public String getFeeDesc() {
        return feeDesc;
    }

    public void setFeeDesc(String feeDesc) {
        this.feeDesc = feeDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fees fees = (Fees) o;
        return Objects.equals(feeId, fees.feeId) &&
                Objects.equals(feeName, fees.feeName) &&
                Objects.equals(feeAmt, fees.feeAmt) &&
                Objects.equals(feeDesc, fees.feeDesc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(feeId, feeName, feeAmt, feeDesc);
    }
}
