package ac.za.cput.services.Impl;

import ac.za.cput.domain.ProfileModificationLog;
import ac.za.cput.repositories.ProfileModificationLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileModificationLogServiceImpl {

    @Autowired
    private ProfileModificationLogRepository profileModificationLogRepository;

    public List<ProfileModificationLog> getAll(){
        List<ProfileModificationLog> profileModificationLogs = new ArrayList<>();
        profileModificationLogRepository.findAll()
                .forEach(profileModificationLogs::add);
        return profileModificationLogs;
    }

    public ProfileModificationLog create(ProfileModificationLog entity){
        return profileModificationLogRepository.save(entity);
    }

    public ProfileModificationLog read(String logID){
        return profileModificationLogRepository.findOne(logID);
    }

    public ProfileModificationLog update(String logID, ProfileModificationLog logInfo){
        return profileModificationLogRepository.save(logInfo);
    }

    public void delete(String logID){
        profileModificationLogRepository.delete(logID);
    }
}
