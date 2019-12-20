package fr.dawan.veat.form;

import fr.dawan.veat.entities.Utilisateur;

public class SignUpForm extends Utilisateur{
	public String confirmPwd;

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}

	@Override
	public String toString() {
		return "SignUpForm [confirmPwd=" + confirmPwd + super.toString() + "]";
	}


	
}
