package com.example.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;

import com.example.project.model.Addbooks;
import com.example.project.model.Feedback;
import com.example.project.model.Registration;
import com.example.project.model.User;
import com.example.project.service.projectService;

// import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;


@Controller
public class projectController {

    @Autowired
    projectService demoser;
    

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/blist")
    public String List() {
        return "books";
    }

    // @PostMapping("/blist")
    // public String List(@ModelAttribute User user, Model model) {
    //     demoser.Add(user);
    //     model.addAttribute("name", user.getName());
    //     model.addAttribute("email", user.getEmail());
    //     List<User> use = demoser.show();
    //     model.addAttribute("data", use);       
    //     return "books";
    // }

    @GetMapping("/login")
    public String login() {
        return "student_login";
    }

    @GetMapping("/alogin")
    public String alogin() {
        return "admin_login";
    }

    @GetMapping("/sign")
    public String signup() {
        return "registration";
    }

    @GetMapping("/addbook")
    public String addbook() {
        return "add_books";
    }

    @PostMapping("/list")
    public String List(@ModelAttribute Registration reg, Model model) {
        demoser.Addreg(reg);
        model.addAttribute("studentregid", reg.getStudentregid());
        model.addAttribute("fn", reg.getFn());
        model.addAttribute("ln", reg.getLn());
        model.addAttribute("urname", reg.getUrname());
        model.addAttribute("pass", reg.getPass());
        model.addAttribute("email", reg.getEmail());
        List<Registration> usereg = demoser.showreg();
        model.addAttribute("data", usereg);       
        return "regusers";
    }

    //book list

    @PostMapping("/ablist")
    public String Listb(@ModelAttribute Addbooks ab, Model model) {
        demoser.Addbook(ab);
        model.addAttribute("bid", ab.getBid());
        model.addAttribute("bname", ab.getBname());
        model.addAttribute("aname", ab.getAname());
        model.addAttribute("edition", ab.getEdition());
        List<Addbooks> abook = demoser.showbook();
        model.addAttribute("data", abook);       
        return "booklist";
    }

    //edit delete book list

    @GetMapping("/deleteb/{id}")
    public String deleteb(@PathVariable Integer id,Model model) {
        demoser.deleteByIdB(id);
        // List<User> use = demoser.delete(id);
        model.addAttribute("data",demoser.showbook());
        return "booklist";
    }

    
    @PostMapping("/editb")
    public String editb(@ModelAttribute Addbooks ab,Model model) {
        demoser.Addbook(ab);
        List<Addbooks> use = demoser.showbook();
        model.addAttribute("data", use);
        return "booklist";
    }

    @GetMapping("/editb/{id}")
    public String updateByIdb(@PathVariable Integer id,Model model) {
        // demoser.updateById(id);
        Addbooks us = demoser.getByIdB(id);
        model.addAttribute("updtdata",us);
        return "editbook";
    }


    //book list show to user
    @GetMapping("/ablist")
    public String Listbooks(@ModelAttribute Addbooks ab, Model model) {
        demoser.Addbook(ab);
        model.addAttribute("bid", ab.getBid());
        model.addAttribute("bname", ab.getBname());
        model.addAttribute("aname", ab.getAname());
        model.addAttribute("edition", ab.getEdition());
        List<Addbooks> abook = demoser.showbook();
        model.addAttribute("data", abook);       
        return "booklist";
    }


    @GetMapping("/feed")
    public String feedback(@ModelAttribute Feedback feed,Model model) {

        model.addAttribute("username", feed.getRequriment());
        model.addAttribute("password", feed.getOpinion());
        model.addAttribute("password", feed.getComment());
        demoser.Addfeed(feed);
        return "feedback";
    }

    @GetMapping("/issue")
    public String issueb() {
        return "issue";
    }

    @GetMapping("/return")
    public String returnb() {
        return "return";
    }

    //stud login
    @PostMapping("/welcome")
    public String greet(@ModelAttribute User user,Model model){
      // System.out.println(user.toString());
      model.addAttribute("username", user.getUsername());
      model.addAttribute("password", user.getPassword());
      demoser.Add(user);
      return "welcome";
    }


    @GetMapping("/welcome")
    public String list(@ModelAttribute User user,Model model){
      // System.out.println(user.toString());
      model.addAttribute("username", user.getUsername());
      model.addAttribute("password", user.getPassword());
      demoser.Add(user);
      return "welcome";
    }
     
    //admin login

     @PostMapping("/awelcome")
    public String greeta(@ModelAttribute User user,Model model){
      // System.out.println(user.toString());
      model.addAttribute("username", user.getUsername());
      model.addAttribute("password", user.getPassword());
      demoser.Add(user);
      return "awelcome";
    }


    @GetMapping("/awelcome")
    public String lista(@ModelAttribute User user,Model model){
      // System.out.println(user.toString());
      model.addAttribute("username", user.getUsername());
      model.addAttribute("password", user.getPassword());
      demoser.Add(user);
      return "awelcome";
    }

    // @PostMapping("/list")
    // public String List(@ModelAttribute User user, Model model) {
    //     demoser.Add(user);
    //     model.addAttribute("name", user.getName());
    //     model.addAttribute("email", user.getEmail());
    //     List<User> use = demoser.show();
    //     model.addAttribute("data", use);       
    //     return "Users";
    // }

    // @RequestMapping("")
    // public String update(Model model) {
    //     return "Users";
    // }

    // @GetMapping("/control/{id}")
    // public String identity(){
    //     return "Users";
    // }

    // @PostMapping("/signup")
    // public String List(@ModelAttribute User user, Model model) {
    //     demoser.Add(user);
    //     model.addAttribute("name", user.getName());
    //     model.addAttribute("email", user.getEmail());
    //     List<User> use = demoser.show();
    //     model.addAttribute("data", use);       
    //     return "Users";
    // }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id,Model model) {
        demoser.deleteById(id);
        // List<User> use = demoser.delete(id);
        model.addAttribute("data",demoser.showreg());
        return "regusers";
    }

    
    @PostMapping("/edit")
    public String edit(@ModelAttribute Registration reg,Model model) {
        demoser.Addreg(reg);
        List<Registration> use = demoser.showreg();
        model.addAttribute("data", use);
        return "regusers";
    }

    @GetMapping("/edit/{id}")
    public String updateById(@PathVariable Integer id,Model model) {
        // demoser.updateById(id);
        Registration us = demoser.getById(id);
        model.addAttribute("updtdata",us);
        return "editsignup";
    }


    //reg user list show 

     @GetMapping("/list/{id}")
    public String signuplist(@PathVariable Integer id,Model model) {
        demoser.getById(id);
        // List<User> use = demoser.delete(id);
        model.addAttribute("data",demoser.showreg());
        return "regusers";  
    }

    //regis user list show in book sec
    @GetMapping("/list")
    public String Listusers(@ModelAttribute Registration reg, Model model) {
        demoser.Addreg(reg);
        model.addAttribute("studentregid", reg.getStudentregid());
        model.addAttribute("fn", reg.getFn());
        model.addAttribute("ln", reg.getLn());
        model.addAttribute("urname", reg.getUrname());
        model.addAttribute("pass", reg.getPass());
        model.addAttribute("email", reg.getEmail());
        List<Registration> usereg = demoser.showreg();
        model.addAttribute("data", usereg);       
        return "regusers";
    }
    
}
