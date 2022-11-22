package com.starwars.rebels_api.controller;

import com.starwars.rebels_api.modelo.Localizacao;
import com.starwars.rebels_api.service.LocalizacaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/localizacao")
public class LocalizacaoController {

    /*
     * Injetando dependências necessárias
     */
    @Autowired
    private LocalizacaoServiceImpl locService;

    //Reportar nova Localização do Rebelde

    @PutMapping("/reportar/{id}")
    public void reportarLocalizacao(@Valid @RequestBody Localizacao localizacao, @PathVariable("id") Long id) {
        locService.update(localizacao, id);
    }

}