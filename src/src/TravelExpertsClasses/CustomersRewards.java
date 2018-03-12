package TravelExpertsClasses;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "customers_rewards", schema = "travelexperts", catalog = "")
@IdClass(CustomersRewardsPK.class)
public class CustomersRewards {
    private int customerId;
    private int rewardId;
    private String rwdNumber;

    @Id
    @Column(name = "CustomerId")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Id
    @Column(name = "RewardId")
    public int getRewardId() {
        return rewardId;
    }

    public void setRewardId(int rewardId) {
        this.rewardId = rewardId;
    }

    @Basic
    @Column(name = "RwdNumber")
    public String getRwdNumber() {
        return rwdNumber;
    }

    public void setRwdNumber(String rwdNumber) {
        this.rwdNumber = rwdNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomersRewards that = (CustomersRewards) o;
        return customerId == that.customerId &&
                rewardId == that.rewardId &&
                Objects.equals(rwdNumber, that.rwdNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerId, rewardId, rwdNumber);
    }
}
