package gui.view.component;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



/** Limita la introducción de caracteres
 * - Sólo acepta dígitos
 * - Por defecto sólo permite 10 dígitos
 * - Se puede cambiar el limite usando setLimit()
 * - Hereda de JFocusField
 * 
 * @author Eduardo
 *
 */
public class JNumberField extends JFocusField implements KeyListener {
	private static final long serialVersionUID = 1701096885508662502L;

	private Float number;
	protected Integer limit ; 

	public JNumberField() {
		super();
		addKeyListener(this);
		limit = 10;
	}
	
	//constructores de la super clase JFocusField
	public JNumberField(Color color) {
		super(color);
		addKeyListener(this);
		limit = 10;
	}
	public JNumberField(Color color, Integer thick) {
		super(color,thick);
		addKeyListener(this);
		limit = 10;
	}


	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Float getNumber() {
		return number;
	}

	public void setNumber(Float number) {
		this.number = number;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char caracter = e.getKeyChar();

		
		if (caracter < '0' || caracter > '9' ) {
			e.consume(); 
		}
		if(getText().length() >= limit) {
			e.consume();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
