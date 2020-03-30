package academy.fi.finalproject;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HelpWantedRepository extends CrudRepository<HelpWanted, Integer> {
    HelpWanted getById(Integer id);


    List<HelpWanted> findAllByGroceriesTrue();
    List<HelpWanted> findAllByDogOutTrue();
    List<HelpWanted> findAllByOutdoorCompanyTrue();
    List<HelpWanted> findAllByTakingOutTrashTrue();
    List<HelpWanted> findAllByOtherTrue();
}
