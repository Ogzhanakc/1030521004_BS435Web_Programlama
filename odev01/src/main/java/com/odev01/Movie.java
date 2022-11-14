package com.odev01;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Movie")
@Entity
public class Movie {

    @Column(name = "movie_Id") @Id
    private Long movie_id;

    @Column(name = "movie_name")
    private String movie_name;

    @Column(name = "movie_year")
    private Long movie_year;

    public Movie(){}

    public Long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Long movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public Long getMovie_year() {
        return movie_year;
    }

    public void setMovie_year(Long movie_year) {
        this.movie_year = movie_year;
    }



}
