package TravelExpertsClasses;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "packages_products_suppliers", schema = "travelexperts", catalog = "")
@IdClass(PackagesProductsSuppliersPK.class)
public class PackagesProductsSuppliers {
    private int packageId;
    private int productSupplierId;

    @Id
    @Column(name = "PackageId")
    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    @Id
    @Column(name = "ProductSupplierId")
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
        PackagesProductsSuppliers that = (PackagesProductsSuppliers) o;
        return packageId == that.packageId &&
                productSupplierId == that.productSupplierId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(packageId, productSupplierId);
    }
}
