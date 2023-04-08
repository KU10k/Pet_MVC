package com.pet.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.validation.Valid;


@Controller
public class MainController {
    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("pet", new Pet());
        return "index";
    }

    @GetMapping("/show/pet")
    public String showPet(@Valid @ModelAttribute("pet") Pet pet, BindingResult result) {
        System.out.println(result.hasErrors());
        if (result.hasErrors()) {
            return "index";
        } else
            return "pets";
    }
}