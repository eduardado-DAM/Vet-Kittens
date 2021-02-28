package gui.view.service;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

/**
 *  Clase que recibe un botón y lo hace crecer y cambiar de color
 *  para indicarle al usuario que puede hacer clic cuando pasa el
 *  puntero del ratón por encima
 * @author Eduardo
 *
 */
public class GrowButton extends MouseAdapter {
	private final JButton button;
	Integer ancho;
	Integer alto;
	Integer x;
	Integer y;
	Color color;

	public GrowButton(JButton button) {
		this.button = button;
		ancho = button.getSize().height;
		alto = button.getSize().width;
		x = button.getX();
		y = button.getY();
		color = button.getBackground();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		int crece = 5;
		int desplaza = 5;
		button.setBounds(x - desplaza, y - desplaza, ancho + crece, alto + crece);
		button.setBackground(Color.cyan);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		button.setBackground(color);
		button.setBounds(x, y, ancho, alto);

	}
	@Override
	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		button.setBackground(color);
		button.setBounds(x, y, ancho, alto);
	}
	
	@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseReleased(e);
			button.setBackground(color);
			button.setBounds(x, y, ancho, alto);
		}

	
}
