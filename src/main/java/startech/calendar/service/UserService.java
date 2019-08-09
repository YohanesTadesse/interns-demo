package startech.calendar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import startech.calendar.persistence.Account;
import startech.calendar.persistence.UserPersistence;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserPersistence persistence;

    public List<Account> getAllUsers(){
        return persistence.findAll();}

    public Account getUser(Long id){
        return persistence.findById(id).orElse(null);
    }

    public void save(Account user) {
        persistence.save(user);
    }
}
