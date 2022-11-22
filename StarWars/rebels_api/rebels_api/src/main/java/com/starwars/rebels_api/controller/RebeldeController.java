package com.starwars.rebels_api.controller;

import com.starwars.rebels_api.modelo.Rebelde;
import com.starwars.rebels_api.modelo.Trade;
import com.starwars.rebels_api.service.IRebeldeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/rebelde", produces = "application/json")
public class RebeldeController {

    /*
     * Injetando dependências necessárias
     */
    @Autowired
    private IRebeldeServiceImpl rebService;

    /*
     * Cadastrar novo Rebelde
     */
    @PostMapping
    public void save(@Valid @RequestBody Rebelde rebelde) {
        rebService.save(rebelde);
    }
    @GetMapping
    public Rebelde getById(@RequestParam("id") long id) {
        return rebService.findById(id);
    }

    /*
     * Realizando trade entre rebeldes
     */
    @PostMapping("/trade")
    public void realizarTrade(@RequestBody Trade[] trade) {
        rebService.realizarTrade(trade[0], trade[1]);
    }

    @GetMapping("/all")
    public List<Rebelde> getAll() {
        return rebService.findAll();
    }
}