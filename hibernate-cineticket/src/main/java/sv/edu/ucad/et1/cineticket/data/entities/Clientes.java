package sv.edu.ucad.et1.cineticket.data.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
@Access(value=AccessType.PROPERTY)
public class Clientes {
private int codcli;
	
	private String nomcli;
	private String apecli;
	private String carrcli;
	private String carcli;
	private String tipcli;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codcli", updatable=false)
	public int getCodcli() {
		return codcli;
	}
	public void setCodcli(int codcli) {
		this.codcli = codcli;
	}
	
	List<Prestamos> prestamos = new ArrayList<Prestamos>();
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="codcli", nullable=false)
	public List<Prestamos> getPrestamos(){
		return prestamos;
	}
	public void setPrestamos(List<Prestamos> prestamos){
		this.prestamos = prestamos;
	}
	
	@Column(name="nomcli", nullable=false)
	public String getNomcli() {
		return nomcli;
	}
	public void setNomcli(String nomcli) {
		this.nomcli = nomcli;
	}
	@Column(name="apecli", nullable=false)
	public String getApecli() {
		return apecli;
	}
	public void setApecli(String apecli) {
		this.apecli = apecli;
	}
	@Column(name="carrcli", nullable=false)
	public String getCarrcli() {
		return carrcli;
	}
	public void setCarrcli(String carrcli) {
		this.carrcli = carrcli;
	}
	@Column(name="carcli", nullable=false)
	public String getCarcli() {
		return carcli;
	}
	public void setCarcli(String carcli) {
		this.carcli = carcli;
	}
	@Column(name="tipcli", nullable=false)
	public String getTipcli() {
		return tipcli;
	}
	public void setTipcli(String tipcli) {
		this.tipcli = tipcli;
	}
	
	
	


}
