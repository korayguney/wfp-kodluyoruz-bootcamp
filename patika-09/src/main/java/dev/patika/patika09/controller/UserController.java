package dev.patika.patika09.controller;

import dev.patika.patika09.entity.User;
import dev.patika.patika09.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserRepository repository;

    @GetMapping("/index")
    public String showUserList(Model theModel){
        theModel.addAttribute("users", repository.findAll());
        return "index";
    }

    @GetMapping("/signup")
    public String showSignupPage(User user){
        return "adduser";
    }

    @PostMapping("/adduser")
    public String addUser(@Valid User user, BindingResult result, Model theModel){
        if(result.hasErrors()){
            return "adduser";
        }

        repository.save(user);
        return "redirect:/index";
    }

    @GetMapping("/edit/{id}")
    public String showUpdatePage(@PathVariable int id, Model theModel){
        User user = repository.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid user id: " + id));
        theModel.addAttribute("user",user);
        return "updateuser";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable int id, @Valid User user,  BindingResult result, Model theModel){
        if(result.hasErrors()){
            return "updateuser";
        }

        repository.save(user);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        User user = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user : " + id));
        repository.delete(user);

        return "redirect:/index";
    }

}
