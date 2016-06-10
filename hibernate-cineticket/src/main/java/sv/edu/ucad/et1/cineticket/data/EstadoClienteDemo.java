package sv.edu.ucad.et1.cineticket.data;

import org.hibernate.Session;

import sv.edu.ucad.et1.cineticket.data.entities.Clientes;


public class EstadoClienteDemo {
	
	


	
		public static void main(String[] args){
			Session sesion = HibernateUtil.getSessionFactory().openSession();
			
			Clientes clientes = createNewCliente();
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

		private static Clientes createNewCliente() {
			// TODO Auto-generated method stub
			Clientes clientes = new Clientes();
			clientes.setNomcli("Jonathan");
			clientes.setApecli("Lopez");
			clientes.setCarrcli("Sistemas");
			clientes.setCarcli("GL12002");
			clientes.setTipcli("Estudiante");
			
			return clientes;
		}

	}


