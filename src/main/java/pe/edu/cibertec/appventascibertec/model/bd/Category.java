package pe.edu.cibertec.appventascibertec.model.bd;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="categoryid")
    private Integer categoryid;
    @Column(name ="categoryname")
    private String categoryname;
    @Column(name = "description")
    private String description;
}