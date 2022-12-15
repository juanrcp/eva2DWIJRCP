package dao;

import java.sql.Date;
import java.sql.Time;
import java.time.Instant;

import javax.persistence.*;

@Entity
@Table(name="eva_tch_notas_evaluacion", schema="sc_evaluacion")
public class Alumno {
	
	//ATRIBUTOS
	@Id
	@Column(name="id_nota_evaluacion", unique=true, nullable=false)
	private int id_nota_evaluacion;
	
	@Column(name="md_uuid")
	private String md_uuid;
	
	//@Column(name="md_fch")
	//private String md_fch;
	
	@Column(name="cod_alumno")
	private String cod_alumno;
	
	@Column(name="nota_evaluacion")
	private int nota_evaluacion;
	
	@Column(name="cod_evaluacion")
	private String cod_evaluacion;
	
	//PROPIEDADES
	public int getId_nota_evaluacion() {
		return id_nota_evaluacion;
	}

	public void setId_nota_evaluacion(int id_nota_evaluacion) {
		this.id_nota_evaluacion = id_nota_evaluacion;
	}

	public String getMd_uuid() {
		return md_uuid;
	}

	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}

	//public String getMd_fch() {
	//	return md_fch;
	//}

	//public void setMd_fch(String md_fch) {
	//	this.md_fch = md_fch;
	//}

	public String getCod_alumno() {
		return cod_alumno;
	}

	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
	}

	public int getNota_evaluacion() {
		return nota_evaluacion;
	}

	public void setNota_evaluacion(int nota_evaluacion) {
		this.nota_evaluacion = nota_evaluacion;
	}

	public String getCod_evaluacion() {
		return cod_evaluacion;
	}

	public void setCod_evaluacion(String cod_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
	}

	
	//CONSTRUCTORES
	public Alumno(String cod_alumno, int nota_evaluacion, String cod_evaluacion) {
		super();
		this.cod_alumno = cod_alumno;
		this.nota_evaluacion = nota_evaluacion;
		this.cod_evaluacion = cod_evaluacion;
	}
	
	public Alumno() {
		
	}

	@Override
	public String toString() {
		return "Alumno [cod_alumno=" + cod_alumno + ", nota_evaluacion=" + nota_evaluacion + ", cod_evaluacion="
				+ cod_evaluacion + "]";
	}
	
	
	
	
}
