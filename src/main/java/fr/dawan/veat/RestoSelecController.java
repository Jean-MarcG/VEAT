package fr.dawan.veat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.dawan.veat.dao.RestaurantDao;
import fr.dawan.veat.entities.Restaurant;

@Controller
public class RestoSelecController {

	@Autowired
	private RestaurantDao restaurantDao;

	
	@GetMapping("/restoSelec/{id}")
	public String restoById (Model model, @PathVariable(name = "id") long id) {
		Restaurant r = restaurantDao.findById(id);
		model.addAttribute("restaurant", r);
		return "restoSelec";
	}
	

	

}
