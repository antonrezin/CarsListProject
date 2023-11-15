package BackEndSpringBootProject.BackEndProject.domain;

import org.springframework.core.annotation.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Order(1)
@RepositoryRestResource(collectionResourceRel = "cars", path = "cars")
public interface CarsRepository extends CrudRepository<Cars, Long> {
	
}