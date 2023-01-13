package mx.edu.uacm.xml.dom.historial.bean;

import org.w3c.dom.Node;

public class EstudianteBean {
	
	String matricula;
	String licenciatura;
	String plantel;
	
	String apellidoPaterno;
	String apellidoMaterno;
	String nombre;
	
	String correoInstitucional;
	
	int semestre;

    
	
	@Override
	public String toString() {
		return "EstudianteBean [matricula=" + matricula + ", licenciatura=" + licenciatura + ", plantel=" + plantel
				+ ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", nombre=" + nombre
				+ ", correoInstitucional=" + correoInstitucional + ", semestre=" + semestre + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getLicenciatura() {
		return licenciatura;
	}

	public void setLicenciatura(String licenciatura) {
		this.licenciatura = licenciatura;
	}

	public String getPlantel() {
		return plantel;
	}

	public void setPlantel(String plantel) {
		this.plantel = plantel;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreoInstitucional() {
		return correoInstitucional;
	}

	public void setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = correoInstitucional;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	
	public void setInfo( Node nodo) {

		if ( nodo.getNodeName().equals("matricula"))
			this.matricula = nodo.getTextContent();
		
		if ( nodo.getNodeName().equals("licenciatura"))
			this.licenciatura = nodo.getTextContent();
		
		if ( nodo.getNodeName().equals("plantel"))
			this.plantel = nodo.getTextContent();
		
		
		
		
		if ( nodo.getNodeName().equals("semestre") ) {
			this.semestre = Integer.parseInt( nodo.getTextContent().trim()) ;
			
			
		}
		
		/*
apellidoPaterno
apellidoMaterno
nombre
correoInstitucional
semestre
ciclos
*/
	}
	
}
