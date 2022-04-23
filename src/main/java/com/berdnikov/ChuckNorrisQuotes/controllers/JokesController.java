package com.berdnikov.ChuckNorrisQuotes.controllers;

import com.berdnikov.ChuckNorrisQuotes.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    JokeServiceImpl jokeService;

    public JokesController(JokeServiceImpl jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
