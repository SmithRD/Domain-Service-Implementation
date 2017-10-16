package ac.za.cput.controller;

import ac.za.cput.domain.Administrator;
import ac.za.cput.factories.AdministratorFactory;
import ac.za.cput.repositories.AdministratorRepository;
import ac.za.cput.services.Impl.AdministratorServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/admin")
public class AdministratorController {

    @Autowired
    private AdministratorServiceImpl administratorService;

    @GetMapping(path="/all")
    public @ResponseBody List<Administrator> getAllAdministrator(){
       return administratorService.getAll();

    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addAdministrator(@RequestBody Administrator administrator){
        administratorService.create(administrator);
    }

    @RequestMapping(value="/find{adminID}")
    public @ResponseBody Administrator findAdministrator(@PathVariable String adminID){
       return administratorService.read(adminID);
    }

    @RequestMapping(value="/update/{adminID}", method = RequestMethod.PUT)
    public void updateAdministrator(@RequestBody Administrator administrator, @PathVariable String adminID){
        administratorService.update(adminID, administrator);
    }

    @RequestMapping(value="/delete/{adminID}",  method = RequestMethod.DELETE)
    public void deleteAdministrator(@PathVariable String adminID){

        administratorService.delete(adminID);
    }







}
