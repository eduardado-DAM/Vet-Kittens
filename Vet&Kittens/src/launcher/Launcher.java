package launcher;

import java.awt.EventQueue;

import gui.controller.VKController;
import gui.view.window.MainWindow;

public class Launcher {
	
	
	public static void main(String[] args) {

			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						System.out.println("User: Blas");
						System.out.println("Password: 1234");
						VKController controller = new VKController();
						MainWindow mainWindow = controller.createMainWindow();
						controller.setMainWindow(mainWindow);
						mainWindow.setVisible(true);
						controller.loadLoginWindow();
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	}

}
