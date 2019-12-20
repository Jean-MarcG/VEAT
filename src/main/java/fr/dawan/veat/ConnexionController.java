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
import fr.dawan.veat.form.SearchForm;

@Controller
public class ConnexionController {

	@Autowired
	private UtilisateurDao utilisateurDao;

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
				model.addAttribute("search-form", new SearchForm());
				
				String role = (String) session.getAttribute("userRole");
				
					if(role.equals("RESTAURATEUR")) {
						model.addAttribute("search-form", new SearchForm());
						return "myrestaurant";
					} else {
						return "home";
					}
				
				
			} else {
				model.addAttribute("msg", "Erreur d'authentification");
				model.addAttribute("login-form", u);
//				model.addAttribute("search-form", new SearchForm());
//				System.out.println("userConnected ? " + session.getAttribute("userConnected"));
//				ca serait mieux de rester sur login non ? en cas d'erreur d'authentification ? opk
				return "connexion";
			}

		}

	}

	@GetMapping(value = "/contact")
	public String contact(Model model) {

		return "contact";
	}

	// Deconnection
	@GetMapping(value = "/logout")
	public String logout(HttpSession session, Model m) {
//			dans le doute
		session.setAttribute("userConnected", false);
		session.setAttribute("userId", 0);
		session.setAttribute("userName", null);
		session.invalidate();
		// si besoin de réafficher un formulaire
		m.addAttribute("search-form", new SearchForm());
		m.addAttribute("login-form", new Utilisateur());
		return "home";
	}

}
