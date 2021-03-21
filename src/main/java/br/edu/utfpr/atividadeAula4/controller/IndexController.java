package br.edu.utfpr.atividadeAula4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(value = {"", "home", "principal"})
    private String index() {
        return "index";
    }
}
