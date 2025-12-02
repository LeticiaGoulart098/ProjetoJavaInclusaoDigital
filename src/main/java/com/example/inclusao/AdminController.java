package com.example.inclusao;

import com.example.inclusao.model.Contato;
import com.example.inclusao.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contatos")
public class AdminController {

    @Autowired
    private ContatoRepository contatoRepository;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("contatos", contatoRepository.findAll());
        model.addAttribute("novoContato", new Contato());
        return "contatos";
    }

    @PostMapping("/add")
    public String adicionar(@ModelAttribute Contato contato) {
        contatoRepository.save(contato);
        return "redirect:/contatos";
    }

    @PostMapping("/delete/{id}")
    public String deletar(@PathVariable Long id) {
        contatoRepository.deleteById(id);
        return "redirect:/contatos";
    }
}
