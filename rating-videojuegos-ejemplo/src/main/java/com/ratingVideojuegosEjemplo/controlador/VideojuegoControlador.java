package com.ratingVideojuegosEjemplo.controlador;

import com.ratingVideojuegosEjemplo.entidad.Videojuego;
import com.ratingVideojuegosEjemplo.servicio.VideojuegoServicio;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/videojuego")
public class VideojuegoControlador {

    private VideojuegoServicio videojuegoServicio;

    @Autowired
    public VideojuegoControlador(VideojuegoServicio videojuegoServicio) {
        this.videojuegoServicio = videojuegoServicio;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarVideojuego(@RequestBody Videojuego videojuego) {
        if(videojuego.getNombreVideojuego().isEmpty()) {
            return ResponseEntity.badRequest().body("Nombre del videojuego es requerido");
        } else {
            this.videojuegoServicio.guardarVideojuego(videojuego);
            return ResponseEntity.ok("Videojuego guardado");
        }
    }

    @GetMapping("/ver-lista")
    public ResponseEntity<?> verListaVideojuegos() {
        List<Videojuego> listaVideojuegos = this.videojuegoServicio.verVideojuegos();

        if(listaVideojuegos.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(listaVideojuegos);
        }
    }


}
