package app.service;

import app.model.Client;
import app.model.Hobby;
import app.repository.ClientRepository;
import app.repository.HobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientHobbyManager {
    @Autowired
    ClientManager clientManager;

    @Autowired
    HobbyManager hobbyManager;

    public void addHobbyToClient(int idClient,int idHobby) {

        Hobby hobby = hobbyManager.getHobby(idHobby);
        Client client = clientManager.getClient(idClient);

        hobby.getClients().add(client);
        client.getHobbies().add(hobby);
        clientManager.updateClient(client);
    }
}
