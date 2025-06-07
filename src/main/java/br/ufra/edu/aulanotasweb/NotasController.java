package br.ufra.edu.aulanotasweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notas")
public class NotasController {
    @Autowired
    private INotas notas;

    @GetMapping
    public List<Nota> listar() {
        return notas.findAll();
    }

    @PostMapping
    public Nota adicionar(@RequestBody Nota nota) {
        return notas.save(nota);
    }
}
