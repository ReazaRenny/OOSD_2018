package TravelExpertsClasses;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Bookingdetails {
    private int bookingDetailId;
    private Double itineraryNo;
    private Timestamp tripStart;
    private Timestamp tripEnd;
    private String description;
    private String destination;
    private BigDecimal basePrice;
    private BigDecimal agencyCommission;
    private Integer bookingId;
    private String regionId;
    private String classId;
    private String feeId;
    private Integer productSupplierId;

    @Id
    @Column(name = "BookingDetailId")
    public int getBookingDetailId() {
        return bookingDetailId;
    }

    public void setBookingDetailId(int bookingDetailId) {
        this.bookingDetailId = bookingDetailId;
    }

    @Basic
    @Column(name = "ItineraryNo")
    public Double getItineraryNo() {
        return itineraryNo;
    }

    public void setItineraryNo(Double itineraryNo) {
        this.itineraryNo = itineraryNo;
    }

    @Basic
    @Column(name = "TripStart")
    public Timestamp getTripStart() {
        return tripStart;
    }

    public void setTripStart(Timestamp tripStart) {
        this.tripStart = tripStart;
    }

    @Basic
    @Column(name = "TripEnd")
    public Timestamp getTripEnd() {
        return tripEnd;
    }

    public void setTripEnd(Timestamp tripEnd) {
        this.tripEnd = tripEnd;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "Destination")
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Basic
    @Column(name = "BasePrice")
    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    @Basic
    @Column(name = "AgencyCommission")
    public BigDecimal getAgencyCommission() {
        return agencyCommission;
    }

    public void setAgencyCommission(BigDecimal agencyCommission) {
        this.agencyCommission = agencyCommission;
    }

    @Basic
    @Column(name = "BookingId")
    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    @Basic
    @Column(name = "RegionId")
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Basic
    @Column(name = "ClassId")
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "FeeId")
    public String getFeeId() {
        return feeId;
    }

    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }

    @Basic
    @Column(name = "ProductSupplierId")
    public Integer getProductSupplierId() {
        return productSupplierId;
    }

    public void setProductSupplierId(Integer productSupplierId) {
        this.productSupplierId = productSupplierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bookingdetails that = (Bookingdetails) o;
        return bookingDetailId == that.bookingDetailId &&
                Objects.equals(itineraryNo, that.itineraryNo) &&
                Objects.equals(tripStart, that.tripStart) &&
                Objects.equals(tripEnd, that.tripEnd) &&
                Objects.equals(description, that.description) &&
                Objects.equals(destination, that.destination) &&
                Objects.equals(basePrice, that.basePrice) &&
                Objects.equals(agencyCommission, that.agencyCommission) &&
                Objects.equals(bookingId, that.bookingId) &&
                Objects.equals(regionId, that.regionId) &&
                Objects.equals(classId, that.classId) &&
                Objects.equals(feeId, that.feeId) &&
                Objects.equals(productSupplierId, that.productSupplierId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bookingDetailId, itineraryNo, tripStart, tripEnd, description, destination, basePrice, agencyCommission, bookingId, regionId, classId, feeId, productSupplierId);
    }
}
