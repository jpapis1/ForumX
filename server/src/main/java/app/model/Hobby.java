package app.model;

import javax.persistence.*;

@Entity
public class Hobby {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idHobby;

    @Column(unique=true)
    private String name;

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
}
