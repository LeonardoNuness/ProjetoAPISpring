package com.ProjetoAPISpring.Projeto.Controller;


import com.ProjetoAPISpring.Projeto.Model.Produto;
import com.ProjetoAPISpring.Projeto.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping ("/apiProduto")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoctrl;

    @GetMapping("/listarProdutos")
    public List<Produto> listarProdutos() {
        return produtoctrl.findAll();
    }
}

