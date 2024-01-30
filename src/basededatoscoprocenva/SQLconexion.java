package basededatoscoprocenva;
import java.sql.Connection;

import java.sql.DriverManager;

 
public class SQLconexion {
Connection SQLconexion;
public SQLconexion(){
String host = "localhost";
String puerto = "3310";
String nameDB = "bdcoprocenva";
String usuario = "root";
String pass = "Dominic11*";
             
String driver = "com.mysql.cj.jdbc.Driver";
               
String databaseURL = "jdbc:mysql://" + host + ":" + puerto + "/" + nameDB + "?useSSL=false";
               
try{
Class.forName(driver);
SQLconexion = DriverManager.getConnection(databaseURL, usuario, pass);
System.out.println("base de datos conectada ");
} catch (Exception ex) {
           
}
}
public Connection getConectarDB() {
return SQLconexion;
}
}