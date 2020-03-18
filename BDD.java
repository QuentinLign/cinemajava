package cinema;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;


public class BDD {
//Connexion à la BDD
public void insert(String Etudiant) {
String url="jdbc:mysql://localhost/cinema?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
String user="root";
String password ="";
//-->
String nom = "'CINEMA'";


try {
Connection cnx = DriverManager.getConnection(url,user,password);
Statement stmt = cnx.createStatement();
//Execution des requêtes
       ResultSet rs;    
       stmt.executeUpdate("INSERT INTO reservations (numero_salle, film, etudiant, dixans, navigo, pleintarif)" + "VALUES ('"+Etudiant+"'");
       System.out.println("insertion reussie !");

       //Message d'erreur
           cnx.close();
}catch (SQLException e) {
System.out.println("Une erreur est survenue lors de la connexion a la base de données");
e.printStackTrace();

}

}
}