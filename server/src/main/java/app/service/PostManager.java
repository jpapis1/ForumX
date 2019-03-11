package app.service;

import app.model.Post;
import app.repository.PostRepository;
import app.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PostManager {
    @Autowired
    PostRepository postRepository;

    public Post addPost(Post status) {
        return postRepository.save(status);
    }
    public Post getPost(int id) {
        return postRepository.findById(id).get();
    }
    public void updatePost(Post client) {
        postRepository.save(client);
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
    public void removePost(Post status) {postRepository.delete(status);}
}