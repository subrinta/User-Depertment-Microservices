package com.learning.user.controller;

import com.learning.user.ValueObject.Depertment;
import com.learning.user.ValueObject.ResponseTemplate;
import com.learning.user.entity.User;
import com.learning.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplate findUserById(@PathVariable("id") Long id){
        User user = userService.findUserById(id);
        Depertment depertment = restTemplate.getForObject("http://DEPERTMENT-SERVICE/depertments/"+user.getDeptId(), Depertment.class);
        ResponseTemplate responseTemplate = new ResponseTemplate(user, depertment);
        return responseTemplate;
    }
}
