package gui.view.component;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.Border;


/** Componente personalizado para mostrar al usuario donde se encuentra
 * Se puede cambiar tanto el color como el grosor del borde usando
 * tanto constructores como métodos de la clase
 * 
 * @author Eduardo
 *
 */
public class JFocusField extends JTextField implements FocusListener{
	private static final long serialVersionUID = 3195320963820527998L;

	private Border defaultBorder;
	private Border focusedBorder;
	private Color focusBoderColor;
	private Integer borderThick;
	
	/** Configura un borde verde oscuro standard
	 * 
	 */
	public JFocusField() {
		defaultBorder = getBorder();
		focusBoderColor = new Color(0,128,128); //color del focus por defecto
		borderThick = 3; //grosor del borde del focus por defecto
		focusedBorder = BorderFactory.createLineBorder(focusBoderColor,borderThick);
		addFocusListener(this);
	}
	
	/** Permite crear el componente con focus de otro color
	 * 
	 * @param focusBorderColor
	 */
	public JFocusField(Color focusBorderColor) {
		defaultBorder = getBorder();
		this.focusBoderColor = focusBorderColor;
		borderThick = 3;
		focusedBorder = BorderFactory.createLineBorder(focusBoderColor,borderThick);
		addFocusListener(this);
	}
	
	/** Permite crear componente con focus de un color y anchura a elección
	 * 
	 * @param focusBorderColor
	 * @param borderThick
	 */
	public JFocusField(Color focusBorderColor, Integer borderThick) {
		defaultBorder = getBorder();
		this.focusBoderColor = focusBorderColor;
		this.borderThick = borderThick;
		focusedBorder = BorderFactory.createLineBorder(focusBoderColor,borderThick);
		addFocusListener(this);
	}
	
	/** Cambia el color del focus
	 * 
	 * @param color
	 */
	public void setFocusBorderColor(Color color) {
		focusedBorder = BorderFactory.createLineBorder(color,borderThick);
	}
	
	/** Cambiar el grosor del borde
	 * 
	 * @param thick
	 */
	public void setFocusBorderThick(Integer thick) {
		focusedBorder = BorderFactory.createLineBorder(focusBoderColor,thick);
	}
	
	/**
	 * Cambia el borde cuando el campo gana focus
	 */
	@Override
	public void focusGained(FocusEvent e) {
		setBorder(focusedBorder);
	}

	/** Devuelve el borde a su estado inicial
	 * 
	 */
	@Override
	public void focusLost(FocusEvent e) {
		setBorder(defaultBorder);
	}

}
