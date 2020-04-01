package academy.fi.finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/helper/api")
public class HelperController {
    @Autowired HelperRepository repo;

    @GetMapping("/help")
    public Iterable<Helper>getAll(){
       return repo.findAll();
    }

    @GetMapping("/{ide}")
    public String getEmailById(@PathVariable(name="ide") Integer ide){
        return repo.getByIde(ide).getMail();
    }

    @PostMapping("/insert")
    public void addNew(@RequestBody Helper h){
        repo.save(h);
    }

    @DeleteMapping("{ide}/{mail}")
    public void deleteUsingEmailAsAuthentication(@PathVariable(name="ide") Integer ide, @PathVariable (name= "mail") String mail) {
        if (mail.equals(repo.getByIde(ide).getMail())) {
            repo.deleteById(ide);
        }
    }

    @GetMapping("/grocerieshelp")
    public List<Helper> findAllGroceries(){
        return repo.findAllByGroceriesTrue();
    }

    @GetMapping("/dogouthelp")
    public List<Helper>findAllDogOut(){
        return repo.findAllByDogOutTrue();
    }

    @GetMapping("/outdoorcompanyhelp")
    public List<Helper>findAllCompany(){
        return repo.findAllByOutdoorCompanyTrue();
    }

    @GetMapping("/trashhelp")
    public List<Helper>findAllTrashOut(){
        return repo.findAllByTakingOutTrashTrue();
    }

    @GetMapping("/otherhelp")
    public List<Helper>findAllOther(){
        return repo.findAllByOtherTrue();
    }

}
