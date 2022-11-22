package com.starwars.rebels_api.repository;

import com.starwars.rebels_api.modelo.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReporteRepository extends JpaRepository<Reporte, Long> {

    /*
     * Buscando quantidade de reportes de um rebelde
     */
    long qtdReporteRebelde(long idRebelde);
}
