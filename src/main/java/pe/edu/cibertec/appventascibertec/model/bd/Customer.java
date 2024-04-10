package pe.edu.cibertec.appventascibertec.model.bd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @Column(name = "CustomerID")
    private String customerid;
    @Column(name = "CompanyName")
    private String companyname;
    @Column(name = "ContactName")
    private String contactname;
    @Column(name = "ContactTitle")
    private String contacttitle;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "Region")
    private String region;
    @Column(name = "PostalCode")
    private String postalcode;
    @Column(name = "Country")
    private String country;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Fax")
    private String fax;
}