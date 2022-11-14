package com.odev01;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Director {


    @GeneratedValue
    @Column(name = "director_Id") @Id
    private Long director_id;

    @NotNull
    @Column(name = "director_name")
    private String director_name;

    public Director(){};

    public Long getDirector_id() {
        return director_id;
    }

    public void setDirector_id(Long director_id) {
        this.director_id = director_id;
    }

    public String getDirector_name() {
        return director_name;
    }

    public void setDirector_name(String director_name) {
        this.director_name = director_name;
    }
}
