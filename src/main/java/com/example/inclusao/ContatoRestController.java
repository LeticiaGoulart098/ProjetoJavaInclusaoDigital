package com.example.inclusao;

import com.example.inclusao.model.Contato;
import com.example.inclusao.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contatos")
public class ContatoRestController {

    @Autowired
    private ContatoRepository contatoRepository;

    // GET - listar todos
    @GetMapping
    public List<Contato> listarTodos() {
        return contatoRepository.findAll();
    }

    // GET - buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Contato> buscarPorId(@PathVariable Long id) {
        return contatoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST - salvar contato
    @PostMapping
    public Contato salvar(@RequestBody Contato contato) {
        return contatoRepository.save(contato);
    }

    // DELETE - excluir
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!contatoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        contatoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
