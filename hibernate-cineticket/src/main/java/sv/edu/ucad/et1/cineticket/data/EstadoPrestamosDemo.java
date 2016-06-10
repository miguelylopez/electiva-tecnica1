package sv.edu.ucad.et1.cineticket.data;

import java.util.Date;

import org.hibernate.Session;

import sv.edu.ucad.et1.cineticket.data.entities.Prestamos;

public class EstadoPrestamosDemo {
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		
		Prestamos auto = createNewPrestamos();
		System.out.println(sesion.contains(auto));
		
		try{
			org.hibernate.Transaction transaction = sesion.beginTransaction();
			sesion.save(auto);
			
			System.out.println(sesion.contains(auto));
			
			transaction.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sesion.close();
			HibernateUtil.getSessionFactory().close();
		}
	}

	private static Prestamos  createNewPrestamos() {
		// TODO Auto-generated method stub
		Prestamos auto = new Prestamos ();
		auto.setDocpres("Dui");
		auto.setDurpres("1 Hora");
		auto.setFecdev(new Date(2016-05-15));
		
		return auto;
	}

}
