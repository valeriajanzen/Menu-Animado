package com.starwars.rebels_api.modelo;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@NamedQuery(name = "Localizacao.update", query = "UPDATE Localizacao l SET l.latitude=?1, l.longitude=?2, l.galaxia=?3 WHERE l.id=(SELECT r.localizacao.id FROM Rebelde r WHERE r.id=?4)")
public class Localizacao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(name = "LOC_LATITUDE", nullable = false)
    private String latitude;

    @NotEmpty
    @Column(name = "LOC_LONGITUDE", nullable = false)
    private String longitude;

    // Apenas o nome da galaxia
    @NotEmpty
    @Column(name = "LOC_GALAXIA", nullable = false)

    private String galaxia;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getGalaxia() {
        return galaxia;
    }
    public void setGalaxia(String galaxia) {
        this.galaxia = galaxia;
    }
}
