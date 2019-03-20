package io.java.springbootstarter.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping ("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping ("/users/ {id}")
    public Optional<User> getUser(@PathVariable int id){
        return userService.getUser(id);
    }

    @RequestMapping (method = RequestMethod.POST, value = "/users")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping (method = RequestMethod.PUT, value = "/users/{id}")
    public void updateUser(@PathVariable int id, @RequestBody User user){
        userService.updateUser(id, user);
    }

    @RequestMapping (method = RequestMethod.DELETE, value = "/users/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
    }




}
