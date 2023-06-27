//package com.starwars.rebels_api.controller;
//
//import com.starwars.rebels_api.modelo.Reporte;
//import com.starwars.rebels_api.service.ReporteServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.validation.Valid;
//
//@RestController
//@RequestMapping(value = "/reporte")
//public class ReporteController {
//
//    /*
//     * Injetando dependências necessárias
//     */
//    @Autowired
//    private ReporteServiceImpl reporteServiceImpl;
//
//    /*
//     * Reportando rebelde por traição
//     */
//    @PostMapping
//    public void save(@Valid @RequestBody Reporte reporte) {
//        reporteServiceImpl.save(reporte);
//    }
//}
