package TravelExpertsClasses;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Regions {
    private String regionId;
    private String regionName;

    @Id
    @Column(name = "RegionId")
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Basic
    @Column(name = "RegionName")
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Regions regions = (Regions) o;
        return Objects.equals(regionId, regions.regionId) &&
                Objects.equals(regionName, regions.regionName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(regionId, regionName);
    }
}
