package sv.edu.ucad.et1.cineticket.data;

import java.util.Date;

import org.hibernate.Session;

import sv.edu.ucad.et1.cineticket.data.entities.Biblio;

public class EstadoBiblioDemo {
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		
		Biblio bib = createNewBiblio();
		System.out.println(sesion.contains(bib));
		
		try{
			org.hibernate.Transaction transaction = sesion.beginTransaction();
			sesion.save(bib);
			
			System.out.println(sesion.contains(bib));
			
			transaction.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sesion.close();
			HibernateUtil.getSessionFactory().close();
		}
	}



	private static Biblio createNewBiblio() {
		// TODO Auto-generated method stub
		Biblio bib = new Biblio();
		bib.setEdibib("Edicion5");
		bib.setFpubib(new Date(25-6-2016));
		bib.setIsbbib(2566);
		bib.setEjbib(4);
		bib.setVolbib(1);
		bib.setPagbib(200);
		bib.setTitbib("java");
		bib.setCvñbib("azul");
		bib.setDewbib("mtu2");
		bib.setCuttbib("102jk");
		bib.setUbibib("Estante1");
		bib.setViadbib("compra");
	
		
		return bib;
	}

}
