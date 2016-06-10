package sv.edu.ucad.et1.cineticket.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="scompras")
public class Scompras {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codscom")
	private int codscom;
	@Column(name="fecscom")
	private String fecscom;
	@Column(name="libscom")
	private String libscom;
	@Column(name="ediscom")
	private String ediscom;
	@Column(name="carrscomp")
	private String carrscomp;
	public int getCodscom() {
		return codscom;
	}
	public void setCodscom(int codscom) {
		this.codscom = codscom;
	}
	public String getFecscom() {
		return fecscom;
	}
	public void setFecscom(String fecscom) {
		this.fecscom = fecscom;
	}
	public String getLibscom() {
		return libscom;
	}
	public void setLibscom(String libscom) {
		this.libscom = libscom;
	}
	public String getEdiscom() {
		return ediscom;
	}
	public void setEdiscom(String ediscom) {
		this.ediscom = ediscom;
	}
	public String getCarrscomp() {
		return carrscomp;
	}
	public void setCarrscomp(String carrscomp) {
		this.carrscomp = carrscomp;
	}
	
	
}
