package com.starwars.rebels_api.modelo;
/*
 * Classe especifica para negociações entre rebeldes
 */

import javax.persistence.Entity;
import java.util.List;


public class Trade {
    private Long idRebelde;
    private List<Item> itens;

    public Long getIdRebelde() {
        return idRebelde;
    }
    public void setIdRebelde(Long idRebelde) {
        this.idRebelde = idRebelde;
    }
    public List<Item> getItens() {
        return itens;
    }
    public void setItem(List<Item> itens) {
        this.itens = itens;
    }
}