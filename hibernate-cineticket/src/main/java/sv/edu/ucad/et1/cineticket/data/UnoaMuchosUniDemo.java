package sv.edu.ucad.et1.cineticket.data;

import java.util.Date;

import org.hibernate.Session;

import sv.edu.ucad.et1.cineticket.data.entities.Clientes;
import sv.edu.ucad.et1.cineticket.data.entities.Prestamos;

public class UnoaMuchosUniDemo {
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		try{
			org.hibernate.Transaction transaccion = sesion.beginTransaction();
			
			Clientes Clientes = createNuevaCliente();
			Clientes.getPrestamos().add(createNuevaPrestamosImax());
			Clientes.getPrestamos().add(createNuevaPrestamosStandard());
			
			sesion.save(Clientes);
			
			transaccion.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sesion.close();
			HibernateUtil.getSessionFactory().close();
		}
		
	}
		
private static Clientes createNuevaCliente(){
	Clientes clientes = new Clientes();
	clientes.setNomcli("Adilio");
	clientes.setApecli("Rodriguez");
	clientes.setCarrcli("Sistemas");
	clientes.setCarcli("RG11002");
	clientes.setTipcli("Estudiante");
	
	return clientes;
	
}
	//fin de createNuevaCliente
	
	private static Prestamos createNuevaPrestamosImax(){
		Prestamos cnPrestamosImax = new Prestamos();
		cnPrestamosImax.setDocpres("Carnet");
		cnPrestamosImax.setDurpres("2 horas ");
		cnPrestamosImax.setFecdev(new Date(16-5-2016));
		return cnPrestamosImax;
	}
	
	private static Prestamos createNuevaPrestamosStandard(){
		Prestamos cnPrestamosStd = new Prestamos();
		cnPrestamosStd.setDocpres("Dui");
		cnPrestamosStd.setDurpres("3 Dias");
		cnPrestamosStd.setFecdev(new Date(2016-05-16));
		return cnPrestamosStd;
	}
		
		
	}