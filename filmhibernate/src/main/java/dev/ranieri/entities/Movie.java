package dev.ranieri.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name ="runtime")
    private int runtime;

    @Column(name = "d_id")
    @JoinColumn(name = "d_id") // more specific annotation for fields that are foreign keys
    private int directorId; // foreign key column. The field with the data that we can use to connect movies
    // to a director

    public Movie() {
    }

    public Movie(int id, String title, int runtime, int directorId) {
        this.id = id;
        this.title = title;
        this.runtime = runtime;
        this.directorId = directorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getDirectorId() {
        return directorId;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", runtime=" + runtime +
                ", directorId=" + directorId +
                '}';
    }
}
