package com.tecsup.demo.controlador;

import com.tecsup.demo.modelo.Persona;
// Importaciones necesarias de Spring
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller // Indica que esta clase es un controlador de Spring MVC
public class PersonaControlador {

    // Cuando se accede a la URL "/personas"
    @GetMapping("/personas")
    public String mostrarPersonas(Model model) {
        // Crea una lista de objetos Persona con datos de ejemplo
        List<Persona> lista = List.of(
                new Persona("Ana", 28),
                new Persona("Luis", 35),
                new Persona("Maria", 22)
        );

        // Agrega la lista al modelo con el nombre "personas"
        model.addAttribute("personas", lista);

        // Retorna el nombre de la vista a mostrar (personas.html)
        return "personas";
    }
}
