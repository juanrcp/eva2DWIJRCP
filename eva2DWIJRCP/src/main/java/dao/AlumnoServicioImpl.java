package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class AlumnoServicioImpl implements AlumnoServicio{

	@PersistenceContext
	private EntityManager em;
		
	public void insertarAlumno(Alumno pedido) {
		em.persist(pedido);
	}
		
	public List<Alumno> buscarTodosCodAlumno(String cod_alumno) {
		return em.createQuery("SELECT alumnosCod FROM Alumno WHERE cod_alumno='" + cod_alumno + "' alumnosCod").getResultList();
	}
	
	public List<Alumno> buscarTodosEvaluacion(String cod_evaluacion){
		return em.createQuery("SELECT alumnosEva FROM Alumno WHERE cod_alumno='" + cod_evaluacion + "' alumnosEva").getResultList();
	}
}
