package com.ProjetoAPISpring.Projeto.Repository;

import com.ProjetoAPISpring.Projeto.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, Integer> {



}
