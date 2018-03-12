package TravelExpertsClasses;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Rewards {
    private int rewardId;
    private String rwdName;
    private String rwdDesc;

    @Id
    @Column(name = "RewardId")
    public int getRewardId() {
        return rewardId;
    }

    public void setRewardId(int rewardId) {
        this.rewardId = rewardId;
    }

    @Basic
    @Column(name = "RwdName")
    public String getRwdName() {
        return rwdName;
    }

    public void setRwdName(String rwdName) {
        this.rwdName = rwdName;
    }

    @Basic
    @Column(name = "RwdDesc")
    public String getRwdDesc() {
        return rwdDesc;
    }

    public void setRwdDesc(String rwdDesc) {
        this.rwdDesc = rwdDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rewards rewards = (Rewards) o;
        return rewardId == rewards.rewardId &&
                Objects.equals(rwdName, rewards.rwdName) &&
                Objects.equals(rwdDesc, rewards.rwdDesc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rewardId, rwdName, rwdDesc);
    }
}
