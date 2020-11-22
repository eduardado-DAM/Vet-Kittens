package gui.view.window;


import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.controller.ActionCommands;
import gui.controller.VKController;
import gui.view.component.BasicButton;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.GridLayout;
/* Hereda de JDialog para poder hacer la ventana modal
 * 
 */
public class AboutWindow extends JDialog implements KeyListener{
	private static final long serialVersionUID = 5462378544286774093L;
	
	private JPanel contentPane;
	

	public AboutWindow(VKController controller) {
		addKeyListener(this);
		setModal(true); //ventana modal
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		
		JLabel lbEdusoft = new JLabel("Edusoft SL Vet & Kittens");
		lbEdusoft.setBackground(SystemColor.textHighlight);
		lbEdusoft.setOpaque(true);
		lbEdusoft.setFont(new Font("Miriam Libre", Font.ITALIC, 25));
		lbEdusoft.setHorizontalAlignment(SwingConstants.CENTER);
		lbEdusoft.setBounds(0, 0, 444, 65);
		contentPane.add(lbEdusoft);
		
		BasicButton bbOpenSource = new BasicButton(Color.orange,"An open source project", controller);
		bbOpenSource.setActionCommand(ActionCommands.VISIT_GITHUB);
		contentPane.add(bbOpenSource);
		

		BasicButton bbVisit = new BasicButton(Color.orange,"VISIT OUR WEBSITE! :)", controller);
		bbVisit.setActionCommand(ActionCommands.VISIT_EDU);
		contentPane.add(bbVisit);
	}


	@Override
	public void keyTyped(KeyEvent e) {
	}


	@Override
	public void keyPressed(KeyEvent e) {

		if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			dispose();
		}
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
