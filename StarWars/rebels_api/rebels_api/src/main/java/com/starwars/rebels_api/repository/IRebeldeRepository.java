package com.starwars.rebels_api.repository;

import com.starwars.rebels_api.modelo.Rebelde;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;
import java.util.List;

public interface IRebeldeRepository extends JpaRepository<Rebelde, Long> {

    /*
     * Método para buscar rebelde por id
     */
    Rebelde findById(long id);

    /*
     * Método para listar todos os rebeldes
     */
    List<Rebelde> findAll();

    /*
     * Confirmando rebelde como traidor
     */
    @Transactional
    @Modifying
    void confirmarTraicao(long idRebelde);


    /*
     * Métodos usados no relátorio da api
     */

    // Retorna o total de traidores
    @Transactional
    int totalTraidores(boolean situacao);

    // Retorna o total de rebeldes fieis
    @Transactional
    int totalRebeldes();
}