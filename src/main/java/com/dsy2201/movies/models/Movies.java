package com.dsy2201.movies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies") // Replace "YOUR_TABLE_NAME" with the actual table name
public class Movies {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    
    @Column(name = "TITULO", length = 128)
    private String titulo;
    
    @Column(name = "AÑO")
    private int año;
    
    @Column(name = "DIRECTOR", length = 128)
    private String director;
    
    @Column(name = "GENERO", length = 64)
    private String genero;
    
    @Column(name = "SINOPSIS", length = 256)
    private String sinopsis;

    // Constructors
    public Movies() {
        this.titulo = "";
        this.año = 0;
        this.director = "";
        this.genero = "";
        this.sinopsis = "";
    }

    public Movies(String titulo, int año, String director, String genero, String sinopsis) {
        this.titulo = titulo;
        this.año = año;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    // Getters and Setters
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
}
