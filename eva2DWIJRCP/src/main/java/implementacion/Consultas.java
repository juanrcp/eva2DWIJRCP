package implementacion;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import dao.Alumno;
import dao.AlumnoServicioImpl;

	
@Component
public class Consultas{

	@Autowired
	private AlumnoServicioImpl ali;
		
	@Transactional
	public void insertarAlumno(Alumno alumno) {
		ali.insertarAlumno(alumno);
	}
	
	@Transactional
	public void insertarListaPedidos(Collection<Alumno> colAlumnos) {
		for (Alumno Alumno : colAlumnos) {
			ali.insertarAlumno(Alumno);
		}
	}
	
	@Transactional
	public List<Alumno> buscarTodosCodAlumno(Alumno al) {
		
		return ali.buscarTodosCodAlumno(al.getCod_alumno());
	}
	
	@Transactional
	public List<Alumno> buscarTodosEvaluacion(Alumno al) {
		
		return ali.buscarTodosCodAlumno(al.getCod_evaluacion());
	}
		
}
