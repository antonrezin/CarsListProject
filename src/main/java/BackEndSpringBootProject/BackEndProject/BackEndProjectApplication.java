package BackEndSpringBootProject.BackEndProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import BackEndSpringBootProject.BackEndProject.domain.Cars;
import BackEndSpringBootProject.BackEndProject.domain.Color;
import BackEndSpringBootProject.BackEndProject.domain.User;
import BackEndSpringBootProject.BackEndProject.repository.CarsRepository;
import BackEndSpringBootProject.BackEndProject.repository.ColorRepository;
import BackEndSpringBootProject.BackEndProject.repository.UserRepository;

@SpringBootApplication
public class BackEndProjectApplication {

    private static final Logger log = LoggerFactory.getLogger(BackEndProjectApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BackEndProjectApplication.class, args);
    }

    @Bean
    CommandLineRunner carsDemo(CarsRepository repository, ColorRepository crepository, UserRepository userRepository) {
        return (args) -> {
            log.info("save cars");
            crepository.save(new Color("White"));
            crepository.save(new Color("Black"));
            crepository.save(new Color("Silver"));
            crepository.save(new Color("Gray"));
            crepository.save(new Color("Blue"));
            crepository.save(new Color("Red"));
            crepository.save(new Color("Green"));
            crepository.save(new Color("Brown"));
            crepository.save(new Color("Beige"));
            crepository.save(new Color("Yellow"));
            crepository.save(new Color("Orange"));
            crepository.save(new Color("Purple"));

            repository.save(new Cars("Bmw", "M8 Competition", 2024, "Grand Coupe", "4.4L V8", 617, 200000, crepository.findByName("Black").get(0)));
            repository.save(new Cars("Audi", "R8", 2024, "Sports Car", "5.2L V10", 610, 300000, crepository.findByName("White").get(0)));
            repository.save(new Cars("Toyota", "Supra (2JZ)", 2024, "Coupe", "3.0L Inline-Six", 1200, 200000, crepository.findByName("Red").get(0)));

            log.info("fetch all cars");
            for (Cars cars : repository.findAll()) {
                log.info(cars.toString());
            }

            log.info("save users");
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            userRepository.save(new User("user", encoder.encode("user"), "ROLE_USER"));
            userRepository.save(new User("admin", encoder.encode("admin"), "ROLE_ADMIN"));

            log.info("fetch all users");
            for (User user : userRepository.findAll()) {
                log.info(user.toString());
            }
        };
    }
}