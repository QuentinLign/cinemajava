package restauration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;


public class BDD {
//Connexion à la BDD
public void insert(String nom) {
String url="jdbc:mysql://localhost/restauration?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
String user="root";
String password ="";
//-->
String name = "'CINEMA'";


try {
Connection cnx = DriverManager.getConnection(url,user,password);
Statement stmt = cnx.createStatement();
//Execution des requêtes
       ResultSet rs;    
       stmt.executeUpdate("INSERT INTO reservations (nom, jours, DP, regimealimentaire, somme)" + "VALUES ('"+nom+"'");
       System.out.println("insertion reussie !");

       //Message d'erreur
           cnx.close();
}catch (SQLException e) {
System.out.println("Une erreur est survenue lors de la connexion a la base de données");
e.printStackTrace();

}

}
}
