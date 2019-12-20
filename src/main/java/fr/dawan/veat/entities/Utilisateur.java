package fr.dawan.veat.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;


@Entity
public class Utilisateur extends DbObject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String prenom;
	
	@NotEmpty
	private String nom;
	
	@NotEmpty
	@Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
	@Column(unique = true)
	private String email;
	
	@NotEmpty
	@Length(min = 8)
//	pwd  donc dans path il faut mettre pwd
	private String pwd;

	@Enumerated(EnumType.STRING)
	private TypeUtilisateur role;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Coordonnees coordonnees;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Coordonnees getCoordonnees() {
		return coordonnees;
	}

	public void setCoordonnees(Coordonnees coordonnees) {
		this.coordonnees = coordonnees;
	}

	public TypeUtilisateur getRole() {
		return role;
	}

	public void setRole(TypeUtilisateur role) {
		this.role = role;
	}

//	la methode toString() pour pouvoir voir l'objet dans un system.out.print();
	@Override
	public String toString() {
		return "Utilisateur [prenom=" + prenom + ", nom=" + nom + ", email=" + email + ", pwd=" + pwd + ", role=" + role
				+ ", coordonnees=" + coordonnees + "]";
	}
	

}
