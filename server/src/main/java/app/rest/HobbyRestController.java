package app.rest;

import app.model.Hobby;
import app.repository.HobbyRepository;
import app.service.ClientHobbyManager;
import app.service.HobbyManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HobbyRestController {

    @Autowired
    HobbyManager hobbyManager;

    @Autowired
    ClientHobbyManager clientHobbyManager;
    @RequestMapping(path = "/hobby",method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<Integer> addHobby(@RequestBody Hobby hobby) {
        hobbyManager.addHobby(hobby);
        return new ResponseEntity<>(hobby.getIdHobby(), HttpStatus.CREATED);
    }


    @RequestMapping(path = "/hobby/{id}",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Hobby> getHobby(@PathVariable("id") int id) {
        return new ResponseEntity<>(hobbyManager.getHobby(id), HttpStatus.CREATED);
    }
    @RequestMapping(path = "/hobby",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Hobby>> getAllHobbies() {
        return new ResponseEntity<>(hobbyManager.getAllHobbies(), HttpStatus.CREATED);
    }

}
