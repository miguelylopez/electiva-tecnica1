package sv.edu.ucad.et1.cineticket.data;

import org.hibernate.Session;

import sv.edu.ucad.et1.cineticket.data.HibernateUtil;
import sv.edu.ucad.et1.cineticket.data.entities.Editorial;

public class EstadoEditorialDemo {
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		
		Editorial nedit = createNewEditorial();
		System.out.println(sesion.contains(nedit));
		
		try{
			org.hibernate.Transaction transaction = sesion.beginTransaction();
			sesion.save(nedit);
			
			System.out.println(sesion.contains(nedit));
			
			transaction.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sesion.close();
			HibernateUtil.getSessionFactory().close();
		}
	}

	private static Editorial createNewEditorial() {
		// TODO Auto-generated method stub
		Editorial nedit = new Editorial();
		nedit.setNomedit("opp");
		nedit.setCiuedit("San Salvador");
		nedit.setPaiedit("El Salvador");
		nedit.setWebedit("www.uca.edu.sv");
		
		return nedit;
	}

}


