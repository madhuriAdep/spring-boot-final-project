package com.example.project.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="books")
public class Addbooks {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    private int bid;
    private String bname;
    private String aname;
    private String edition;


    public int getBid() {
        return bid;
    }
    public String getBname() {
        return bname;
    }
    public String getAname() {
        return aname;
    }
    public String getEdition() {
        return edition;
    }
    
    public void setBid(int bid) {
        this.bid = bid;
    }
    public void setBname(String bname) {
        this.bname = bname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public void setEdition(String edition) {
        this.edition = edition;
    }


    @Override
    public String toString() {
        return "Addbooks [bid=" + bid + ", bname=" + bname + ", aname=" + aname + ", edition=" + edition + "]";
    }
}
