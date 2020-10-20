package vistacontrol;

import java.util.List;

import interfaces.CRUD;
import modelo.Curso;
import modelo.Estudiante;
import modelo.Persona;
import modeloDAO.CursoDao;
import modeloDAO.EstudianteDAO;
import modeloDAO.PersonaDao;

public class Index {

	private static EstudianteDAO estudianteDAO = new EstudianteDAO();
	private static CursoDao cursoDao = new CursoDao();
	private static PersonaDao personaDao = new PersonaDao();

	public static void listarEstudiantes() {
		EstudianteDAO estudianteDAO = new EstudianteDAO();
		List<Estudiante> estudiantes = estudianteDAO.listarestudiante();

		System.out.println("Listado de Estudiantes");
		System.out.println("ID" + "\t" + "DNI" + "\t\t" + "CODIGO" + "\t\t" + "ESTADO" + "\t" + "NOMBRE_COMPLETO");
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.getIdestudiante() + "\t"
			// + estudiante.getNombreCompleto() + "\t"
					+ estudiante.getDni() + "\t" + estudiante.getCodigo() + "\t" + estudiante.getEstado() + "\t"
					+ estudiante.getNombreCompleto());
		}
	}

	
	public static void listarCurso() {
		
		List<Curso> cursos = cursoDao.listarCurso();

		System.out.println("Listado de curso");
		System.out.println("ID" + "\t" + "curso" + "\t\t" + "Docente" );
		for (Curso curso : cursos) {
			System.out.println(curso.getId_curso() + "\t"
			// + estudiante.getNombreCompleto() + "\t"
					+ curso.getNombre_curso() + "\t" + curso.getDocente_curso());
		}
		
	}
	
	
	private static void listarPersona() {
		List<Persona> personas = personaDao.listarestudiante();
		
		System.out.println("\t\t\t" + " **** Listado de Personas ******");
		System.out.println("ID\tNombre\t\tApellido\tEdad\tSexo\tProfesion");
		
		for (Persona persona : personas) {
			System.out.println(formatoID(String.valueOf(persona.getId_persona()))  + darFormato(persona.getNombre()) 
			+ darFormato(persona.getApellido())+ 
			formatoID(String.valueOf(persona.getEdad())) + formatoID(persona.getSexo()) + darFormato(persona.getProfesion()) );
		}
		
	}
	
	public static void insertEstuduante() {
		
//		System.out.println(estudianteDAO.agregarestudiante(new Estudiante(0, "Klein", "Keep", "45647845", "201851120", "A")));
		
		if (estudianteDAO.agregarestudiante(new Estudiante(0, "Klein", "Keep", "45647845", "201851120", "A"))) {
			System.out.println("Ingresado correctamente");
		}else {
			System.out.println("No se inserto el registro");
		}			
		
	}
	
	
	public static String formatoID(String cadena) {
		
		return cadena + "\t";
	}
	
	public static String darFormato(String cadena) {
		// 7
//		if (cadena.length() >= 15) {
//			cadena = cadena.substring(0, 10) + "../t";
//		} else if (cadena.length() >= 10) {
//			cadena = cadena + "\t";
//		} else if (cadena.length() >= 7) {
//			cadena = cadena + "\t\t";
//		} else {
//			cadena = cadena + "\t\t";
//		}
		
		if (cadena.length() >= 15) {
			cadena = cadena.substring(0, 10) + "..\t";
		} else if (cadena.length() >= 10) {
			cadena = cadena + "\t";
		} else {
			cadena = cadena + "\t\t";
		}
		return cadena;
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

//		listarEstudiantes(); 
//		insertEstuduante();
//		listarCurso();
		
		listarPersona();

	}
}
