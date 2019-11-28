package fr.dawan.veat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ConnectionController {
    
    @RequestMapping(value = "/inscription", method = RequestMethod.GET)
    public String showInscription() {
        return "inscription";
    }
    
    @RequestMapping(value = "/connection", method = RequestMethod.GET)
    public String showConnection() {
        return "connection";
    }
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String showHome() {
        return "home";
    }
}
