package pe.edu.cibertec.appventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="CategoryID")
    private Integer categoryid;
    @Column(name ="CategoryName")
    private String categoryname;
    @Column(name = "Description")
    private String description;
}