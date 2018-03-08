package TravelExpertsClasses;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Bookings {
    private int bookingId;
    private Timestamp bookingDate;
    private String bookingNo;
    private Double travelerCount;
    private Integer customerId;
    private String tripTypeId;
    private Integer packageId;

    @Id
    @Column(name = "BookingId")
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    @Basic
    @Column(name = "BookingDate")
    public Timestamp getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Timestamp bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Basic
    @Column(name = "BookingNo")
    public String getBookingNo() {
        return bookingNo;
    }

    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
    }

    @Basic
    @Column(name = "TravelerCount")
    public Double getTravelerCount() {
        return travelerCount;
    }

    public void setTravelerCount(Double travelerCount) {
        this.travelerCount = travelerCount;
    }

    @Basic
    @Column(name = "CustomerId")
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "TripTypeId")
    public String getTripTypeId() {
        return tripTypeId;
    }

    public void setTripTypeId(String tripTypeId) {
        this.tripTypeId = tripTypeId;
    }

    @Basic
    @Column(name = "PackageId")
    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bookings bookings = (Bookings) o;
        return bookingId == bookings.bookingId &&
                Objects.equals(bookingDate, bookings.bookingDate) &&
                Objects.equals(bookingNo, bookings.bookingNo) &&
                Objects.equals(travelerCount, bookings.travelerCount) &&
                Objects.equals(customerId, bookings.customerId) &&
                Objects.equals(tripTypeId, bookings.tripTypeId) &&
                Objects.equals(packageId, bookings.packageId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bookingId, bookingDate, bookingNo, travelerCount, customerId, tripTypeId, packageId);
    }
}
