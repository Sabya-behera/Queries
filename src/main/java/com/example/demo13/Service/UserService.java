package com.example.demo13.Service;

import com.example.demo13.Model.User;
import com.example.demo13.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }

    public User addUser(User user)
    {
        System.out.println("Google");
        return userRepository.save(user);
    }

    public int deleteUser(int id)
    {
        userRepository.deleteById(id);
        return id;
    }
    public void chooseUser(int id)
    {
        userRepository.findById(id).get();
    }

    public List<User> getAllUserJPQL()
    {
        return userRepository.getAllUserJPQL();
    }
    public List<User> getByName(String name)
    {
        return userRepository.getByName(name);
    }
    public List<User> getByJobOrName(String name,String job){return userRepository.getByJobOrName(name, job);}

    public List<User> getAllUserNative()
    {
        return userRepository.getAllUserNative();
    }
}
