//package com.starwars.rebels_api.service;
//
//import com.starwars.rebels_api.modelo.Reporte;
//import com.starwars.rebels_api.repository.RebeldeRepository;
//import com.starwars.rebels_api.repository.ReporteRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class ReporteServiceImpl implements ReporteService {
//
//    /*
//     * Injetando as dependências necessárias
//     */
//
//    @Autowired
//    private ReporteRepository reporteRepository;
//
//    @Autowired
//    private RebeldeRepository rebeldeRepository;
//
//    /*
//     * Reportando um rebelde anonimamente
//     */
//    @Override
//    public void save(Reporte reporte) {
//        // Verifica se o rebelde já foi reportado 3 ou mais vezes
//        if (qtdReporteRebelde(reporte.getIdAcusado()) >= 2) {
//            confirmarTraicao(reporte.getIdAcusado());
//            reporteRepository.save(reporte);
//        } else {
//            reporteRepository.save(reporte);
//        }
//    }
//
//    /*
//     * Confirmando traição de rebelde após ser reportado tres vezes
//     */
//    @Override
//    public void confirmarTraicao(long idAcusado) {
//        rebeldeRepository.confirmarTraicao(idAcusado);
//    }
//
//    @Override
//    public long qtdReporteRebelde(long idAcusado) {
//        return reporteRepository.qtdReporteRebelde(idAcusado);
//    }
//}
//
