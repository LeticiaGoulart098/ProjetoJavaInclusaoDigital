package com.example.inclusao;

import com.example.inclusao.model.Contato;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    // Página inicial (index)
    @GetMapping({"/", "/index", "/home"})
    public String index(Model model) {
        // Garante que o formulário de contato sempre tenha um objeto no modelo
        if (!model.containsAttribute("contato")) {
            model.addAttribute("contato", new Contato());
        }
        return "index";
    }

    // Página de Banco de Dados
    @GetMapping("/dados")
    public String dados() {
        return "dados";
    }

    // Página de Introdução à Programação
    @GetMapping("/programacao")
    public String programacao() {
        return "programacao";
    }

    // Página de Redes de Computadores
    @GetMapping("/rede")
    public String rede() {
        return "rede";
    }

    // Página de Desenvolvimento Web
    @GetMapping("/web")
    public String web() {
        return "web";
    }
}
