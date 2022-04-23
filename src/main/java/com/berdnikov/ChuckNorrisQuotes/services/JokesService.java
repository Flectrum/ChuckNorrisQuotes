package com.berdnikov.ChuckNorrisQuotes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService extends ChuckNorrisQuotes{
    public String quote(){
        return getRandomQuote();
    }
}

