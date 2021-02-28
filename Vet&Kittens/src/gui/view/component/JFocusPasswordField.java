package gui.view.component;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JPasswordField;
import javax.swing.border.Border;

public class JFocusPasswordField extends JPasswordField implements FocusListener{
	private static final long serialVersionUID = 5027509506223050510L;
	private Border defaultBorder;
	private Border focusedBorder;
	

	public JFocusPasswordField(Color color) {
		super();
		defaultBorder = getBorder();
		focusedBorder = BorderFactory.createLineBorder(color,3);
		addFocusListener(this);
	}

	@Override
	public void focusGained(FocusEvent e) {
		setBorder(focusedBorder);
	}

	@Override
	public void focusLost(FocusEvent e) {
		setBorder(defaultBorder);
	}

}
