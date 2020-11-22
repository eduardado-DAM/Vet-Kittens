package gui.view.window;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import gui.controller.ActionCommands;
import gui.controller.VKController;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = -74891611149663458L;

	public JPanel contentPane;

	public MainWindow(VKController controller) {

		setTitle("VetPlus");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(800,680)); //marca el tamaño preferido de la ventana
		pack(); //establece el tamaño preferido
		setResizable(false); //la ventana no puede cambiar de tamaño
		setLocationRelativeTo(null); //centra la ventana en la pantalla

		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		// carga el menú de la aplicación
		loadMenu(controller);
		// cagamos el panel principal
		controller.loadMainPanel(this, controller);
		
		revalidate();
		repaint();

	}
	
	/** Devuelve el panel padre de la ventana
	 */
	public JPanel getContentPane() {
		return contentPane;
	}


	public void loadMenu(VKController controller) {

		JMenuBar menuBar = new JMenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);
		JMenu catMenu = new JMenu("Gatos");
		JMenu appMenu = new JMenu("App");
		menuBar.add(catMenu);
		menuBar.add(appMenu);
		catMenu.setMnemonic('g');
		appMenu.setMnemonic('a');
		
		JMenuItem altaCatMenuItem = new JMenuItem("Alta Gato");
		altaCatMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.ALT_MASK));
		JMenuItem buscaCatMenuItem = new JMenuItem("Buscar Gato");
		buscaCatMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, InputEvent.ALT_MASK));
		catMenu.add(altaCatMenuItem);
		catMenu.add(buscaCatMenuItem);
		
		JMenuItem aboutMenuItem = new JMenuItem("Acerca de");
		aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, InputEvent.ALT_MASK));
		JMenuItem exitMenuItem = new JMenuItem("Salir");
		exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.ALT_MASK));
		appMenu.add(aboutMenuItem);
		
		JMenuItem menuItemLogOut = new JMenuItem("Logout");
		menuItemLogOut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, InputEvent.ALT_MASK));
		menuItemLogOut.addActionListener(controller);
		menuItemLogOut.setActionCommand(ActionCommands.LOGOUT);
		appMenu.add(menuItemLogOut);
		appMenu.add(exitMenuItem);
		
		altaCatMenuItem.addActionListener(controller);
		buscaCatMenuItem.addActionListener(controller);
		
		aboutMenuItem.addActionListener(controller);
		exitMenuItem.addActionListener(controller);
		
		altaCatMenuItem.setActionCommand(ActionCommands.ALTACAT);
		buscaCatMenuItem.setActionCommand(ActionCommands.BUSCACAT);
		
		aboutMenuItem.setActionCommand(ActionCommands.ABOUT);
		exitMenuItem.setActionCommand(ActionCommands.EXIT);
		

	}

}
