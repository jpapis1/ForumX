package app.service;

import app.model.Client;
import app.model.Hobby;
import app.model.Post;
import app.repository.ClientRepository;
import app.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VisitManager {
    @Autowired
    ClientManager clientManager;

    @Autowired
    PostManager postManager;

    public void addVisitToClient(int idClient,int idPost) {

        Post post = postManager.getPost(idPost);
        Client client = clientManager.getClient(idClient);

        post.getVisitors().add(client);
        client.getVisitedPosts().add(post);
        clientManager.updateClient(client);
    }
}
