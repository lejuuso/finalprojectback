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

}
