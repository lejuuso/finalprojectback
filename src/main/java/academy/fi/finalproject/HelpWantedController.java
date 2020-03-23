package academy.fi.finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelpWantedController {
    @Autowired HelpWantedRepository repo;

    @GetMapping("/all")
    public Iterable<HelpWanted>findAll(){return repo.findAll();}

    @PostMapping("/add")
    public void insert(@RequestBody HelpWanted h){
        repo.save(h);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name="id") Integer id){
        repo.deleteById(id);
    }

    @DeleteMapping("/{id}/{email}")
    public void deleteUsingEmailAsAuthentication(@PathVariable(name="id") Integer id, @PathVariable (name= "email") String email){
        if(email.equals(repo.getById(id).getEmail())){
            repo.deleteById(id);
        }

    }
    @GetMapping("/dogout")
    public Iterable<HelpWanted> findAllDogOut(){
        return repo.findAllByDogOutIsTrue();
    }

}
