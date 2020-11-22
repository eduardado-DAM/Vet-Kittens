package data.model.cat;

import java.sql.Date;

public class Cat {
	Integer id;
	Long chipSerial;
	String name;
	Double weight;
	Date dob;
	Date vaccineA; // SQL DATE

	public Cat() {
		super();
	}

	public Cat(Integer id, Long chipSerial, String name, Double weight, Date dob, Date vaccineA) {
		super();
		this.id = id;
		this.chipSerial = chipSerial;
		this.name = name;
		this.weight = weight;
		this.dob = dob;
		this.vaccineA = vaccineA;
	}

	public Date getDob() {
		return dob;
	}

	public Integer getId() {
		return id;
	}

	public Long getChipSerial() {
		return chipSerial;
	}

	public String getName() {
		return name;
	}

	public Double getWeight() {
		return weight;
	}

	public Date getVaccineA() {
		return vaccineA;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setChipSerial(Long chipSerial) {
		this.chipSerial = chipSerial;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public void setVaccineA(Date vaccineA) {
		this.vaccineA = vaccineA;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", chipSerial=" + chipSerial + ", name=" + name + ", weight=" + weight + ", dob=" + dob + ", vaccineA="
				+ vaccineA + "]";
	}

	/** Genera información sobre el objeto un un String con etiquetas html
	 *  que puede ser volcado den JLabels
	 * 
	 * @return
	 */
	public String getHtmlString() {
																					// @formater:off
		String labelText = "<html>" 				 								// @formater:off
				+ "<h3>Introducing new cat data</p>" 								// @formater:off
				+ "<p style=\"font-size:80%;\">Chip Serial: " + chipSerial + "</p>" // @formater:off
				+ "<p style=\"font-size:80%;\">Name: " + name + "</p>" 				// @formater:off
				+ "<p style=\"font-size:80%;\">Weight: " + weight + "</p>" 			// @formater:off
				+ "<p style=\"font-size:80%;\">Dob: " + dob + "</p>" 				// @formater:off
				+ "<p style=\"font-size:80%;\">VaccineA Date: " + vaccineA + "</p>" // @formater:off
				+ "</html>";
		return labelText;

	}

}
