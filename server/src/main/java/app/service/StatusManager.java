package app.service;

import app.model.Status;
import app.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Singleton;

@Service
public class StatusManager {
    @Autowired
    StatusRepository statusRepository;

    public void addStatus(Status status) {
        statusRepository.save(status);
    }
    public Status getStatus(int id) {
        return statusRepository.findById(id).get();
    }
    public void removeStatus(Status status) {statusRepository.delete(status);}
}
