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
import fr.dawan.veat.entities.SignUpForm;
import fr.dawan.veat.entities.Utilisateur;
@Controller
//@RequestMapping("/inscription")
public class InscriptionController {

	@Autowired
	private UtilisateurDao utilisateurDao;

	@GetMapping(value = "/inscription")
	public String showInscription(Model model) {
		model.addAttribute("inscription-form", new Utilisateur());

		return "inscription";
	}

//	@PostMapping(value = "/check-login")
	@PostMapping(value = "/save-inscription")
	public String saveInscription(Model model, HttpSession session,@Valid @ModelAttribute("inscription-form") Utilisateur u,
			BindingResult result) {
//
//		if (result.hasErrors()) {
//			model.addAttribute("errors", result.getAllErrors());
//			model.addAttribute("login-form", u);
//			return "inscription";
//
//		} else {
			System.out.println(u);
			utilisateurDao.insert(u);

			/** 
			 * Avec le SignUpForm  : 
			 * 
			 * Utilisateur u2 = new Utilisateur();
			 * u2.setNom = u.getNom();
			 * etc... 
			 * */
			
//			if (dbUser != null && dbUser.getPwd().contentEquals(u.getPwd())) {
//				session.setAttribute("userConnected", true);
//				session.setAttribute("userId", dbUser.getId());
//				session.setAttribute("userName", dbUser.getNom());
//				session.setAttribute("userRole", dbUser.getRole().toString());
//				System.out.println(">>>>>>>>>>>>>>" + (Boolean)session.getAttribute("userConnected"));
//				return "home";
//			} else {
//				model.addAttribute("msg", "Erreur d'authentification");
//				model.addAttribute("login-form", u);
//				return "connexion";
//			}
			return "inscription";

		

	}

}
