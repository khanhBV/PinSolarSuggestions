package duongdd.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ElectricProduct", schema = "dbo", catalog = "PinSolarSuggestions")
public class ElectricProductEntity {
    private int idProduct;
    private String productName;
    private double productCapacity;
    private int idCategory;
    private CategoryProductEntity categoryProductByIdCategory;

    @Id
    @Column(name = "idProduct", nullable = false)
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Basic
    @Column(name = "productName", nullable = false, length = 200)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "productCapacity", nullable = false, precision = 0)
    public double getProductCapacity() {
        return productCapacity;
    }

    public void setProductCapacity(double productCapacity) {
        this.productCapacity = productCapacity;
    }

    @Basic
    @Column(name = "idCategory", nullable = false)
    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElectricProductEntity that = (ElectricProductEntity) o;
        return idProduct == that.idProduct &&
                Double.compare(that.productCapacity, productCapacity) == 0 &&
                idCategory == that.idCategory &&
                Objects.equals(productName, that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, productName, productCapacity, idCategory);
    }

    @ManyToOne
    @JoinColumn(name = "idCategory", referencedColumnName = "idCategory", nullable = false)
    public CategoryProductEntity getCategoryProductByIdCategory() {
        return categoryProductByIdCategory;
    }

    public void setCategoryProductByIdCategory(CategoryProductEntity categoryProductByIdCategory) {
        this.categoryProductByIdCategory = categoryProductByIdCategory;
    }
}