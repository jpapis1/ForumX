package app.service;

import app.model.Client;
import app.model.Hobby;
import app.repository.ClientRepository;
import app.repository.HobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HobbyManager {
    @Autowired
    HobbyRepository hobbyRepository;

    public Hobby addHobby(Hobby hobby) {
         return hobbyRepository.save(hobby);
    }

    public Hobby getHobby(int id) {
        return hobbyRepository.findById(id).get();
    }
    public void updateHobby(Hobby hobby) {
        hobbyRepository.save(hobby);
    }

    public List<Hobby> getAllHobbies() {
        return hobbyRepository.findAll();
    }
    public void removeHobby(Hobby hobby) {hobbyRepository.delete(hobby);}
}
