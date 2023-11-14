package BackEndSpringBootProject.BackEndProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import BackEndSpringBootProject.BackEndProject.domain.Cars;
import BackEndSpringBootProject.BackEndProject.domain.CarsRepository;
import BackEndSpringBootProject.BackEndProject.domain.Color;
import BackEndSpringBootProject.BackEndProject.domain.ColorRepository;

@SpringBootApplication
public class BackEndProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndProjectApplication.class, args);
	}

	@Bean
	public CommandLineRunner carsDemo(CarsRepository repository, ColorRepository crepository) {
	    return (args) -> {
	    	crepository.save(new Color(""));
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
	    };
	}


}
