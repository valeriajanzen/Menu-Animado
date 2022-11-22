package com.starwars.rebels_api.service;

import com.starwars.rebels_api.modelo.Reporte;

public interface IReporteService {

    /*
     * Reportando Rebelde
     */
    void save(Reporte reporte);

    /*
     * Confirmando rebelde como traidor
     */
    void confirmarTraicao(long idRebelde);

    /*
     * Buscando quantidade de reportes de um rebelde
     */
    long qtdReporteRebelde(long idRebelde);

}

