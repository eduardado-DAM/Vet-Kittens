package data.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import data.database.mariaDBuser.MariaDBUser;

public class ConnectionProvider {
	

	/** Rellena la URL de conexión con mariaDB
	 * 
	 * @param ip
	 * @param port
	 * @param databaseName
	 * @return
	 */
	public static String fillDataBaseUrl(String ip, String port, String databaseName) {
		return "jdbc:mariadb://".concat(ip).concat(":").concat(port).concat("/").concat(databaseName);
	}

	/** Devuelve un Connection usando la clase MariaDBUser
	 * @param mariaUser
	 * @return
	 * @throws SQLException 
	 */
	public static Connection getMariaConnection() throws SQLException {
		Connection con = null;
		MariaDBUser mariaDBUser;
		
		mariaDBUser = MariaDBUser.loadMariaDBUserFromProperties(); 

		
		String user = mariaDBUser.getUser();
		String password = mariaDBUser.getPassword();
		String ip = mariaDBUser.getIp();
		String port = mariaDBUser.getPort();
		String dbName = mariaDBUser.getDbName();

		String databaseURL = fillDataBaseUrl(ip, port, dbName);

		try {
			con = DriverManager.getConnection(databaseURL, user, password);
			
			System.out.println("Conexión establecida correctamente");
		} catch (SQLException e) {
			System.err.println("ERROR al conectar con la BD" + e.getMessage());
			throw e; //lanza la excepción para poder controlarla desde otra capa
		}

		return con;

	}
	
	
	
	
	
	
	@Deprecated
	public static Connection getNewMariaDBConnection() {
		Connection con = null;

		String user = "eduardado";
		String password = "eduardado";
		String ip = "localhost";
		String port = "3306";
		String dbName = "edusoft";

		String databaseURL = fillDataBaseUrl(ip, port, dbName);

		try {
			//no es necesario cargar la clase
			//Class.forName(driverClass);
			con = DriverManager.getConnection(databaseURL, user, password);
			System.out.println("Conexión establecida correctamente");
		} catch (SQLException e) {
			System.err.println("ERROR al conectar con la BD" + e.getMessage());
		}

		return con;
	}
}
