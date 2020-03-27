package academy.fi.finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api")
public class HelpWantedController {
    @Autowired HelpWantedRepository repo;

    @GetMapping("/all")
    public Iterable<HelpWanted>findAll(){return repo.findAll();}


    @GetMapping("/groceries")
    public List<HelpWanted>findAllGroceries(){
        return repo.findAllByGroceriesTrue();
    }

    @GetMapping("/dogout")
    public List<HelpWanted>findAllDogOut(){
        return repo.findAllByDogOutTrue();
    }

    @GetMapping("/outdoorcompany")
    public List<HelpWanted>findAllCompany(){
        return repo.findAllByOutdoorCompanyTrue();
    }

    @GetMapping("/trash")
    public List<HelpWanted>findAllTrashOut(){
        return repo.findAllByTakingOutTrashTrue();
    }

    @GetMapping("/other")
    public List<HelpWanted>findAllOther(){
        return repo.findAllByOtherTrue();
    }

    @PostMapping("/add")
    public void insert(@RequestBody HelpWanted h){
        repo.save(h);
    }

    @DeleteMapping("{id}/{email}")
    public void deleteUsingEmailAsAuthentication(@PathVariable(name="id") Integer id, @PathVariable (name= "email") String email) {
        if (email.equals(repo.getById(id).getEmail())) {
            repo.deleteById(id);
        }
    }


    @GetMapping("/{id}")
    public String getEmailById(@PathVariable(name="id") Integer id){
        return repo.getById(id).getEmail();
    }


    @PutMapping("/{id}")
    public void update(@RequestBody HelpWanted h, @PathVariable(name = "id", required = true) int id){
        Optional<HelpWanted> help = repo.findById(id);
        HelpWanted hw = help.orElseThrow(RuntimeException::new);
        hw.setHeadline(h.getHeadline());
        hw.setName(h.getName());
        hw.setPostcode(h.getPostcode());
        hw.setEmail(h.getEmail());
        hw.setDescription(h.getDescription());
        hw.setGroceries(h.getGroceries());
        hw.setChildCare(h.getChildCare());
        hw.setDogOut(h.getDogOut());
        hw.setOutdoorCompany(h.getOutdoorCompany());
        hw.setTakingOutTrash(h.getTakingOutTrash());
        hw.setOther(h.getOther());
        repo.save(hw);

    }

}
