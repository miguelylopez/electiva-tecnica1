package sv.edu.ucad.et1.cineticket.data;

import org.hibernate.Session;

import sv.edu.ucad.et1.cineticket.data.entities.Catedraticos;



public class EstadoCatedraticosDemo {
	
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		
Catedraticos cat = createNewCatedraticos();
		System.out.println(sesion.contains(cat));
		
		try{
			org.hibernate.Transaction transaction = sesion.beginTransaction();
			sesion.save(cat);
			
			System.out.println(sesion.contains(cat));
			
			transaction.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sesion.close();
			HibernateUtil.getSessionFactory().close();
		}
	}

	private static Catedraticos  createNewCatedraticos() {
		// TODO Auto-generated method stub
		Catedraticos cat = new Catedraticos ();
		cat .setNomcat("Cristobal Benjamin");
		cat .setApecat("Gonzales");
		cat .setCarrcat("Ingles");
		cat .setFaccat("HUMANIDADES");
		
		return cat ;
	}

}
