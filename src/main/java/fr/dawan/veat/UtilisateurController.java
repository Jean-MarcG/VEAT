package fr.dawan.veat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.veat.dao.UtilisateurDao;
import fr.dawan.veat.entities.Utilisateur;

@Controller
@RequestMapping("/users")
public class UtilisateurController {

	@Autowired
	private UtilisateurDao utilisateurDao;

	@GetMapping("/{page}/{max}")
	public String showAllUtilisateurs(Model model, @PathVariable(name = "page") int page,
			@PathVariable(name = "max") int max) {
		int start = (page - 1) * max;
		List<Utilisateur> lu = utilisateurDao.findAll(start, max);

		model.addAttribute("utilisateurs", lu);
		model.addAttribute("page", page);
		model.addAttribute("max", max);

		boolean suivExist = (page * max) < utilisateurDao.count();
		model.addAttribute("suivExist", suivExist);
		return "users";
	}

//	@GetMapping("/remove/{id}")
//	public String showAllUsers(Model model, @PathVariable(name = "id") long id) {
//		// TODO
//		return "users";
//	}

}