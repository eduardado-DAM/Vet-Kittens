package gui.view.service;

import java.awt.Image;

import javax.swing.ImageIcon;
/**
 * Clases con métodos auxiliares para cargar iconos y cambiarlos de tamaño
 * @author Eduardo
 *
 */
public class IconService {
	
	public static IconService getIconService() {
		return new IconService();
	}

	public ImageIcon reSizedIcon(Integer alto, Integer ancho, String imageName) {

		ImageIcon icon = loadImage(imageName); // load the image to a imageIcon
		Image image = icon.getImage(); // transform it
		Image newimg = image.getScaledInstance(alto, ancho, Image.SCALE_SMOOTH); // scale it the smooth way
		icon = new ImageIcon(newimg); // transform it back

		return icon;

	}

	/** Carga imágenes desde el classpath
	 * 
	 * @param imageName
	 * @return
	 */
	public ImageIcon loadImage(String imageName) {
		try {
			ClassLoader classloader = getClass().getClassLoader();
			java.net.URL url = classloader.getResource(imageName);
			if (url != null) {
				ImageIcon icon = new ImageIcon(url);
				return icon;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		throw new IllegalArgumentException("Unable to load image: " + imageName);
	}

	

}
