package duongdd.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "pinsolarproductentity")
@Entity
@Table(name = "PinSolarProduct", schema = "dbo", catalog = "PinSolarSuggestions")
@NamedQueries({
        @NamedQuery(name = "PinSolarProductEntity.findByName", query = "SELECT P FROM PinSolarProductEntity P WHERE P.namePinSolar = :namePinSolar"),
        @NamedQuery(name = "PinSolarProductEntity.findAll", query = "SELECT P FROM PinSolarProductEntity P")
})
public class PinSolarProductEntity {
    private int idPinSolar;
    private String namePinSolar;
    private String pricePinSolar;
    private double capacityPinSolar;
    private String imagePinSolar;
    private int idCategoryPinSolar;
    private CategoryPinSolarEntity categoryPinSolarByIdCategoryPinSolar;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPinSolar", nullable = false)
    public int getIdPinSolar() {
        return idPinSolar;
    }

    public void setIdPinSolar(int idPinSolar) {
        this.idPinSolar = idPinSolar;
    }

    @Basic
    @Column(name = "namePinSolar", nullable = false, length = 200)
    public String getNamePinSolar() {
        return namePinSolar;
    }

    public void setNamePinSolar(String namePinSolar) {
        this.namePinSolar = namePinSolar;
    }

    @Basic
    @Column(name = "pricePinSolar", nullable = false, length = 100)
    public String getPricePinSolar() {
        return pricePinSolar;
    }

    public void setPricePinSolar(String pricePinSolar) {
        this.pricePinSolar = pricePinSolar;
    }

    @Basic
    @Column(name = "capacityPinSolar", nullable = false, precision = 0)
    public double getCapacityPinSolar() {
        return capacityPinSolar;
    }

    public void setCapacityPinSolar(double capacityPinSolar) {
        this.capacityPinSolar = capacityPinSolar;
    }

    @Basic
    @Column(name = "imagePinSolar", nullable = true, length = 2147483647)
    public String getImagePinSolar() {
        return imagePinSolar;
    }

    public void setImagePinSolar(String imagePinSolar) {
        this.imagePinSolar = imagePinSolar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PinSolarProductEntity that = (PinSolarProductEntity) o;
        return idPinSolar == that.idPinSolar &&
                Double.compare(that.capacityPinSolar, capacityPinSolar) == 0 &&
                Objects.equals(namePinSolar, that.namePinSolar) &&
                Objects.equals(pricePinSolar, that.pricePinSolar) &&
                Objects.equals(imagePinSolar, that.imagePinSolar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPinSolar, namePinSolar, pricePinSolar, capacityPinSolar, imagePinSolar);
    }

    @Basic
    @Column(name = "idCategoryPinSolar", nullable = false)
    public int getIdCategoryPinSolar() {
        return idCategoryPinSolar;
    }

    public void setIdCategoryPinSolar(int idCategoryPinSolar) {
        this.idCategoryPinSolar = idCategoryPinSolar;
    }

    @ManyToOne
    @JoinColumn(name = "idCategoryPinSolar", referencedColumnName = "idCategoryPinSolar", nullable = false, insertable = false, updatable = false)
    public CategoryPinSolarEntity getCategoryPinSolarByIdCategoryPinSolar() {
        return categoryPinSolarByIdCategoryPinSolar;
    }

    public void setCategoryPinSolarByIdCategoryPinSolar(CategoryPinSolarEntity categoryPinSolarByIdCategoryPinSolar) {
        this.categoryPinSolarByIdCategoryPinSolar = categoryPinSolarByIdCategoryPinSolar;
    }
}
