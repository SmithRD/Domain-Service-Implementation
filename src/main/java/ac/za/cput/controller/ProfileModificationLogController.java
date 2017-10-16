package ac.za.cput.controller;

import ac.za.cput.domain.ProfileModificationLog;
import ac.za.cput.services.Impl.ProfileModificationLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/prolog")
public class ProfileModificationLogController {

    @Autowired
    private ProfileModificationLogServiceImpl profileModificationLogService;

    @GetMapping(path="/all")
    public @ResponseBody
    List<ProfileModificationLog> getAllProfileModificationLog(){
        return  profileModificationLogService.getAll();

    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addProfileModificationLog(@RequestBody ProfileModificationLog profileModificationLog){
        profileModificationLogService.create(profileModificationLog);
    }

    @RequestMapping(value="/find{logID}")
    public @ResponseBody ProfileModificationLog findProfileModificationLog(@PathVariable String logID){
        return profileModificationLogService.read(logID);
    }

    @RequestMapping(value="/update/{logID}",method = RequestMethod.PUT)
    public void updateProfileModificationLog(@RequestBody ProfileModificationLog profileModificationLog, @PathVariable String logID){
        profileModificationLogService.update(logID, profileModificationLog);
    }

    @RequestMapping(value="/delete/{logID}",method = RequestMethod.DELETE)
    public void deleteProfileModificationLog(@PathVariable String logID){
        profileModificationLogService.delete(logID);
    }
}
