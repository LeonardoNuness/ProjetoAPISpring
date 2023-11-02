package com.ProjetoAPISpring.Projeto.Controller;


import com.ProjetoAPISpring.Projeto.Model.Cliente;
import com.ProjetoAPISpring.Projeto.Model.Produto;
import com.ProjetoAPISpring.Projeto.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/apiProduto")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/listarProdutos")
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/buscaProdutoPorRa/{codigoProduto}")
    public Optional<Produto> buscaProdutoPorRa(@PathVariable(value="codigoProduto")int cod){
        return produtoRepository.findById(cod);
    }

    @PostMapping("/inserirProduto")
    public void cadastroProduto(@RequestBody Produto produto){
        produtoRepository.save(produto);
    }

    @GetMapping("/buscarProdutoPorDescricao/{descricao}")
    public List<Produto> buscaProdutoPordescricao(@PathVariable(value = "descricao")String descricao){
        return produtoRepository.findByNome(descricao);
    }

    @GetMapping("/buscarProdutoPrecoMenor/{preco}")
    public List<Produto> buscaProdutoPrecoMenor(@PathVariable(value = "preco")int preco){
        return produtoRepository.findByPrecoMenor(preco);
    }

    @GetMapping("/buscaProdutoPorMarca/{marca}")
    public List<Produto> buscaProdutoPorMarca(@PathVariable(value = "marca") String marca){
    return produtoRepository.findByMarca(marca);
}

    @GetMapping("/buscarProdutoPorMarcaPreco/{marca}/{preco}")
    public List<Produto> findByMarcaPreco(@PathVariable(value = "marca") String marca,
                                          @PathVariable(value = "preco") float preco){
        return produtoRepository.findByMarcaPreco(marca, preco);
    }

    @PutMapping("/atualizarProduto")
    public void atualizarProduto(@RequestBody Produto produto){
        produtoRepository.save(produto);
    }

    @DeleteMapping("/removerProduto")
    public void removerProduto(@RequestBody Produto produto){
        produtoRepository.delete(produto);
    }


}

