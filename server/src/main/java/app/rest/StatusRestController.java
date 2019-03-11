package app.rest;

import app.model.Status;
import app.service.StatusManager;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StatusRestController {
    @Autowired
    StatusManager statusManager;

    @RequestMapping(path = "/status",method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<Integer> addStatus(@RequestBody Status status) {
        statusManager.addStatus(status);
        return new ResponseEntity<>(status.getIdStatus(), HttpStatus.CREATED);
    }
    @RequestMapping(path = "/status/{id}",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Status> getStatus(@PathVariable("id") int id) {
        return new ResponseEntity<>(statusManager.getStatus(id), HttpStatus.CREATED);
    }
    @RequestMapping(path = "/status",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Status>> getAllStatuses() {
        return new ResponseEntity<>(statusManager.getAllStatuses(), HttpStatus.CREATED);
    }
}
