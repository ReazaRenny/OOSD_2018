package TravelExpertsClasses;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PackagesProductsSuppliersPK implements Serializable {
    private int packageId;
    private int productSupplierId;

    @Column(name = "PackageId")
    @Id
    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    @Column(name = "ProductSupplierId")
    @Id
    public int getProductSupplierId() {
        return productSupplierId;
    }

    public void setProductSupplierId(int productSupplierId) {
        this.productSupplierId = productSupplierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackagesProductsSuppliersPK that = (PackagesProductsSuppliersPK) o;
        return packageId == that.packageId &&
                productSupplierId == that.productSupplierId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(packageId, productSupplierId);
    }
}
