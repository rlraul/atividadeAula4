package br.edu.utfpr.atividadeAula4.controller;

import br.edu.utfpr.atividadeAula4.model.Autor;
import br.edu.utfpr.atividadeAula4.model.Cidade;
import br.edu.utfpr.atividadeAula4.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("cidade")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("cidades", cidadeService.findAll());
        return "cidade/list";
    }

    @GetMapping(value = {"new", "novo", "adicionar", "form"})
    public String form(Model model) {
        model.addAttribute("cidade", new Cidade());
        return "cidade/form";
    }

    @PostMapping
    public String save(@Valid Cidade cidade,
                       BindingResult result,
                       Model model,
                       RedirectAttributes attributes) {
        if (result.hasErrors()) {
            model.addAttribute("cidade", cidade);
            return "cidade/form";
        }
        cidadeService.save(cidade);
        attributes.addFlashAttribute("sucesso", "Cidade salva com sucesso!");
        return "redirect:/cidade";
    }

    @GetMapping("{id}")
    public String form(@PathVariable Long id, Model model) {
        model.addAttribute("cidade", cidadeService.findOne(id));
        return "cidade/form";
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable Long id, RedirectAttributes attributes) {
        try {
            cidadeService.delete(id);
            attributes.addFlashAttribute("sucesso", "Cidade removida com sucesso!");
        } catch (Exception e) {
            attributes.addFlashAttribute("erro", "Falha ao remover cidade!");
        }
        return "redirect:/cidade";
    }
}
