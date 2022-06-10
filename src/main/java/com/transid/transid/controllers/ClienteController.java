package com.transid.transid.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transid.transid.model.Cliente;
import com.transid.transid.repository.ClienteRepository;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;
    
    @GetMapping("/ola")
    public String hello(){
    return "olá";
    }

    @PostMapping
    public Cliente adicionar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @GetMapping
    public List<Cliente> listarTudo(){
        return clienteRepository.findAll();
    }


}
