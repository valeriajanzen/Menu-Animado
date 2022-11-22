package com.starwars.rebels_api.service;

import com.starwars.rebels_api.modelo.Localizacao;
import com.starwars.rebels_api.repository.ILocalizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalizacaoServiceImpl implements ILocalizacaoService {

    /*
     * Injetando as dependências necessárias
     */

    @Autowired
    private ILocalizacaoRepository locRepositorio;

    @Override
    public void update(Localizacao localizacao , Long id) {
        locRepositorio.update(localizacao.getLatitude(), localizacao.getLongitude(), localizacao.getGalaxia(), id);
    }

}

