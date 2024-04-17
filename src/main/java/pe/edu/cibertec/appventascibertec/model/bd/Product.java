package pe.edu.cibertec.appventascibertec.model.bd;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

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