package academy.fi.finalproject;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HelperRepository extends CrudRepository<Helper, Integer> {
    Helper getById(Integer id);
    List<Helper> findAllByGroceriesTrue();
    List<Helper> findAllByDogOutTrue();
    List<Helper> findAllByOutdoorCompanyTrue();
    List<Helper> findAllByTakingOutTrashTrue();
    List<Helper> findAllByOtherTrue();
}
