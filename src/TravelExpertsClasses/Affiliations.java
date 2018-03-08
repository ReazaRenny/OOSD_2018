package TravelExpertsClasses;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Affiliations {
    private String affilitationId;
    private String affName;
    private String affDesc;

    @Id
    @Column(name = "AffilitationId")
    public String getAffilitationId() {
        return affilitationId;
    }

    public void setAffilitationId(String affilitationId) {
        this.affilitationId = affilitationId;
    }

    @Basic
    @Column(name = "AffName")
    public String getAffName() {
        return affName;
    }

    public void setAffName(String affName) {
        this.affName = affName;
    }

    @Basic
    @Column(name = "AffDesc")
    public String getAffDesc() {
        return affDesc;
    }

    public void setAffDesc(String affDesc) {
        this.affDesc = affDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Affiliations that = (Affiliations) o;
        return Objects.equals(affilitationId, that.affilitationId) &&
                Objects.equals(affName, that.affName) &&
                Objects.equals(affDesc, that.affDesc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(affilitationId, affName, affDesc);
    }
}
