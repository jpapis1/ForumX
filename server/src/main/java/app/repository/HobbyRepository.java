package app.repository;

import app.model.Hobby;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HobbyRepository extends CrudRepository<Hobby, Integer> {
    List<Hobby> findAll();
}
