package com.ProjetoAPISpring.Projeto.Repository;

import com.ProjetoAPISpring.Projeto.Model.Cliente;
import com.ProjetoAPISpring.Projeto.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository <Produto, Integer> {

    @Query(value = "select a from Produto a where a.descricao like %?1%")
    List<Produto> findByNome(String descricao);

    @Query(value = "select a from Produto a where a.preco <?1")
    List<Produto> findByPrecoMenor(int ra);

    List<Produto> findByMarca(String marca);


    @Query(value = "select * from produto a where a.marca like %?1% and a.preco = ?2", nativeQuery = true)
    List<Produto> findByMarcaPreco(String marca, float preco);

}

