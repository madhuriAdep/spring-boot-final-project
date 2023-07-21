package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Feedback;


public interface feedRepository extends JpaRepository<Feedback,Integer> {
    
}
