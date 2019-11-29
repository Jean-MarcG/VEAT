package fr.dawan.veat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/connection")
public class ConnectionController {

	
	@GetMapping("")
	public String showConnection() {
		return "connection";
	}
}
