package pe.edu.cibertec.appventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supplierid;
    @Column(name="CompanyName")
    private String companyname;
    @Column(name="ContactName")
    private String contactname;
    @Column(name="ContactTitle")
    private String contacttitle;
    @Column(name="Address")
    private String address;
    @Column(name="City")
    private String city;
    @Column(name="Region")
    private String region;
    @Column(name="PostalCode")
    private String postalcode;
    @Column(name="Country")
    private String country;
    @Column(name="Phone")
    private String phone;
    @Column(name="Fax")
    private String fax;
    @Column(name="HomePage")
    private String homepage;
}
