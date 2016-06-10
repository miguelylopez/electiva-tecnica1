package sv.edu.ucad.et1.cineticket.data.entities;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="prestamos")
@Access(value=AccessType.PROPERTY)
public class Prestamos {
	
	private int codpres;
	private String docpres;
	private String durpres;
	private Date fecdev;
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	
	@Column(name="codpres", updatable=false)
	public int getCodpres() {
		return codpres;
	}
	public void setCodpres(int codpres) {
		this.codpres = codpres;
	}
	@Column(name="docpres", nullable=false)
	public String getDocpres() {
		return docpres;
	}
	public void setDocpres(String docpres) {
		this.docpres = docpres;
	}
	@Column(name="durpres", nullable=false)
	public String getDurpres() {
		return durpres;
	}
	public void setDurpres(String durpres) {
		this.durpres = durpres;
	}
	@Column(name="fecdev", nullable=false)
	public Date getFecdev() {
		return fecdev;
	}
	public void setFecdev(Date fecdev) {
		this.fecdev = fecdev;
	}
	
	

}
