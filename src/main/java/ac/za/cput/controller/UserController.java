package ac.za.cput.controller;


import ac.za.cput.domain.FoodInfo;
import ac.za.cput.domain.User;
import ac.za.cput.factories.UserFactory;
import ac.za.cput.repositories.UserRepository;
import ac.za.cput.services.Impl.UserServiceImpl;
import com.google.gson.Gson;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping(path="/all")
    public @ResponseBody List<User> getAllUsers(){

        return userService.getAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addUser(@RequestBody User user ){
        userService.create(user);
    }

    @RequestMapping(value="/find/{userEmail:.*}")
    public @ResponseBody User findUser(@PathVariable String userEmail){

        return userService.read(userEmail);
    }

    @RequestMapping(value="/update/{userEmail:.*}",method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user, @PathVariable String userEmail){
        userService.update(userEmail, user);
    }

    @RequestMapping(value="/delete/{userEmail:.*}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable String userEmail){

        userService.delete(userEmail);
    }
}

