package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.User;
import kr.re.kitri.hello.service.impl.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private static Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User registUser(@RequestBody User user) {
        userService.registUser(user);
        return user;
    }
    @GetMapping("/users")
    public List<User> viewAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{userid}")
    public User viewUserDetails(@PathVariable String userid){
        log.debug("잘 조회 되었습니다. " + userid);
        return userService.getUserDetails(userid);
    }
}
