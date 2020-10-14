package interfaces;

import java.util.List;

import modelo.Curso;
import modelo.Estudiante;

public interface CrudCurso {

	
	 public List listarCurso(); // Listar
	    public Estudiante buscarCurso(Curso curso); //buscar
	    public boolean agregarCurso(Curso curso); //agregar
//	    public boolean editarCurso(Estudiante estudiante);  //editar
//	    public boolean eliminarestudi(int idestudiante);  //eliminar
	    
}
