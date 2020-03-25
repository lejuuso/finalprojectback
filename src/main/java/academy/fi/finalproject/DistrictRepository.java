package academy.fi.finalproject;

import org.springframework.data.repository.CrudRepository;

public interface DistrictRepository extends CrudRepository<District, String> {
    public District findByDistrictNameFin(String districtName);
    public District findByPostnumber(String postnumber);

}
