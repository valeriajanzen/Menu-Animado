package com.starwars.rebels_api.service;

import com.starwars.rebels_api.modelo.Reporte;
import com.starwars.rebels_api.repository.IRebeldeRepository;
import com.starwars.rebels_api.repository.IReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReporteServiceImpl implements IReporteService {

    /*
     * Injetando as dependências necessárias
     */

    @Autowired
    private IReporteRepository repRepositorio;

    @Autowired
    private IRebeldeRepository rebRepositorio;

    /*
     * Reportando um rebelde anonimamente
     */
    @Override
    public void save(Reporte reporte) {
        // Verifica se o rebelde já foi reportado 3 ou mais vezes
        if (qtdReporteRebelde(reporte.getIdAcusado()) >= 2) {
            confirmarTraicao(reporte.getIdAcusado());
            repRepositorio.save(reporte);
        } else {
            repRepositorio.save(reporte);
        }
    }

    /*
     * Confirmando traição de rebelde após ser reportado tres vezes
     */
    @Override
    public void confirmarTraicao(long idRebelde) {
        rebRepositorio.confirmarTraicao(idRebelde);
    }

    @Override
    public long qtdReporteRebelde(long idRebelde) {
        return repRepositorio.qtdReporteRebelde(idRebelde);
    }
}

