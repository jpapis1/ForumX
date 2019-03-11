package app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.lang.NonNull;

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

    @NotNull
    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "idStatus")
    private Status status;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name="Hobbies", joinColumns=@JoinColumn(name="idClient"), inverseJoinColumns=@JoinColumn(name="idHobby"))
    @JsonIgnoreProperties("clients")
    private Set<Hobby> hobbies;


    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name="Visit", joinColumns=@JoinColumn(name="idClient"), inverseJoinColumns=@JoinColumn(name="idPost"))
    @JsonIgnoreProperties("visitors")
    private List<Post> visitedPosts;

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("visitors")
    private Set<Post> favoritePosts;

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

    public Set<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public Set<Post> getFavoritePosts() {
        return favoritePosts;
    }

    public void setFavoritePosts(Set<Post> favoritePosts) {
        this.favoritePosts = favoritePosts;
    }

    public List<Post> getVisitedPosts() {
        return visitedPosts;
    }

    public void setVisitedPosts(List<Post> visitedPosts) {
        this.visitedPosts = visitedPosts;
    }
}
