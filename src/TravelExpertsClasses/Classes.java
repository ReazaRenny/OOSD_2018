package TravelExpertsClasses;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Classes {
    private String classId;
    private String className;
    private String classDesc;

    @Id
    @Column(name = "ClassId")
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "ClassName")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Basic
    @Column(name = "ClassDesc")
    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classes classes = (Classes) o;
        return Objects.equals(classId, classes.classId) &&
                Objects.equals(className, classes.className) &&
                Objects.equals(classDesc, classes.classDesc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(classId, className, classDesc);
    }
}
