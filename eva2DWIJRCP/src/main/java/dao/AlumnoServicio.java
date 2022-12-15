package dao;

import java.util.List;

public interface AlumnoServicio {
	
	public void insertarAlumno(Alumno alumno);
	public List<Alumno> buscarTodosCodAlumno(String CodAlumno);
	public List<Alumno> buscarTodosEvaluacion(String evaluacion);

}
