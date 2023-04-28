package edu.co.icesi.banner.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;


    @OneToMany(mappedBy = "teacher") //Nombre de la clase
    @JsonIgnore
    private List<Product> cours;

    public List<Product> getCourses() {
        return cours;
    }

    public void setCourses(List<Product> cours) {
        this.cours = cours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
