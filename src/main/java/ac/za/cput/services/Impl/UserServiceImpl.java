package ac.za.cput.services.Impl;

import ac.za.cput.domain.User;
import ac.za.cput.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        List<User> users = new ArrayList<>();
        userRepository.findAll()
                .forEach(users::add);
        return users;
    }

    public User create(User entity){

        return userRepository.save(entity);
    }

    public User read(String userEmail){
        return userRepository.findOne(userEmail);
    }

    public User update(String userEmail, User users){
        return userRepository.save(users);
    }

    public void delete(String userEmail){
        userRepository.delete(userEmail);
    }



}
