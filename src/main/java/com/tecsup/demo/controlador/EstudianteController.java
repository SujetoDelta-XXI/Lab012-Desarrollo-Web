package com.tecsup.demo.controlador;

import com.tecsup.demo.modelo.Estudiante;
import com.tecsup.demo.repository.EstudianteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EstudianteController {

    private final EstudianteRepository repo;

    public EstudianteController(EstudianteRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String listar(Model model) {
        model.addAttribute("estudiantes", repo.findAll());
        return "estudiantes";
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Estudiante estudiante) {
        repo.save(estudiante);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Estudiante estudiante = repo.findById(id).orElseThrow();
        model.addAttribute("estudiante", estudiante);
        return "formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/";
    }
}
