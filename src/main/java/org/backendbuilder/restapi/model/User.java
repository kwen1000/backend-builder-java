package org.backendbuilder.restapi.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String username;
    private String password;
    private Timestamp created_at;
    private Timestamp updated_at;

    public User() {
      this.created_at = new Timestamp(System.currentTimeMillis());
      this.updated_at = new Timestamp(System.currentTimeMillis());
    }

    public long getId() {
        return id;
    }

    public void setId(long input) {
        this.id = input;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String input) {
        this.email = input;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String input) {
        this.username = input;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String input) {
        this.password = input;
    }

    public Timestamp getUpdatedAt() {
        return updated_at;
    }

    public void setUpdatedAt(Timestamp input) {
        this.updated_at = input;
    }

}
