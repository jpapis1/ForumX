package app.rest;
import app.model.Post;
import app.service.PostManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PostRestController {

    @Autowired
    PostManager postManager;

    @RequestMapping(path = "/post",method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<Integer> addHobby(@RequestBody Post post) {
        postManager.addPost(post);
        return new ResponseEntity<>(post.getIdPost(), HttpStatus.CREATED);
    }


    @RequestMapping(path = "/post/{id}",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Post> getPost(@PathVariable("id") int id) {
        return new ResponseEntity<>(postManager.getPost(id), HttpStatus.CREATED);
    }
    @RequestMapping(path = "/post",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Post>> getAllHPosts() {
        return new ResponseEntity<>(postManager.getAllPosts(), HttpStatus.CREATED);
    }

}
