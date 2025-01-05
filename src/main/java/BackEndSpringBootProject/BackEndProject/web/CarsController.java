package BackEndSpringBootProject.BackEndProject.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import BackEndSpringBootProject.BackEndProject.domain.Cars;
import BackEndSpringBootProject.BackEndProject.repository.CarsRepository;
import BackEndSpringBootProject.BackEndProject.repository.ColorRepository;

@Controller
public class CarsController {
    @Autowired
    private CarsRepository repository;
    @Autowired
    private ColorRepository crepository;

    @RequestMapping(value = "/cars")
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
        return "redirect:/cars";
    }

    @GetMapping("/delete/{id}")
    @PreAuthorize("hasRole('ADMIN')")  // Uncommented to ensure only admin can delete
    public String deleteCars(@PathVariable("id") Long carsId, Model model) {
        repository.deleteById(carsId);
        return "redirect:/cars";
    }

    @RequestMapping(value = "/editcars/{id}")
    @PreAuthorize("hasRole('ADMIN')")  // You can also apply @PreAuthorize here if only admins should edit
    public String showEditCars(@PathVariable("id") Long carsId, Model model) {
        var car = repository.findById(carsId);
        if (car.isPresent()) {
            model.addAttribute("cars", car.get());
        } else {
            model.addAttribute("error", "Car not found");
            return "redirect:/cars";  // Redirect if car not found
        }
        model.addAttribute("colors", crepository.findAll());
        return "editcars";
    }
	
}
