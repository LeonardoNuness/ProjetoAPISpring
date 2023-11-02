package com.ProjetoAPISpring.Projeto.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

    @Entity
    @Table
    public class Produto {

        @Id
        private int codigoProduto;

        @Column
        private String descricao;

        @Column
        private String marca;

        @Column
        private float preco;




        public int getCodigoProduto() {
            return codigoProduto;
        }

        public void setCodigoProduto(int codigoProduto) {
            this.codigoProduto = codigoProduto;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public float getPreco() {
            return preco;
        }

        public void setPreco(float preco) {
            this.preco = preco;
        }
    }



