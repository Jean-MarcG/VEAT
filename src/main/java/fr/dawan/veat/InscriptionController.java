package fr.dawan.veat;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.dawan.veat.dao.UtilisateurDao;
import fr.dawan.veat.entities.TypeUtilisateur;
import fr.dawan.veat.entities.Utilisateur;
import fr.dawan.veat.form.SearchForm;
import fr.dawan.veat.form.SignUpForm;

@Controller
//@RequestMapping("/inscription")
public class InscriptionController {

	@Autowired
	private UtilisateurDao utilisateurDao;

	@GetMapping(value = "/inscription")
	public String showInscription(Model model) {
		model.addAttribute("inscription-form", new Utilisateur());
		model.addAttribute("search-form", new SearchForm());
		return "inscription";
	}

	@PostMapping(value = "/save-inscription")
	public String saveInscription(Model model, HttpSession session,
			@Valid @ModelAttribute("inscription-form") Utilisateur u, BindingResult result) {

		{

			if (result.hasErrors()) {
				model.addAttribute("errors", result.getAllErrors());
				model.addAttribute("login-form", u);
				return "connexion";

			} else {
				System.out.println(u);
				
				utilisateurDao.insert(u);
				session.setAttribute("userName", u.getNom());
				session.setAttribute("userConnected", true);

				session.setAttribute("userRole", u.getRole().toString());
				System.out.println(">>>>>>>>>>>>>>" + (Boolean) session.getAttribute("userConnected"));
				model.addAttribute("search-form", new SearchForm());
//				ca serait plutot un get ici
				String role = (String) session.getAttribute("userRole");
				
				if(role.equals("RESTAURATEUR")) {
					model.addAttribute("search-form", new SearchForm());
					return "myrestaurant";
				}
				
				return "home";

			}

		}

		/**
		 * Avec le SignUpForm :
		 * 
		 * Utilisateur u2 = new Utilisateur(); u2.setNom = u.getNom(); etc...
		 */

	}

}
