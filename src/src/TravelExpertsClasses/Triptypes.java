package TravelExpertsClasses;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Triptypes {
    private String tripTypeId;
    private String ttName;

    @Id
    @Column(name = "TripTypeId")
    public String getTripTypeId() {
        return tripTypeId;
    }

    public void setTripTypeId(String tripTypeId) {
        this.tripTypeId = tripTypeId;
    }

    @Basic
    @Column(name = "TTName")
    public String getTtName() {
        return ttName;
    }

    public void setTtName(String ttName) {
        this.ttName = ttName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triptypes triptypes = (Triptypes) o;
        return Objects.equals(tripTypeId, triptypes.tripTypeId) &&
                Objects.equals(ttName, triptypes.ttName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tripTypeId, ttName);
    }
}
