package academy.fi.finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/helper/api")
public class HelperController {
    @Autowired HelperRepository repo;

    @GetMapping("/help")
    public Iterable<Helper>getAll(){
       return repo.findAll();
    }

    @GetMapping("/{id}")
    public String getEmailById(@PathVariable(name= "id") Integer id){
        return repo.getById(id).getEmail();
    }

    @PostMapping("/insert")
    public void addNew(@RequestBody Helper h){
        repo.save(h);
    }

    @DeleteMapping("{id}/{email}")
    public void deleteUsingEmailAsAuthentication(@PathVariable(name="id") Integer id, @PathVariable (name= "email") String email) {
        if (email.equals(repo.getById(id).getEmail())) {
            repo.deleteById(id);
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
