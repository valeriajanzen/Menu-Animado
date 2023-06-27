package com.starwars.rebels_api.service;

import com.starwars.rebels_api.modelo.Localizacao;
import com.starwars.rebels_api.repository.LocalizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalizacaoServiceImpl implements LocalizacaoService {

    /*
     * Injetando as dependências necessárias
     */

    @Autowired
    private LocalizacaoRepository locRepositorio;

    @Override
    public void update(Localizacao localizacao , Long id) {
        locRepositorio.update(localizacao.getLatitude(), localizacao.getLongitude(), localizacao.getGalaxia(), id);
    }

}

