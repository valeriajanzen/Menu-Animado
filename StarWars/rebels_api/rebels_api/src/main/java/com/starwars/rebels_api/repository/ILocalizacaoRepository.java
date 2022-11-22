package com.starwars.rebels_api.repository;

import com.starwars.rebels_api.modelo.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;

public interface ILocalizacaoRepository extends JpaRepository<Localizacao, Long> {

    /*
     * Reportar nova Localização do Rebelde
     */
    @Transactional
    @Modifying
    void update(String lat, String lon, String gal, Long id);
}