package academy.fi.finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/district/api")
public class DistrictController {
    @Autowired
    DistrictRepository repo;

    @GetMapping("")
    public Iterable<District> findAllDistricts(){
        return repo.findAll();
    }

    @GetMapping("{districtName}")
    public String getPostnumberWithDistrictNameFin(@PathVariable(name = "districtName", required = true) String districtName){
        return repo.findByDistrictNameFin(districtName).getPostnumber();
    }
}
