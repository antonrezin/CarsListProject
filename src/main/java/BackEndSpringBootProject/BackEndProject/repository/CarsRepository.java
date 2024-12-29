package BackEndSpringBootProject.BackEndProject.repository;

import org.springframework.core.annotation.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import BackEndSpringBootProject.BackEndProject.domain.Cars;

@Order(1)
@RepositoryRestResource(collectionResourceRel = "cars", path = "cars")
public interface CarsRepository extends CrudRepository<Cars, Long> {
	
}