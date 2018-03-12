package TravelExpertsClasses;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Employees {
    private String empFirstName;
    private String empMiddleInitial;
    private String empLastName;
    private String empBusPhone;
    private String empEmail;
    private String empPosition;

    @Basic
    @Column(name = "EmpFirstName")
    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    @Basic
    @Column(name = "EmpMiddleInitial")
    public String getEmpMiddleInitial() {
        return empMiddleInitial;
    }

    public void setEmpMiddleInitial(String empMiddleInitial) {
        this.empMiddleInitial = empMiddleInitial;
    }

    @Basic
    @Column(name = "EmpLastName")
    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    @Basic
    @Column(name = "EmpBusPhone")
    public String getEmpBusPhone() {
        return empBusPhone;
    }

    public void setEmpBusPhone(String empBusPhone) {
        this.empBusPhone = empBusPhone;
    }

    @Basic
    @Column(name = "EmpEmail")
    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    @Basic
    @Column(name = "EmpPosition")
    public String getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return Objects.equals(empFirstName, employees.empFirstName) &&
                Objects.equals(empMiddleInitial, employees.empMiddleInitial) &&
                Objects.equals(empLastName, employees.empLastName) &&
                Objects.equals(empBusPhone, employees.empBusPhone) &&
                Objects.equals(empEmail, employees.empEmail) &&
                Objects.equals(empPosition, employees.empPosition);
    }

    @Override
    public int hashCode() {

        return Objects.hash(empFirstName, empMiddleInitial, empLastName, empBusPhone, empEmail, empPosition);
    }
}
