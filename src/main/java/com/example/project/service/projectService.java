
package com.example.project.service;

import java.util.List;
// import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import com.example.project.model.Addbooks;
import com.example.project.model.Feedback;
import com.example.project.model.Registration;
import com.example.project.model.User;
import com.example.project.Repository.bookRepository;
import com.example.project.Repository.feedRepository;
import com.example.project.Repository.projectRepository;
import com.example.project.Repository.regRepository;
import com.example.project.service.projectService;

@Service
public class projectService {

   @Autowired
   projectRepository repo;

   @Autowired
   regRepository regrep;

   @Autowired
   feedRepository feedrep;

   @Autowired
   bookRepository bookrep;

   //login
    public void Add(User user){
       repo.save(user);
    }

    public List<User> show(){
       return repo.findAll(); 
    }

    //registration

    public void Addreg(Registration reg){
       regrep.save(reg);
    }

    public List<Registration> showreg(){
       return regrep.findAll(); 
    }

    public void deleteById(Integer id) {
       regrep.deleteById(id);
    }

    public Registration getById(Integer id) {
        Optional<Registration> table = regrep.findById(id);
        if(table.isPresent()){
            return table.get();
        }
        else{
            return null;
        }  
    }


     //books

    public void Addbook(Addbooks abs){
       bookrep.save(abs);
    }

    public List<Addbooks> showbook(){
       return bookrep.findAll(); 
    }

    public void deleteByIdB(Integer id) {
       bookrep.deleteById(id);
    }

    public Addbooks getByIdB(Integer id) {
        Optional<Addbooks> table = bookrep.findById(id);
        if(table.isPresent()){
            return table.get();
        }
        else{
            return null;
        }  
    }

    //feedback

    public void Addfeed(Feedback feed){
      feedrep.save(feed);
   }
   
   //reglist

   // public List<Registration> showreglist(){
   //     return regrep.findAll(); 
   //  }

   //  public void findAll(Integer id) {
   //     regrep.findAll(id);
   //  }


   //mockito test
   public List<User> getting(){
       return repo.findAll(); 
    }
}
