package sv.edu.ucad.et1.cineticket.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="catedraticos")
public class Catedraticos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codcat")
	private int codcat;
	@Column(name="nomcat")
	private String nomcat;
	@Column(name="apecat")
	private String apecat;
	@Column(name="carrcat")
	private String carrcat;
	@Column(name="faccat")
	private String faccat;
	public int getCodcat() {
		return codcat;
	}
	public void setCodcat(int codcat) {
		this.codcat = codcat;
	}
	public String getNomcat() {
		return nomcat;
	}
	public void setNomcat(String nomcat) {
		this.nomcat = nomcat;
	}
	public String getApecat() {
		return apecat;
	}
	public void setApecat(String apecat) {
		this.apecat = apecat;
	}
	public String getCarrcat() {
		return carrcat;
	}
	public void setCarrcat(String carrcat) {
		this.carrcat = carrcat;
	}
	public String getFaccat() {
		return faccat;
	}
	public void setFaccat(String faccat) {
		this.faccat = faccat;
	}
	
	

}
