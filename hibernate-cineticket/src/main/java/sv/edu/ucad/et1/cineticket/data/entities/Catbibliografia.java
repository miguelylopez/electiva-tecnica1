package sv.edu.ucad.et1.cineticket.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="catbibliografia")
public class Catbibliografia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codcbi")
	private int codcbi;
	@Column(name="nomcbi")
	private String nomcbi;
	@Column(name="descbi")
	private String descbi;
	public int getCodcbi() {
		return codcbi;
	}
	public void setCodcbi(int codcbi) {
		this.codcbi = codcbi;
	}
	public String getNomcbi() {
		return nomcbi;
	}
	public void setNomcbi(String nomcbi) {
		this.nomcbi = nomcbi;
	}
	public String getDescbi() {
		return descbi;
	}
	public void setDescbi(String descbi) {
		this.descbi = descbi;
	}
	

}
