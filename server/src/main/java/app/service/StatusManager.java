package app.service;

import app.model.Status;
import app.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Singleton;
import java.util.List;

@Service
@Transactional
public class StatusManager {
    @Autowired
    StatusRepository statusRepository;

    public Status addStatus(Status status) {
        return statusRepository.save(status);
    }
    public Status getStatus(int id) {
        return statusRepository.findById(id).get();
    }
    public List<Status> getAllStatuses() {
        return statusRepository.findAll();
    }
    public void removeStatus(Status status) {statusRepository.delete(status);}
}
