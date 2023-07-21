package com.example.project.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="login")
public class User {
    
    //mockito test
    // public User(int id,String username, String password) {
    //     this.id = id;
    //     this.username = username;
    //     this.password = password;
    // }


    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    

    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + "]";
    }
   

}
