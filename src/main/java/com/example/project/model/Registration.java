package com.example.project.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="registration")
public class Registration {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    private int studentregid;
    private String fn;
    private String ln;
    private String urname;
    private String pass;
    private String email;

    public void setStudentregid(int studentregid) {
        this.studentregid = studentregid;
    }
    public void setFn(String fn) {
        this.fn = fn;
    }
    public void setLn(String ln) {
        this.ln = ln;
    }
    public void setUrname(String urname) {
        this.urname = urname;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getStudentregid() {
        return studentregid;
    }
    public String getFn() {
        return fn;
    }
    public String getLn() {
        return ln;
    }
    public String getUrname() {
        return urname;
    }
    public String getPass() {
        return pass;
    }
    public String getEmail() {
        return email;
    }



    @Override
    public String toString() {
        return "Registration [studentregid=" + studentregid + ", fn=" + fn + ", ln=" + ln + ", urname=" + urname + ", pass=" + pass + ", email=" + email + "]";
    }
    
}
