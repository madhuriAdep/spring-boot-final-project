package com.example.project.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="feedback")
public class Feedback {
    

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    private String requriment;
    private String opinion;
    private String comment;

    public String getRequriment() {
        return requriment;
    }
    public String getOpinion() {
        return opinion;
    }
    public String getComment() {
        return comment;
    }

    
    public void setRequriment(String requriment) {
        this.requriment = requriment;
    }
    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    
    @Override
    public String toString() {
        return "Feedback [requriment=" + requriment + ", opinion=" + opinion + ", comment=" + comment + "]";
    }

}
