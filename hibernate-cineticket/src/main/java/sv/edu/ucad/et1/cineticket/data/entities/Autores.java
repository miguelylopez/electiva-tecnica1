package sv.edu.ucad.et1.cineticket.data.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="autores")

public class Autores {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codaut")
	private int codaut;
	@Column(name="nomaut")
	private String nomaut;
	@Column(name="apeaut")
	private String apeaut;
	@Column(name="paiaut")
	private String paiaut;
	@Column(name="webaut")
	private String webaut;
	public int getCodaut() {
		return codaut;
	}
	public void setCodaut(int codaut) {
		this.codaut = codaut;
	}
	public String getNomaut() {
		return nomaut;
	}
	public void setNomaut(String nomaut) {
		this.nomaut = nomaut;
	}
	public String getApeaut() {
		return apeaut;
	}
	public void setApeaut(String apeaut) {
		this.apeaut = apeaut;
	}
	public String getPaiaut() {
		return paiaut;
	}
	public void setPaiaut(String paiaut) {
		this.paiaut = paiaut;
	}
	public String getWebaut() {
		return webaut;
	}
	public void setWebaut(String webaut) {
		this.webaut = webaut;
	}
	
	
}
