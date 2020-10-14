package vistacontrol;

import java.util.List;
import modelo.Estudiante;
import modeloDAO.EstudianteDAO;

public class Index {
	
	private static EstudianteDAO estudianteDAO = new EstudianteDAO();

    public static void listarEstudiantes() {
        EstudianteDAO estudianteDAO = new EstudianteDAO();
        List<Estudiante> estudiantes = estudianteDAO.listarestudiante();
        
        System.out.println("Listado de Estudiantes");
        System.out.println("ID" + "\t" + "DNI" + "\t\t" + "CODIGO" + "\t\t" + "ESTADO" + "\t" + "NOMBRE_COMPLETO");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(
                    estudiante.getIdestudiante() + "\t"
                   // + estudiante.getNombreCompleto() + "\t"
                    + estudiante.getDni() + "\t"
                    + estudiante.getCodigo() + "\t"
                    + estudiante.getEstado() + "\t"
                    + estudiante.getNombreCompleto()                    
            );
        }
    }
    
      
    public static String darFormato(String cadena){
        if (cadena.length()>=31) {
            cadena = cadena.substring(0,28) + "..  ";
        }else if (cadena.length()>=23) {
        	cadena = cadena + "\t";
        }else if (cadena.length()>=15) {
            cadena = cadena + "\t\t";
        }else if (cadena.length()>=7){
            cadena = cadena + "\t\t\t";
        }else {
            cadena = cadena + "\t\t\t\t";
        }
        return cadena;
    }

    
    public static void insert() {
    	if (estudianteDAO.agregarestudiante(new Estudiante(0, "Klein", "Keep", "75019485", "201825015", "A"))) {
			System.out.println("El registro a sido insertado satisfactoriamente !!!");
		}
		
	}
    
    public static void main(String[] args) {
		/*
		 * System.out.println("Nombre\t\t\t\t" + "Apeliido " );
		 * System.out.println(darFormato("Esto es un nombre de algu ser frg") +
		 * "Apellido"); System.out.println(darFormato("Esto es un nombre de algu  ") +
		 * "Apellido"); System.out.println(darFormato("Esto es un nombre") +
		 * "Apellido"); System.out.println(darFormato("Esto eshjkhjhj") + "Apellido");
		 * System.out.println(darFormato("E ") + "Apellido");
		 * System.out.println(darFormato("Ejkjlkjlkjlkjlklhjhjjhjkhjhj") + "Apellido");
		 */
//    	listarEstudiantes();
    	insert();
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
