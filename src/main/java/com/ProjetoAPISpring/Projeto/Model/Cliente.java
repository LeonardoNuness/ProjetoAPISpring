package com.ProjetoAPISpring.Projeto.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Cliente{
    @Id
    private int codigoCliente;

    @Column
    private String nome;

    @Column
    private String email;

    public Cliente(int codigoCliente, String nome, String email) {
        this.codigoCliente = codigoCliente;
        this.nome = nome;
        this.codigoCliente = codigoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


