package app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Hobby {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idHobby;

    @Column(unique=true)
    private String name;

    @ManyToMany(mappedBy = "hobbies", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("hobbies")
    private Set<Client> clients;

    public Hobby() { }

    public int getIdHobby() {
        return idHobby;
    }

    public void setIdHobby(int idHobby) {
        this.idHobby = idHobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }
}
