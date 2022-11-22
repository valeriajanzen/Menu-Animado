package com.starwars.rebels_api.controller;


import com.starwars.rebels_api.modelo.Relatorio;
import com.starwars.rebels_api.service.RelatorioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/relatorio")
public class RelatorioController {

    @Autowired(required = true)

    private RelatorioServiceImpl relService;

    /*
     * Exibindo relatório no endpoint
     */
    @GetMapping
    public Relatorio showRelatorio() {
        return relService.getRelatorio();
    }
}
