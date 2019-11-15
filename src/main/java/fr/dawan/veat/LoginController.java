package fr.dawan.veat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	
	@RequestMapping(value = "/inscription", method = RequestMethod.GET)
	public String showInscription() {
		return "inscription";
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showHome() {
		return "home";
	}
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String showContact() {
		return "contact";
	}
}
