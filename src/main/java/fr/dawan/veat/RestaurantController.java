package fr.dawan.veat;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.dawan.veat.dao.UtilisateurDao;
import fr.dawan.veat.entities.Utilisateur;

@Controller
public class RestaurantController {

	@GetMapping(value = "/myrestaurant")
	public String showRestaurant(Model model) {
		Utilisateur u = new Utilisateur();
		model.addAttribute("login-form", new Utilisateur());

		return "myrestaurant";
	}

	
	

}
