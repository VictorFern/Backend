package com.nlxa.java.jpa;

import com.nlxa.java.domain.Client;
import com.nlxa.java.impl.ClientImpl;
import com.nlxa.java.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class ClientJPAComponent implements ClientImpl {
    private ClientRepository clientRepository;
    @Autowired
    public ClientJPAComponent(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAll() {
        return null;
    }

    @Override
    public Client getById(String s) {
        return null;
    }

    @Override
    public Client save(Client type) {
        return null;
    }

    @Override
    public Client update(Client type) {
        return null;
    }

    @Override
    public void delete(Client type) {

    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public Boolean verifyValueId(String id) {
        return null;
    }
}
