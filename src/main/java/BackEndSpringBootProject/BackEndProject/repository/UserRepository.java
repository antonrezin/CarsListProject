package BackEndSpringBootProject.BackEndProject.repository;

import org.springframework.data.repository.CrudRepository;
import BackEndSpringBootProject.BackEndProject.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}