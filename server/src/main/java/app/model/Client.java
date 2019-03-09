package app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idClient;

    private String firstName;

    private String lastName;

    private String email;

    @Column(unique = true)
    private String username;

    private String password;

    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "idStatus")
    @NotNull
    private Status status;

    @JsonIgnore
    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(name="Hobbies", joinColumns=@JoinColumn(name="idClient"), inverseJoinColumns=@JoinColumn(name="idHobby"))
    private Set<Hobby> hobbySet;

    @JsonIgnore
    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(name="Visit", joinColumns=@JoinColumn(name="idClient"), inverseJoinColumns=@JoinColumn(name="idPost"))
    private Set<Post> visitedPosts;

    public Client() { }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Set<Hobby> getHobbySet() {
        return hobbySet;
    }

    public void setHobbySet(Set<Hobby> hobbyList) {
        this.hobbySet = hobbyList;
    }

    public Set<Post> getVisitedPosts() {
        return visitedPosts;
    }

    public void setVisitedPosts(Set<Post> visitedPosts) {
        this.visitedPosts = visitedPosts;
    }

}
