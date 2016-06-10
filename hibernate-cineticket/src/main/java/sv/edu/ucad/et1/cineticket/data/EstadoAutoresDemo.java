package sv.edu.ucad.et1.cineticket.data;

import org.hibernate.Session;

import sv.edu.ucad.et1.cineticket.data.entities.Autores;




public class EstadoAutoresDemo {
	
		public static void main(String[] args){
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			
			Autores auto = createNewAutores();
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

		private static Autores  createNewAutores() {
			// TODO Auto-generated method stub
			Autores auto = new Autores ();
			auto.setNomaut("Jose Arturo");
			auto.setApeaut("Aquino");
			auto.setPaiaut("El Salvador");
			auto.setWebaut("www.aquino.com");
			
			return auto;
		}
	}



