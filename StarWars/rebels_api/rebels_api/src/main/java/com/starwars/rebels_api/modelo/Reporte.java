package com.starwars.rebels_api.modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Reporte implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "REP_ACUSADO", nullable = false)
    private Long idAcusado;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getIdAcusado() {
        return idAcusado;
    }
    public void setIdAcusado(Long idAcusado) {
        this.idAcusado = idAcusado;
    }
}
