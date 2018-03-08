package TravelExpertsClasses;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CustomersRewardsPK implements Serializable {
    private int customerId;
    private int rewardId;

    @Column(name = "CustomerId")
    @Id
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Column(name = "RewardId")
    @Id
    public int getRewardId() {
        return rewardId;
    }

    public void setRewardId(int rewardId) {
        this.rewardId = rewardId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomersRewardsPK that = (CustomersRewardsPK) o;
        return customerId == that.customerId &&
                rewardId == that.rewardId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerId, rewardId);
    }
}
