package com.ProjetoAPISpring.Projeto.Controller;


import com.ProjetoAPISpring.Projeto.Model.Cliente;
import com.ProjetoAPISpring.Projeto.Model.Produto;
import com.ProjetoAPISpring.Projeto.Repository.ClienteRepository;
import org.aspectj.apache.bcel.generic.InstructionConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/apiCliente")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/listarClientes")
    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }

    @GetMapping("/buscarClienteCodigo/{codigoCliente}")
    public Optional<Cliente> buscaClientePorRa(@PathVariable(value="codigoCliente")int cod){
        return clienteRepository.findById(cod);
    }

    @PostMapping("/inserirCliente")
    public void cadastroCliente(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
    }

    @GetMapping("/buscarClientePorNome/{nome}")
    public List<Cliente> buscaClientePorNome(@PathVariable(value = "nome")String nome){
        return clienteRepository.findByNome(nome);
    }

    @GetMapping("/buscarClienteEmail/{email}")
    public List<Cliente> buscaClienteEmail(@PathVariable(value="email")String email){
        return clienteRepository.findByEmail(email);
    }

    @GetMapping("/buscarClienteNomeEmail/{nome}/{email}")
    public List<Cliente> buscaClienteNomeEmail(@PathVariable(value = "nome") String nome,
                                               @PathVariable(value = "email") String email){
        return clienteRepository.findByNomeEmail(nome, email);
    }

    @PutMapping("/atualizarCliente")
    public void atualizarCliente(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
    }

    @DeleteMapping("/excluirCliente")
    public void excluirCliente (@RequestBody Cliente cliente){
        clienteRepository.delete(cliente);
    }

    @DeleteMapping("/excluirClientePorCodigo/{codigoCliente}")
    public void excluirClientePorCodigo(
            @PathVariable("codigoCliente") int cod) {
        clienteRepository.deleteById(cod);
    }

}
