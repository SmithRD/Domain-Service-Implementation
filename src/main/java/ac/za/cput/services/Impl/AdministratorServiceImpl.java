package ac.za.cput.services.Impl;

import ac.za.cput.domain.Administrator;
import ac.za.cput.repositories.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
public class AdministratorServiceImpl{

    @Autowired
    private AdministratorRepository administratorRepository;

    public List<Administrator> getAll(){
        List<Administrator> administrators = new ArrayList<>();
        administratorRepository.findAll()
                .forEach(administrators::add);
        return administrators;
    }

    public Administrator create(Administrator entity){
        return administratorRepository.save(entity);
    }

    public Administrator read(String adminID){
        return administratorRepository.findOne(adminID);
    }

    public Administrator update(String adminID, Administrator administrator){
        return administratorRepository.save(administrator);
    }

    public void delete(String adminID){
        administratorRepository.delete(adminID);
    }




}
