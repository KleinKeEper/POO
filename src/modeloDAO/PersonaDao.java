package modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.bd.ConectaBd;
import interfaces.IPersona;
import modelo.Estudiante;
import modelo.Persona;

public class PersonaDao implements IPersona {

	
	ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Estudiante e = new Estudiante();
	
	@Override
	public List listarestudiante() {
		// TODO Auto-generated method stub
		 ArrayList<Persona> personas = new ArrayList<>();
	        String consulta = " select * from persona ";
	        try {
	            con = cn.getConnection();
	            pst = con.prepareStatement(consulta);
	            rs = pst.executeQuery();
	            
	            while(rs.next()){
	            	Persona persona = new Persona();
	            	
	            	persona.setId_persona(rs.getInt("id_persona"));
	            	persona.setNombre(rs.getString("nombre"));
	            	persona.setApellido(rs.getString("apellido"));
	            	persona.setEdad(rs.getInt("edad"));
	            	persona.setSexo(rs.getString("sexo"));
	            	persona.setProfesion(rs.getString("profesion"));
	            	
	            	personas.add(persona);
	            }
	            
	        } catch (Exception e) {
	            System.out.println("Error: Problemas con el LISTAR Persona");
	            System.out.println(e.getMessage());
	        }
	        
	        return personas;
	}

}
