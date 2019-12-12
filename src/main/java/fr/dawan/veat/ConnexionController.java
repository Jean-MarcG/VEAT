package fr.dawan.veat;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.dawan.veat.dao.UtilisateurDAO;
import fr.dawan.veat.entities.Utilisateur;

@Controller
public class ConnexionController {

	@Autowired
	private UtilisateurDAO utilisateurDao;

	@GetMapping(value = "/connexion")
	public String showLogin(Model model) {
		model.addAttribute("login-form", new Utilisateur());

		return "connexion";
	}

	@PostMapping(value = "/check-login")
	public String checkLogin(Model model, HttpSession session, @ModelAttribute("login-form") Utilisateur u,
			BindingResult result) {

		if (result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			model.addAttribute("login-form", u);
			return "connexion";

		} else {
			Utilisateur dbUser = utilisateurDao.findByEmail(u.getEmail());

			if (dbUser != null && dbUser.getPwd().contentEquals(u.getPwd())) {
				session.setAttribute("userConnected", true);
				session.setAttribute("userId", dbUser.getId());
				session.setAttribute("userName", dbUser.getNom());
				session.setAttribute("userRole", dbUser.getRole().toString());
				System.out.println(">>>>>>>>>>>>>>" + (Boolean)session.getAttribute("userConnected"));
				return "home";
			} else {
				model.addAttribute("msg", "Erreur d'authentification");
				model.addAttribute("login-form", u);
				return "connexion";
			}

		}

	}

}
