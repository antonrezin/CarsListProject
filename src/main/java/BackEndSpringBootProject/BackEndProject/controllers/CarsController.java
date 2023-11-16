package BackEndSpringBootProject.BackEndProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import BackEndSpringBootProject.BackEndProject.domain.Cars;
import BackEndSpringBootProject.BackEndProject.domain.CarsRepository;
import BackEndSpringBootProject.BackEndProject.domain.ColorRepository;

@Controller
public class CarsController {
    private CarsRepository repository;
    private ColorRepository crepository;

    @Autowired
    public CarsController(CarsRepository repository, ColorRepository crepository) {
        this.repository = repository;
        this.crepository = crepository;
    }

	@RequestMapping(value = "/cars" )
	public String carsList(Model model) {
		model.addAttribute("carsList", repository.findAll());
		return "cars";
	}

	@RequestMapping(value = "/addcars")
	public String addCars(Model model) {
	    model.addAttribute("cars", new Cars());
	    model.addAttribute("colors", crepository.findAll());
	    return "addcars";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute Cars cars) {
	    repository.save(cars);
	    return "redirect:/addcars";
	}

	@GetMapping("/delete/{id}")
//	@PreAuthorize("hasRole('ADMIN')")
	    public String deleteCars(@PathVariable("id") Long carsId, Model model) {
		repository.deleteById(carsId);
	    return "redirect:../cars";
	}
	
	@RequestMapping(value = "/editcars/{id}")
//	@PreAuthorize("hasRole('ADMIN')")
    public String showEditCars(@PathVariable("id") Long carsId, Model model) {
        model.addAttribute("cars", repository.findById(carsId));
        model.addAttribute("colors", crepository.findAll());
        return "editcars";
    }

}
