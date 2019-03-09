package app.rest;

import app.model.Status;
import app.service.StatusManager;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StatusRestController {
    @Autowired
    StatusManager statusManager;

    @RequestMapping(path = "/status",method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<String> addStatus(@RequestBody Status status) {
        statusManager.addStatus(status);
        return new ResponseEntity<>("Status has been added to database.", HttpStatus.CREATED);
    }
    @RequestMapping(path = "/status",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Status> getStatus(@RequestParam String id) {
        return new ResponseEntity<>(statusManager.getStatus(Integer.parseInt(id)), HttpStatus.CREATED);
    }
}
