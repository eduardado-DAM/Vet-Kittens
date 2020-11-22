package logic;

import java.sql.SQLException;
import java.util.List;

import data.model.cat.Cat;
import data.model.login.Login;
import gui.view.component.JFocusField;
import gui.view.component.JFocusPasswordField;
import logic.service.exception.AccessDeniedException;

public interface iCatService {
	
	
	/**  Permite obtener registros filtrados por 0 o varios campos y sus valores
	 *   Todos pueden ser null o cadenas vacías, lo que hará que no se filtren 
	 *   por dichos campos
	 * @param id 
	 * @param chipSerial
	 * @param name
	 * @param weight
	 * @param age
	 * @param vaccineA
	 * @return
	 */
	public List<Cat> queryCatTable(String id, String chipSerial, String name, String weight, String age, String vaccineA) throws SQLException;
	
	/** Inserta los datos de obj Cat en la tabla Cat de la base de datos
	 * 
	 * @param cat
	 * @return 1 si la inserción es correcta o 0 si es incorrecta
	 * @throws SQLException 
	 */
	public Integer insertCat(Cat cat) throws SQLException;
	
	
	/** Crea un objeto Login con los input del usuario
	 * 
	 * @param user un JFocusField con los datos de usuario
	 * @param password un JFocusField con los datos de password
	 * @return
	 */
	public Login retrieveLogin(JFocusField user, JFocusPasswordField password);
	
	/** Cruza los datos de un login con la base de datos
	 * 
	 * @return TRUE si coincide con la base de datos FALSE en caso contrario
	 * @throws AccessDeniedException 
	 * @throws SQLException 
	 */
	public void checkPassword(Login login) throws AccessDeniedException, SQLException;
	
	

}
