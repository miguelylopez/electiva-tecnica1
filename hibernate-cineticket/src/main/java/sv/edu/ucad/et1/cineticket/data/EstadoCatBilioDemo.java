package sv.edu.ucad.et1.cineticket.data;

import org.hibernate.Session;

import sv.edu.ucad.et1.cineticket.data.entities.Catbibliografia;


public class EstadoCatBilioDemo {
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		
		Catbibliografia usuario = createNewCatbibliografia();
		System.out.println(sesion.contains(usuario));
		
		try{
			org.hibernate.Transaction transaction = sesion.beginTransaction();
			sesion.save(usuario);
			
			System.out.println(sesion.contains(usuario));
			
			transaction.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sesion.close();
			HibernateUtil.getSessionFactory().close();
		}
	}

	private static Catbibliografia createNewCatbibliografia() {
		// TODO Auto-generated method stub
		Catbibliografia usuario = new Catbibliografia();
		usuario.setDescbi("Libro de Diseño Grafico ");
		usuario.setNomcbi("Java Server Face");
		
		
		return usuario;
	}


}
