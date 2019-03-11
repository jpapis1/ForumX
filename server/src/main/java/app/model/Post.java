package app.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPost;

    private String name;

    private String content;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="CET")
    private Date dateOfCreation;

    @NotNull
    @ManyToOne(targetEntity = Client.class)
    @JoinColumn(name = "idClient")
    @JsonIgnoreProperties("visitedPosts")
    private Client creator;

    @ManyToMany(mappedBy = "visitedPosts", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("visitedPosts")
    private List<Client> visitors;

    public Post() { }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Client getCreator() {
        return creator;
    }

    public void setCreator(Client creator) {
        this.creator = creator;
    }

    public List<Client> getVisitors() {
        return visitors;
    }

    public void setVisitors(List<Client> visitors) {
        this.visitors = visitors;
    }
}
