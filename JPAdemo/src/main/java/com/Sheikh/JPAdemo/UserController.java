package com.Sheikh.JPAdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }

    // Code for iterate details from data through ID
    @GetMapping("/get_user")
    public User getUSer(@RequestParam("id") int id)
    {
        return userService.getUser(id);
    }

    // Code for iterate all data from Database
    @GetMapping("/get_users")
    public List<User> getUsers()
    {
        return userService.getUsers();
    }

    @DeleteMapping("/delete/{id}")
    public String DeleteStudent(@PathVariable("id") int rollNo)
    {
      return   userService.DeleteStudent(rollNo);

    }

    @DeleteMapping("/deleteAll")
    public String DeleteAllUser()
    {
        return userService.DeleteAllUser();
    }

//    @PutMapping("/update/{id}")
//    public String UpdateUser(@RequestParam("id") int rollNo, @RequestParam("name") String name, @RequestParam("age") int age)
//    {
//        return userService.UpdateUser(rollNo, name, age);
//    }
@PutMapping("/update/{id}")
public String updateUser(@PathVariable("id") int rollNo, @RequestBody User user) {
    return userService.UpdateUser(rollNo, user.getName(), user.getAge());
}

//   @RequestParam("id") :- It tells Spring to take the value from the URL or form data where the parameter is named id.
}
