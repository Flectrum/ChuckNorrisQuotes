package com.berdnikov.ChuckNorrisQuotes.controllers;

import com.berdnikov.ChuckNorrisQuotes.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke", jokesService.quote());
        return "index";
    }
}
