package com.starwars.rebels_api.modelo;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "TB_ITEM")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(name = "ITE_NOME", nullable = false)
    private String nome;

    @Column(name = "ITE_QUANTIDADE")
    @ColumnDefault("0")
    private int qtd;

    // Os pontos serão calculados pelo service
    @Column(name = "ITE_PONTOS", nullable = true)
    private int pontos;

    /*
     * Se o item não for válido o mesmo
     * será cadastrado como "Lixo"
     */
    public void adicionarPontos() {

        if (this.nome.equalsIgnoreCase("Arma")) {
            this.pontos = 4;
        } else if (this.nome.equalsIgnoreCase("Munição")) {
            this.pontos = 3;
        } else if (this.nome.equalsIgnoreCase("Água")) {
            this.pontos = 2;
        } else if (this.nome.equalsIgnoreCase("Comida")) {
            this.pontos = 1;
        }
    }
    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
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
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}