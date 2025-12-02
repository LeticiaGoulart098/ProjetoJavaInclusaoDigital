package com.example.inclusao;

import com.example.inclusao.model.Contato;
import com.example.inclusao.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contato")
public class ContatoController {

    @Autowired
    private ContatoRepository contatoRepository;

    // Exibe o formulário (index.html tem o form)
    @GetMapping
    public String contatoForm(Model model) {
        // Garante que o objeto "contato" sempre exista no Model
        if (!model.containsAttribute("contato")) {
            model.addAttribute("contato", new Contato());
        }
        return "index"; // index.html
    }

    // Processa o envio do formulário
    @PostMapping
    public String salvarContato(@Valid @ModelAttribute("contato") Contato contato,
                                BindingResult result,
                                Model model) {

        if (result.hasErrors()) {
            // Volta para o index com os erros de validação
            model.addAttribute("contato", contato);
            return "index";
        }

        contatoRepository.save(contato);
        System.out.println("✅ Novo contato salvo: " + contato.getNome() + " - " + contato.getEmail());

        // Redireciona para /contato?enviado (mantém o controller organizado)
        return "redirect:/contato?enviado";
    }
}
