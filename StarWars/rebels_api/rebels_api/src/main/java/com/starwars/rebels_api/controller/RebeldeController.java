package com.starwars.rebels_api.controller;

import com.starwars.rebels_api.modelo.Rebelde;
import com.starwars.rebels_api.modelo.Trade;
import com.starwars.rebels_api.service.RebeldeServiceImpl;
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
    private RebeldeServiceImpl rebService;

    /*
     * Cadastrar novo Rebelde
     */
    @PostMapping
    @ResponseBody
    public Rebelde save(@Valid @RequestBody Rebelde rebelde) {
        rebService.save(rebelde);
        return rebelde;
    }
    @GetMapping("/id/{id}")
    @ResponseBody
    public Rebelde getById(@PathVariable("id") long id) {
        Rebelde rebelde = rebService.findById(id);
        return rebelde;
    }

    @GetMapping("/nome/{nome}")
    @ResponseBody
    public List<Rebelde> getByNome(@PathVariable("nome") String nome) {
        List<Rebelde> rebeldes = rebService.findByNome(nome);
        return rebeldes;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Rebelde> getAll() {
        List<Rebelde> listaRebeldes = rebService.findAll();
        return listaRebeldes;
    }

    @PutMapping("/atualizar/{id}")
    @ResponseBody
    public Rebelde update(@PathVariable Long ("id"), @Valid @RequestBody Rebelde rebelde) {
        rebService.save(rebelde);
        return rebelde;
    }


    /*
     * Realizando trade entre rebeldes
     */
    @PostMapping("/trade")
    @ResponseBody
    public void realizarTrade(@RequestBody Trade[] trade) {
        rebService.realizarTrade(trade[0], trade[1]);
    }



}