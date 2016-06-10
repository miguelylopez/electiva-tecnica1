package sv.edu.ucad.et1.cineticket.data;


import java.util.Date;

import org.hibernate.Session;

import sv.edu.ucad.et1.cineticket.data.entities.Biblio;
import sv.edu.ucad.et1.cineticket.data.entities.Editorial;



public class UnoaUno {
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		
		//inicio de la transaccion
		try{
			org.hibernate.Transaction transaccion = sesion.beginTransaction();
		
			Editorial edit = createNewEditorial();
			Biblio bib = createNewBiblio(edit);

			sesion.save(bib);
			transaccion.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sesion.close();
			HibernateUtil.getSessionFactory().close();
		}
		
	}
	
	//clases empotradas que crean usuarios y deptos
	//crea un nuevo usuario
	
	private static Biblio createNewBiblio(Editorial edit) {
		Biblio bib = new Biblio();
		bib.setEdibib("Edicion3");
		bib.setFpubib(new Date(25-6-2016));
		bib.setIsbbib(2566);
		bib.setEjbib(4);
		bib.setVolbib(1);
		bib.setPagbib(200);
		bib.setTitbib("java");
		bib.setCvñbib("Azul");
		bib.setDewbib("mtu2");
		bib.setCuttbib("1020k");
		bib.setUbibib("medio");
		bib.setViadbib("compra");
		bib.setEdit(edit);
		
		
		return bib;
	}
	
	
	private static Editorial createNewEditorial() {
		Editorial nedit = new Editorial();
		nedit.setNomedit("Som merville");
		nedit.setCiuedit("Guatemala");
		nedit.setPaiedit("Guatemala");
		nedit.setWebedit("www.ucad.edu.sv");
		
		return nedit;
	}

}
