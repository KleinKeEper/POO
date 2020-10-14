package modelo;

public class Curso {
	private int id_curso;
	private String nombre_curso;
	private String docente_curso;
	
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Curso(int id_curso, String nombre_curso, String docente_curso) {
		super();
		this.id_curso = id_curso;
		this.nombre_curso = nombre_curso;
		this.docente_curso = docente_curso;
	}


	public int getId_curso() {
		return id_curso;
	}


	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}


	public String getNombre_curso() {
		return nombre_curso;
	}


	public void setNombre_curso(String nombre_curso) {
		this.nombre_curso = nombre_curso;
	}


	public String getDocente_curso() {
		return docente_curso;
	}


	public void setDocente_curso(String docente_curso) {
		this.docente_curso = docente_curso;
	} 
	
	
	
	
	

}
