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

    @GetMapping("/buscaClienteRa/{codigoCliente}")
    public Optional<Cliente> buscaClientePorRa(@PathVariable(value="codigoCliente")int cod){
        return clienteRepository.findById(cod);
    }

    @PostMapping("/inserirCliente")
    public void cadastroCliente(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
    }

    @GetMapping("/buscaClientePorNome/{nome}")
    public List<Cliente> buscaClientePorNome(@PathVariable(value = "nome")String nome){
        return clienteRepository.findByNome(nome);
    }

    @GetMapping("/buscaClienteEmail/{email}")
    public List<Cliente> buscaClienteEmail(@PathVariable(value="codigoCliente")String email){
        return clienteRepository.findByEmail(email);
    }

    @GetMapping("/buscaClienteNomeEmail/{nome}{email}")
    public List<Cliente> buscaClienteNomeEmail(@PathVariable(value = "nome") String nome,
                                               @PathVariable(value = "email") String email){
        return clienteRepository.findByNomeEmail(nome, email);
    }

    @PutMapping("/atualizarCliente")
    public void atualizarCliente(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
    }
}
