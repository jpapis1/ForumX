package app.rest;

import app.model.Client;
import app.service.ClientManager;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientRestController {
    @Autowired
    ClientManager clientManager;

    @RequestMapping(path = "/client",method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<String> addClient(@RequestBody Client client) {
        clientManager.addClient(client);
        return new ResponseEntity<>("Client has been added to database.", HttpStatus.CREATED);
    }
}
