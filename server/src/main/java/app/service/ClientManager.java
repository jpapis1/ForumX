package app.service;

import app.model.Client;
import app.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Singleton;

@Service
public class ClientManager {
    @Autowired
    ClientRepository clientRepository;

    public void addClient(Client status) {
        clientRepository.save(status);
    }

    public void removeClient(Client status) {clientRepository.delete(status);}
}
