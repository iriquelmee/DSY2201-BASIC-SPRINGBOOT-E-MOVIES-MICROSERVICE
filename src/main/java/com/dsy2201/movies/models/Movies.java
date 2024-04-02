package com.dsy2201.movies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

//CREATED AND MANTAINED BY IGNACIO RIQUELME 1-04-2024
@Entity
@TableGenerator(name = "Movies")
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="titulo")
    private String titulo;
    @Column(name="año")
    private Integer año;
    @Column(name="director")
    private String director;
    @Column(name="genero")
    private String genero;
    @Column(name="sinopsis")
    private String sinopsis;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getAño() {
        return año;
    }
    public void setAño(Integer año) {
        this.año = año;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public Movies(int id, String titulo, Integer año, String director, String genero, String sinopsis) {
        this.id = id;
        this.titulo = titulo;
        this.año = año;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }


    public Movies() {
        this.id = 0;
        this.titulo = "";
        this.año = 0;
        this.director = "";
        this.genero = "";
        this.sinopsis = "";
    }
    
}
