package academy.fi.finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
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
