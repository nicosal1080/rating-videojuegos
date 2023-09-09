package com.ratingVideojuegosEjemplo.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Videojuego {

    @Id
    private Integer idVideojuego;

    @Column(nullable = false, unique = true)
    private String nombreVideojuego;

    @Column(nullable = false)
    private Integer ratingVideojuego;


    public Videojuego() {

    }

    public String getNombreVideojuego() {
        return nombreVideojuego;
    }

    public void setNombreVideojuego(String nombreVideojuego) {
        this.nombreVideojuego = nombreVideojuego;
    }

    public Integer getRatingVideojuego() {
        return ratingVideojuego;
    }

    public void setRatingVideojuego(Integer ratingVideojuego) {
        this.ratingVideojuego = ratingVideojuego;
    }

    public Integer getIdVideojuego() {
        return idVideojuego;
    }

    public void setIdVideojuego(Integer idVideojuego) {
        this.idVideojuego = idVideojuego;
    }
}
