package com.starwars.rebels_api.modelo;



import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "TB_REBELDE")

/*
 * Utilizando named query para realizar comandos personalizados no banco de
 * dados
 */
@NamedQueries({
        @NamedQuery(name = "Rebelde.confirmarTraicao", query = "UPDATE Rebelde r SET r.traidor=true WHERE r.id=?1"),
        @NamedQuery(name = "Rebelde.totalTraidores", query = "SELECT COUNT(r.id) FROM Rebelde r WHERE r.traidor=?1"),
        @NamedQuery(name = "Rebelde.totalRebeldes", query = "SELECT COUNT(r.id) FROM Rebelde r") })

public class Rebelde implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(name = "REB_NOME", nullable = false)
    private String nome;

    @Column(name = "REB_IDADE", nullable = false)
    private int idade;

    @Column(name = "REB_GENERO", nullable = false)
    private char genero;

    @Column(name = "REB_TRAIDOR", nullable = false)
    private boolean traidor;

    public boolean isTraidor() {
        return traidor;
    }

    @OneToOne
    @Cascade(CascadeType.PERSIST)
    @JoinColumn(name = "REB_ID_LOCALIZACAO", nullable = false)
    private Localizacao localizacao;

    @OneToOne
    @Cascade(CascadeType.PERSIST)
    @JoinColumn(name = "REB_ID_INVENTARIO", nullable = false)
    private Inventario inventario;

    /**
     * @param traidor the traidor to set
     */
    public void setTraidor(boolean traidor) {
        this.traidor = traidor;
    }
    public Inventario getInventario() {
        return inventario;
    }
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public Localizacao getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
}