package fr.dawan.veat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fr.dawan.veat.dao.UtilisateurDao;

import fr.dawan.veat.entities.TypeUtilisateur;
import fr.dawan.veat.entities.Utilisateur;

@Controller
public class TestDataController {

	@Autowired
	private UtilisateurDao utilisateurDao;

	public void setUtilisateurDao(UtilisateurDao utilisateurDao) {
		this.utilisateurDao = utilisateurDao;
	}

	@GetMapping(value = "/insert-data")
	public String insertData() {
		Utilisateur u1 = new Utilisateur();
		u1.setNom("user1");
		u1.setPrenom("toto");
		u1.setEmail("user1@dawan.fr");
		u1.setPwd("user1234");
		u1.setRole(TypeUtilisateur.ADMIN);
		utilisateurDao.insert(u1);
		return "home";
	}
	

}
