package com.ratingVideojuegosEjemplo.servicio;

import com.ratingVideojuegosEjemplo.entidad.Videojuego;
import com.ratingVideojuegosEjemplo.repositorio.VideojuegoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoServicio {

    private VideojuegoRepositorio videojuegoRepositorio;

    @Autowired
    public VideojuegoServicio(VideojuegoRepositorio videojuegoRepositorio) {
        this.videojuegoRepositorio = videojuegoRepositorio;
    }

    public void guardarVideojuego(Videojuego videojuego) {
        this.videojuegoRepositorio.save(videojuego);
    }

    public List<Videojuego> verVideojuegos() {
        return this.videojuegoRepositorio.findAll();
    }

}
