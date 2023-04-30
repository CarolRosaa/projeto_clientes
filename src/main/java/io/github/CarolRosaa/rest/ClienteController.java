package io.github.CarolRosaa.rest;

import io.github.CarolRosaa.ClientesApplication;
import io.github.CarolRosaa.entity.Cliente;
import io.github.CarolRosaa.repositry.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("/api/clientes")
public class ClienteController {

    private final ClienteRepository repository;

    @Autowired
    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar( Cliente cliente ){
        return repository.save(cliente);


    }



}
