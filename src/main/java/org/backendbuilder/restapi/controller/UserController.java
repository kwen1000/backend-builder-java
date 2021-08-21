package org.backendbuilder.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.backendbuilder.restapi.model.User;
import org.backendbuilder.restapi.repository.UserRepository;
// import org.backendbuilder.restapi.service.UserService;

@Controller
@RequestMapping(value = "/api/auth")
public class UserController {
    
    @Autowired
    // private UserService userService;
    private UserRepository userRepository;
    
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody String register() throws Exception {
        return "{ \"message\": \"Accepted\" }";
    }
    
    @RequestMapping(value = "/test1", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody String test1() throws Exception {
        try {
            User user = new User();
            user.setEmail("test1234@example.zzz");
            user.setUsername("test1234@example.zzz");
            user.setPassword("alsdkajslvnlji2oi4");
            userRepository.save(user);
            return "{ \"message\": \"Accepted\" }";
        } catch (Exception e) {
            return "{ \"message\": \""+e.getMessage()+"\" }";
        }
    }
    
    @GetMapping(path = "/test3")
    public @ResponseBody String test3() throws Exception {
        return "{ \"message\": \"Accepted\" }";
    }

}
