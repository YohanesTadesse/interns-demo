package startech.calendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import startech.calendar.persistence.Account;
import startech.calendar.service.UserService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="user/")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(path="all-users",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Account> listUsers(){
        return service.getAllUsers();
    }

    @GetMapping(path="user-id", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Account getUserById(@RequestParam(name="id") Long id){
        return service.getUser(id);
    }

    @PostMapping(path="create",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void createUser(@RequestBody Account user){
        service.save(user);
    }

}
