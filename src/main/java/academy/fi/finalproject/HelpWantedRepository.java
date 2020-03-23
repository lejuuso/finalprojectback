package academy.fi.finalproject;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HelpWantedRepository extends CrudRepository<HelpWanted, Integer> {
    public HelpWanted getById(Integer id);

    public List<HelpWanted> findAllByDogOutIsTrue();
}
