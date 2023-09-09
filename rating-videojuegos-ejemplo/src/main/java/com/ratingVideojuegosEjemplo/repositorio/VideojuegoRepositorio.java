package com.ratingVideojuegosEjemplo.repositorio;

import com.ratingVideojuegosEjemplo.entidad.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideojuegoRepositorio extends JpaRepository<Videojuego, Integer> {

}
