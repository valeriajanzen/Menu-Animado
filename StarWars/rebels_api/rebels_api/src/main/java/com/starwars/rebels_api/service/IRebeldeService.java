package com.starwars.rebels_api.service;

import com.starwars.rebels_api.modelo.Item;
import com.starwars.rebels_api.modelo.Rebelde;
import com.starwars.rebels_api.modelo.Trade;

import java.util.List;

public interface IRebeldeService {

    /*
     * Save Rebelde
     */
    void save(Rebelde rebelde);

    /*
     * Buscar Rebelde por id
     */
    Rebelde findById(long id);

    /*
     * Realizar trade
     */
    void realizarTrade(Trade ofertante, Trade receptor);

    /*
     * Verificar se os itens estão aptos para o trade
     */
    List<Item> validarItens(List<Item> ofertante, List<Item> oferta);

    /*
     * Validar pontuação no trade
     */
    boolean validarPontos(List<Item> ofertante, List<Item> receptor);

    /*
     * Adicionando itens
     */
    List<Item> adicionarItens(List<Item> ofertante, List<Item> oferta);

    /*
     * Remover itens
     */
    List<Item> removerItens(List<Item> ofertante, List<Item> oferta);

    /*
     * Retorna uma lista com todos os rebeldes cadastrados
     */
    List<Rebelde> findAll();
}
