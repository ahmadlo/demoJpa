package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Formation {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id; // Identifiant de la formation
	
	private String theme ; // Thème de la formation
	
	

	/**
	 * 
	 */
	public Formation() {
		super();
	}

	/**
	 * @param theme
	 */
	public Formation(String theme) {
		this.theme = theme;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the theme
	 */
	public String getTheme() {
		return theme;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param theme the theme to set
	 */
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	
	

}
