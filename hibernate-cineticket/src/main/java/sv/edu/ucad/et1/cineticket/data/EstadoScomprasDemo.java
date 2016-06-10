package sv.edu.ucad.et1.cineticket.data;

import java.util.Date;

import org.hibernate.Session;

import sv.edu.ucad.et1.cineticket.data.entities.Scompras;

public class EstadoScomprasDemo {
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		
		Scompras clientes = createNewScompras ();
		System.out.println(sesion.contains(clientes));
		
		try{
			org.hibernate.Transaction transaction = sesion.beginTransaction();
			sesion.save(clientes);
			
			System.out.println(sesion.contains(clientes));
			
			transaction.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sesion.close();
			HibernateUtil.getSessionFactory().close();
		}
	}

	private static Scompras  createNewScompras () {
		// TODO Auto-generated method stub
		Scompras  clientes = new Scompras();
		clientes.setFecscom(new Date(25-6-2016));
		clientes.setLibscom("Lopez");
		clientes.setEdiscom("Sistemas");
		clientes.setCarrscomp("Sistemas");
		
		return clientes;
	}

}
