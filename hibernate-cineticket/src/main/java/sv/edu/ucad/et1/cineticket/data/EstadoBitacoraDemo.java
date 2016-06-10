package sv.edu.ucad.et1.cineticket.data;

import java.util.Date;

import org.hibernate.Session;

import sv.edu.ucad.et1.cineticket.data.entities.Bitacora;

public class EstadoBitacoraDemo {
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		
		Bitacora bit = createNewBitacora();
		System.out.println(sesion.contains(bit));
		
		try{
			org.hibernate.Transaction transaction = sesion.beginTransaction();
			sesion.save(bit);
			
			System.out.println(sesion.contains(bit));
			
			transaction.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sesion.close();
			HibernateUtil.getSessionFactory().close();
		}
	}

	private static Bitacora createNewBitacora() {
		// TODO Auto-generated method stub
		Bitacora bit = new Bitacora();
		bit.setMotbib("SegumientoSugerencias");
		bit.setFecbit(new Date(25-6-2016));
		
		
		
		return bit;
	}



}
