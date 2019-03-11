package app.rest;

import app.model.Client;
import app.model.Client;
import app.service.ClientHobbyManager;
import app.service.ClientManager;
import app.service.VisitManager;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClientRestController {
    @Autowired
    ClientManager clientManager;

    @Autowired
    ClientHobbyManager clientHobbyManager;

    @Autowired
    VisitManager visitManager;

    @RequestMapping(path = "/client",method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<Integer> addClient(@RequestBody Client client) {
        clientManager.addClient(client);
        return new ResponseEntity<>(client.getIdClient(), HttpStatus.CREATED);
    }

    @RequestMapping(path = "/client/{id}",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Client> getClient(@PathVariable("id") int id) {
        return new ResponseEntity<>(clientManager.getClient(id), HttpStatus.CREATED);
    }
    @RequestMapping(path = "/client",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Client>> getAllClients() {
        return new ResponseEntity<>(clientManager.getAllClients(), HttpStatus.CREATED);
    }

    @RequestMapping(path = "/client/{idClient}/hobby/{idHobby}",method = RequestMethod.POST)
    public ResponseEntity<String> addHobbyToClient(@PathVariable("idClient") int idClient,@PathVariable("idHobby") int idHobby ) {
        clientHobbyManager.addHobbyToClient(idClient,idHobby);
        return new ResponseEntity<>("Hobby has been added to the client.", HttpStatus.CREATED);
    }
    @RequestMapping(path = "/client/{idClient}/post/{idPost}",method = RequestMethod.POST)
    public ResponseEntity<String> addVisitToClient(@PathVariable("idClient") int idClient,@PathVariable("idPost") int idPost ) {
        visitManager.addVisitToClient(idClient,idPost);
        return new ResponseEntity<>("Visit has been added to the client.", HttpStatus.CREATED);
    }
}
