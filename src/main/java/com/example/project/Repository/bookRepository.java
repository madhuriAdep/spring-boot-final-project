package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Addbooks;

public interface bookRepository extends JpaRepository<Addbooks,Integer> {
    
}
