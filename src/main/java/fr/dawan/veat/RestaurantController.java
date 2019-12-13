package fr.dawan.veat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.dawan.veat.dao.RestaurantDao;
import fr.dawan.veat.entities.Restaurant;
import fr.dawan.veat.entities.Utilisateur;

@Controller
public class RestaurantController {

	@GetMapping(value = "/myrestaurant")
	public String showRestaurant(Model model) {
		Utilisateur u = new Utilisateur();
		model.addAttribute("login-form", new Utilisateur());

		return "myrestaurant";
	}

	@Autowired
	private RestaurantDao restaurantDao;

	@GetMapping("/{page}/{max}")
	public String showAllRestaurants(Model model, @PathVariable(name = "page") int page,
			@PathVariable(name = "max") int max) {
		int start = (page - 1) * max;
		List<Restaurant> lr = restaurantDao.findAll(start, max);

		model.addAttribute("restaurants", lr);
		model.addAttribute("page", page);
		model.addAttribute("max", 5);

		boolean suivExist = (page * max) < restaurantDao.count();
		model.addAttribute("suivExist", suivExist);
		return "listeRestaurants";
	}

	@GetMapping("/remove/{id}")
	public String removeRestaurants(Model model, @PathVariable(name = "id") long id) {
		restaurantDao.delete1(id);
		return "restaurants";
	}

}

