package sv.edu.ucad.et1.cineticket.data.entities;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bitacora")
public class Bitacora {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codbit")
	private int codbit;
	@Column(name="fecbit")
	private Date fecbit;
	@Column(name="motbit")
	private String motbib;
	public int getCodbit() {
		return codbit;
	}
	public void setCodbit(int codbit) {
		this.codbit = codbit;
	}
	public Date getFecbit() {
		return fecbit;
	}
	public void setFecbit(Date fecbit) {
		this.fecbit = fecbit;
	}
	public String getMotbib() {
		return motbib;
	}
	public void setMotbib(String motbib) {
		this.motbib = motbib;
	}
	

	

}
