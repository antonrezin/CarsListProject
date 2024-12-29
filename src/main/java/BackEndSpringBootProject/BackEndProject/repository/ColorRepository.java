package BackEndSpringBootProject.BackEndProject.repository;

import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import BackEndSpringBootProject.BackEndProject.domain.Color;

@Order(2)
@RepositoryRestResource(collectionResourceRel = "colors", path = "colors")
public interface ColorRepository extends CrudRepository<Color, Long> {

	List<Color> findByName(String name);
}