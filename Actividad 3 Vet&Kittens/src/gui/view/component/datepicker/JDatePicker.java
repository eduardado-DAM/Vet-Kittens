package gui.view.component.datepicker;

import java.util.Properties;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.SqlDateModel;


/** He creado esta clase para simplificar el uso del componente JDatePicker. Para usar este componente en mi App
 *  1) Cargar jdatepicker-1.3.4.jar en el classpath
 *  2) Sobre el panel, para crear un seleccionador de calendario usando esta clase usarlo así declararlo así:
 *  --> JDatePickerImpl nombreVariable = new JDatePicker().getJDatePicker();
 *  3) Esta clase se apoya en DateLabelFormatter.java, que se encuentra junto a esta clase en el mismo paquete.
 *  
 *  He preferido no hacer una clase anidada
 *  
 *  Más información del componente:
 *  
 *  https://jdatepicker.org/
 *  
 * @author Eduardo
 *
 */
public class JDatePicker{
	
	private Properties properties;
	private SqlDateModel sqlDateModel;
	private JDatePanelImpl jDatePanelImpl;
	private JDatePickerImpl jDatePickerImpl;
	private DateLabelFormatter dateLabelFormatter;
	
	public JDatePicker() {
		dateLabelFormatter = new DateLabelFormatter();
		properties = getDatePickerProperties();
		sqlDateModel = new SqlDateModel();
		jDatePanelImpl = new JDatePanelImpl(sqlDateModel, properties);
		jDatePickerImpl = new JDatePickerImpl(jDatePanelImpl, dateLabelFormatter);
	}
	
	private  Properties getDatePickerProperties() {
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		return p;
	}
	
	public JDatePickerImpl getJDatePicker() {  
		return jDatePickerImpl;
	}

}
