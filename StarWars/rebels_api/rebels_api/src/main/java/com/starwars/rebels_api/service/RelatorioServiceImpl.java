package com.starwars.rebels_api.service;

import com.starwars.rebels_api.modelo.Relatorio;
import com.starwars.rebels_api.repository.IRebeldeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelatorioServiceImpl {

    /*
     * Injeção de dependencia
     */
    @Autowired
    private IRebeldeRepository rebRepository;

    /*
     * Retorna um relatório preenchido
     */
    public Relatorio getRelatorio() {
        Relatorio relatorio = new Relatorio();
        relatorio.setPorcentagemTraidores(calcularPorcentagemTraidores());
        relatorio.setPorcentagemRebeldes(calcularPorcentagemRebeldes());
        return relatorio;
    }

    // Calcula a porcentagem de traidores
    public double calcularPorcentagemTraidores() {
        double result = ((double) rebRepository.totalTraidores(true) / 100) * rebRepository.totalRebeldes();
        return result;
    }

    // Calcula a porcentagem de rebeldes
    public double calcularPorcentagemRebeldes() {
        double result = ((double) rebRepository.totalTraidores(false) / 100) * rebRepository.totalRebeldes();
        return result;
    }
}

