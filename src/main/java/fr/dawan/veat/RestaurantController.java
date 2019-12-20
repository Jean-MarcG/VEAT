package fr.dawan.veat;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.dawan.veat.dao.RestaurantDao;
import fr.dawan.veat.entities.Restaurant;
import fr.dawan.veat.entities.Utilisateur;
import fr.dawan.veat.form.SearchForm;

@Controller
public class RestaurantController {
	
	
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
	
//	@GetMapping("/restoSelec/{id}")
//	public String restoById (Model model, @PathVariable(name = "id") long id) {
//		restaurantDao.findById(id);
//		return "restoSelec";
//	}
	
	@PostMapping("/listeRestaurants") 
	public String getSearchRestaurants(Model model,
			HttpSession session, 
			@ModelAttribute("search-form") SearchForm sf,
			BindingResult result){
		model.addAttribute("search-form", sf);
		System.out.print("sf = ");
		System.out.println(sf.getSearch());
		
		List<Restaurant> r = restaurantDao.findByVille(sf.getSearch());
		List<Restaurant> r1 = restaurantDao.findByPays(sf.getSearch());
				
		System.out.print("r = ");
		for (Restaurant res: r) {
			System.out.println(res.getNom());
		}
			
		r.addAll(r1);
		model.addAttribute("restaurants", r);
		model.addAttribute("page", 1);
		model.addAttribute("max", 5);
		
		boolean suivExist = (1 * 5) < restaurantDao.count();
		model.addAttribute("suivExist", suivExist);
		return "listeRestaurants";
	}
	
	
	@GetMapping(value = "/myrestaurant")
	public String showRestaurant(Model model) {
		Utilisateur u = new Utilisateur();
		model.addAttribute("login-form", new Utilisateur());
		model.addAttribute("search-form", new SearchForm());
		return "myrestaurant";
	}

	
	

}

