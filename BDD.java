package interfacej;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;


public class BDD {

//Connexion à la BDD
public void insert(String nom, String classe, String cantine, String somme, String regimealimentaire, String jours, String DP) {
String url="jdbc:mysql://localhost/restauration?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
String user="root"; //Utilisateur de la BDD
String password =""; //Mot de passe de la BDD
//-->
String name = "'RESTAURATION'";


try {
Connection cnx = DriverManager.getConnection(url,user,password);
Statement stmt = cnx.createStatement();
//Execution des requêtes
       ResultSet rs;    
       stmt.executeUpdate("INSERT INTO reservations (nom, classe, jours, DP, regimealimentaire, somme, role)" + "VALUES ('"+nom+"','"+classe+"','"+cantine+"','"+jours+"','"+DP+"','"+regimealimentaire+"','"+somme+"'"); //Exécution de l'insertion des requêtes
       System.out.println("insertion reussie !"); //Confirmation

       //Message d'erreur
           cnx.close();
}catch (SQLException e) {
System.out.println("Une erreur est survenue lors de la connexion a la base de données");
e.printStackTrace();

}

}
}
