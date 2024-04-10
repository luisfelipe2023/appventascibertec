package pe.edu.cibertec.appventascibertec.model.bd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class Category {
    @Column(name = "CategoryID")
    private Integer categoryid;
    @Column(name = "CategoryName")
    private String categoryname;
    @Column(name = "Description")
    private String description;


}
