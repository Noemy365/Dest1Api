package com.dest1.ordemparanormal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Rpg {

    @Id

    private String nome;
    private String classe;
    private String origem;
    private String nex;

    public Rpg(){}
    public Rpg(String nome, String classe, String origem, String nex) {
        this.nome = nome;
        this.classe = classe;
        this.origem = origem;
        this.nex = nex;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getNex() {
        return nex;
    }

    public void setNex(String nex) {
        this.nex = nex;
    }
}
