package dev.ranieri.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "actor")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id")
    private int id;

    @Column(name = "first_name")
    private String fname;

    @Column(name = "last_name")
    private String lname;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "actor_movie",
    joinColumns = { @JoinColumn(name = "a_id")}, // first join column is the foreign key
            // that points back to actor ( the entity you are actually in)
            inverseJoinColumns = { @JoinColumn(name = "m_id")})
            // the inverse join column is the foreign key that points
            // to movies (the entity you are trying to connect with)
    private Set<Movie> movies = new HashSet<Movie>();

    public Actor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", movies=" + movies +
                '}';
    }
}
