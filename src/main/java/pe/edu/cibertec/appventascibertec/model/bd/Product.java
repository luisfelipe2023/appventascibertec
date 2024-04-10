package pe.edu.cibertec.appventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ProductID")
    private Integer productid;
    @Column(name = "ProductName")
    private String productname;
    @Column(name = "QuantityPerUnit")
    private String quantityperunit;
    @Column(name = "UnitPrice")
    private Double unitprice;
    @Column(name = "UnitsInStock")
    private Integer unitsinstock;
    @Column(name = "UnitsOnOrder")
    private Integer unitsonorder;
    @Column(name = "ReorderLevel")
    private Integer reorderlevel;
    @Column(name = "Discontinued")
    private Boolean discontinued;
    @ManyToOne
    @JoinColumn(name = "SupplierID")
    private Supplier supplier;
    @ManyToOne
    @JoinColumn(name = "CategoryID")
    private Category category;
}