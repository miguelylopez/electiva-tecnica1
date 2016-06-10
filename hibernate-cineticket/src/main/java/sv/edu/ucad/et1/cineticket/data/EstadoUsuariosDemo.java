package sv.edu.ucad.et1.cineticket.data;

import org.hibernate.Session;

import sv.edu.ucad.et1.cineticket.data.HibernateUtil;
import sv.edu.ucad.et1.cineticket.data.entities.Usuarios;

public class EstadoUsuariosDemo {
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		
		Usuarios usuario = createNewUsuarios();
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

	private static Usuarios createNewUsuarios() {
		// TODO Auto-generated method stub
		Usuarios usuario = new Usuarios();
		usuario.setNomusu("Katherine");
		usuario.setApeusu("De Rodriguez");
		usuario.setNivusu("0");
		usuario.setClavusu("1234");
		usuario.setCarusu("Barrendera");
		usuario.setMailusu("katdrodri@gmail.com");
		
		return usuario;
	}


}
