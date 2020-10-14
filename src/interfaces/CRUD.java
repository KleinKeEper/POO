package interfaces;

import java.util.List;
import modelo.Estudiante;


public interface CRUD {
	 
    public List listarestudiante(); // Listar
    public Estudiante buscarestudiante(Estudiante estudiante); //buscar
    public boolean agregarestudiante(Estudiante estudiante); //agregar
    public boolean editarestudiante(Estudiante estudiante);  //editar
    public boolean eliminarestudiante(int idestudiante);  //eliminar
    
    
}
