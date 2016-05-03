package sv.edu.ucad.et1.cineticket.data;


import org.hibernate.Session;

import sv.edu.ucad.et1.cineticket.data.entities.Usuarios;



public class DemoPersistUsuarios {
	
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		sesion.getTransaction().begin();
		
		//instancia de la clase entidad usuarios
		Usuarios usuario = new Usuarios();
		
		//uso de los metodos para asignar valores a las propiedades

		usuario.setNomusu("Miguel Yonathan");
		usuario.setApeusu("Gonzalez Lopez");
		usuario.setNivusu("1");
		usuario.setClavusu("Ucad123$");
		usuario.setCarusu("administrador");
		usuario.setMailusu("miguel_glopez@yahoo.com");
	
		
		//metodo de persistencia para guardar la data
		sesion.save(usuario);
		//metodo para confirmar la transaccion
		sesion.getTransaction().commit();
		
		//codigo para probar la propiedad updatable
		
		//sesion.beginTransaction();
		//Usuarios usuUpdatable = (Usuarios) sesion.get(Usuarios.class, usuario.getCodusu());
		//usuUpdatable.setNomusu("Cristobal Antonio");
		//sesion.update (usuUpdatable);
		//sesion.getTransaction().commit();
		//fin de la prueba de la propiedad.
		
		//cierre de la sesion acttiva
		sesion.close();
	}//fin del metodo main
	
}//fin del metodo DemoPersistUsuarios
