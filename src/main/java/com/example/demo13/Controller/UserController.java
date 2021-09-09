package com.example.demo13.Controller;


import com.example.demo13.Model.User;
import com.example.demo13.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    UserService userService;

    @GetMapping(value="/get")
    public List<User> getAllUser()
    {
         return userService.getAllUser();
    }

    @PostMapping(value = "/post")
    public User addUser(@RequestBody User user)
    {
        System.out.println("Rocket");
        return userService.addUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public int deleteMapping(@PathVariable(value = "id") int id)
    {
        return userService.deleteUser(id);
    }

    @GetMapping("/get/{id}")

    public void chooseMapping(@PathVariable(value = "id")int id)
    {

        userService.chooseUser(id);
    }

    @GetMapping("/getJPQL")
    public List<User> getAllUserJPQL()
    {
        return userService.getAllUserJPQL();
    }

    @GetMapping("/getJPQL/{name}")
    public List<User> getByName(@PathVariable String name) {
        return userService.getByName(name);
    }

    @GetMapping("/getJPQL/{name}/{job}")
    public List<User> getByJobOrName(@PathVariable String name ,@PathVariable String job)
    {
        return userService.getByJobOrName(name,job);
    }

    @GetMapping("/getNative")
    public List<User> getAllUserNative()
    {
        return userService.getAllUserNative();
    }
}
