package BackEndSpringBootProject.BackEndProject.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ColorRepository extends CrudRepository<Color, Long> {

	List<Color> findByName(String name);
}