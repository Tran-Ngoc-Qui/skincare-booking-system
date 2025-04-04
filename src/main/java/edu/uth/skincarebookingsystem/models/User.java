package edu.uth.skincarebookingsystem.models;
import jakarta.persistence.*;
@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //-2^63

    private String username;
    private String password;
    // Getter Setter

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }
    public User() {}
}

