package com.Sheikh.JPAdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional; // Import Optional

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    // code for add data into repository layes
    public String addUser(User user)
    {
        userRepository.save(user);
        return "User Addded Bro";
    }

    // code for iterate data from database
    public User getUser(int id)
    {
        return userRepository.findById(id).get();
    }

    // Code for access all data from database
    public List<User> getUsers()
    {
        return userRepository.findAll();
    }
    // code for delete one data
    public String DeleteStudent(int rollNo) {
        if (userRepository.existsById(rollNo)) {
            userRepository.deleteById(rollNo);
            return "User deleted successfully";
        } else {
            return "User not found";
        }
    }

    public String DeleteAllUser()
    {
        userRepository.deleteAll();
        return "All User has been delete";
    }

    // Code for Update Name and Age of user
    public String UpdateUser(int rollNo,String name,int age)
    {
        Optional<User> UpdUser = userRepository.findById(rollNo);
        if(UpdUser.isPresent())
        {
            User user =UpdUser.get();
            user.setName(name);
            user.setAge(age);
            userRepository.save(user);
            return "Update has been Done";
        }
        else
        {
            return "that number's User not found";

        }

    }
}
