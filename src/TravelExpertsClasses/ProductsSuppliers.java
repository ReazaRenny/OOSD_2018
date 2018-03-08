package TravelExpertsClasses;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "products_suppliers", schema = "travelexperts", catalog = "")
public class ProductsSuppliers {
    private int productSupplierId;
    private Integer productId;
    private Integer supplierId;

    @Id
    @Column(name = "ProductSupplierId")
    public int getProductSupplierId() {
        return productSupplierId;
    }

    public void setProductSupplierId(int productSupplierId) {
        this.productSupplierId = productSupplierId;
    }

    @Basic
    @Column(name = "ProductId")
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "SupplierId")
    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsSuppliers that = (ProductsSuppliers) o;
        return productSupplierId == that.productSupplierId &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(supplierId, that.supplierId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productSupplierId, productId, supplierId);
    }
}
