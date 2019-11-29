package fr.dawan.veat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import fr.dawan.veat.entities.Utilisateur;


public class InscriptionDAO {

    public static int inscription(Utilisateur u, Connection cnx, boolean closeCnx) throws Exception {
        String sql = "INSERT INTO t_utilisateurs(nom,prenom,email,pwd) VALUES(?,?,?,?)";
        PreparedStatement ps = cnx.prepareStatement(sql);
        ps.setString(1,u.getNom());
        ps.setString(1,u.getPrenom());
        ps.setString(2,u.getEmail());
        ps.setString(3,u.getPwd());

        int res = ps.executeUpdate();
        if (closeCnx)
                cnx.close();
        return res;
}
	
}
