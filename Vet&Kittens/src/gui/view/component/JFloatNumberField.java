package gui.view.component;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class JFloatNumberField extends JNumberField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1006566105441726739L;
	
	
	public JFloatNumberField() {
		super();
	}


	public JFloatNumberField(Color color, Integer thick) {
		super(color, thick);
	}


	public JFloatNumberField(Color color) {
		super(color);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		char caracter = e.getKeyChar();

		if (caracter < '0' || caracter > '9') {
			if(caracter != '.') {
				e.consume();				
			}
		}
		if (getText().length() >= (super.limit + 1)) {//incluye el punto
			e.consume();
		}

	}

}
