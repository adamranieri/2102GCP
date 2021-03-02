package dev.ranieri.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="director")
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="director_id")
    private int id;

    @Column(name ="fname")
    private String fname;

    @Column(name ="lname")
    private String lname;

    // @OneToMany one director will have many movies
    // cascade allows us to persist changes to movie through the director object
    @OneToMany(mappedBy = "directorId", fetch = FetchType.LAZY, cascade = CascadeType.ALL) // mapped by the name of the field IN JAVA that has the joincolumn annotation
    private Set<Movie> movies = new HashSet<Movie>(); // this is not a column

    public Director() {
    }

    public Director(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
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
        return "Director{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
