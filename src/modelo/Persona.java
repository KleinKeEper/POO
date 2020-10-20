package modelo;

import com.mysql.fabric.xmlrpc.base.Data;

public class Persona {
	
	private int id_persona;
	private String nombre;
	private String apellido;
	private int edad;
	private String sexo;
	private String profesion;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Persona(int id_persona, String nombre, String apellido, int edad, String sexo, String profesion) {
		super();
		this.id_persona = id_persona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.profesion = profesion;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	
	

}
