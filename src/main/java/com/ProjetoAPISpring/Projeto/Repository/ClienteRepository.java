package com.ProjetoAPISpring.Projeto.Repository;

import com.ProjetoAPISpring.Projeto.Model.Cliente;
import com.ProjetoAPISpring.Projeto.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository <Cliente, Integer> {

    @Query (value = "select a from Cliente a where a.nome like %?1%")
    List<Cliente> findByNome(String nome);

    List<Cliente> findByEmail(String email);

    @Query(value = "select * from Cliente where nome like %?1% and email like%?2%", nativeQuery = true)
    List<Cliente> findByNomeEmail(String nome, String email);
}



