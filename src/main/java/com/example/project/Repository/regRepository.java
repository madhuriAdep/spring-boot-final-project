package com.example.project.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project.model.Registration;


public interface regRepository extends JpaRepository<Registration,Integer>{
    
}
