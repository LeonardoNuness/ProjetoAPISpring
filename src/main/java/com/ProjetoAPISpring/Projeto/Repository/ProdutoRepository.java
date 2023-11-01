package com.ProjetoAPISpring.Projeto.Repository;

import com.ProjetoAPISpring.Projeto.Model.Cliente;
import com.ProjetoAPISpring.Projeto.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository <Produto, Integer> {

    @Query(value = "select descricao from Produto a where a.descricao like %/1%")
    List<Produto> findByNome(String descricao);

    @Query(value = "select * from Produto where preco <?1", nativeQuery = true)
    List<Produto> findByRaMenor(int ra);

    List<Produto> findByMarca(String marca);

    @Query(value = "select * from Produto where marca like %?1% and preco <?2", nativeQuery = true)
    List<Produto> findByMarcaPreco(String marca, float preco);

}

