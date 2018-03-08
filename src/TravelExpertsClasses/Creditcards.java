package TravelExpertsClasses;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Creditcards {
    private int creditCardId;
    private String ccName;
    private String ccNumber;
    private Timestamp ccExpiry;
    private int customerId;

    @Id
    @Column(name = "CreditCardId")
    public int getCreditCardId() {
        return creditCardId;
    }

    public void setCreditCardId(int creditCardId) {
        this.creditCardId = creditCardId;
    }

    @Basic
    @Column(name = "CCName")
    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName;
    }

    @Basic
    @Column(name = "CCNumber")
    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    @Basic
    @Column(name = "CCExpiry")
    public Timestamp getCcExpiry() {
        return ccExpiry;
    }

    public void setCcExpiry(Timestamp ccExpiry) {
        this.ccExpiry = ccExpiry;
    }

    @Basic
    @Column(name = "CustomerId")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creditcards that = (Creditcards) o;
        return creditCardId == that.creditCardId &&
                customerId == that.customerId &&
                Objects.equals(ccName, that.ccName) &&
                Objects.equals(ccNumber, that.ccNumber) &&
                Objects.equals(ccExpiry, that.ccExpiry);
    }

    @Override
    public int hashCode() {

        return Objects.hash(creditCardId, ccName, ccNumber, ccExpiry, customerId);
    }
}
