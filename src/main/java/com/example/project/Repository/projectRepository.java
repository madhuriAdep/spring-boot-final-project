package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.User;


public interface projectRepository extends JpaRepository<User,Integer> {

    
    
}


