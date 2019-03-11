package app.service;

import app.model.Client;
import app.model.Status;
import app.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Singleton;
import java.util.List;

@Service
@Transactional
public class ClientManager {
    @Autowired
    ClientRepository clientRepository;

    public Client addClient(Client status) {
        return clientRepository.save(status);
    }
    public Client getClient(int id) {
        return clientRepository.findById(id).get();
    }
    public void updateClient(Client client) {
        clientRepository.save(client);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
    public void removeClient(Client status) {clientRepository.delete(status);}
}
