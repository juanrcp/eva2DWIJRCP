package controlador;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.Alumno;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory miFactory = new Configuration().configure("contexto.xml").addAnnotatedClass(Alumno.class).buildSessionFactory();
		Session miSession = miFactory.openSession();
		
		
		try {
			
			//Mostrar lista - No conseguido
			//System.out.println(miSession.get(Alumno.class, "JRCP"));
			
			//INSERCION
			//Insertamos el Alumno que queramos con su nota y en la evaluacion donde la consiguio. 
			Alumno alumno = new Alumno("JRO", 5, "PR");
			
			//Abrimos transaccion
			miSession.beginTransaction();
			//Guardamos alumno en la BBDD virtual
			miSession.save(alumno);
			System.out.println("Empezando a insertar");
			//Pasamos los cambios a la BBDD "fisica" con un commit
			miSession.getTransaction().commit();
			
			System.out.println("Insertado");
		}
		finally {
			//Cerramos sesiones
			miSession.close();
			miFactory.close();
		}

	}

}
