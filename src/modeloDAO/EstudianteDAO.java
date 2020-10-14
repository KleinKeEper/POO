package modeloDAO;

import config.bd.ConectaBd;
import java.sql.*;
import interfaces.CRUD;
import java.util.ArrayList;
import java.util.List;
import modelo.Estudiante;


public class EstudianteDAO implements CRUD{

    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Estudiante e = new Estudiante();
    
    @Override
    public List listarestudiante() {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        String consulta = " select * from estudiante ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            
            
            while(rs.next()){
                Estudiante estudiante = new Estudiante();
                estudiante.setIdestudiante(rs.getInt("idestudiante"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellidos(rs.getString("apellidos"));
                estudiante.setDni(rs.getString("dni"));
                estudiante.setCodigo(rs.getString("codigo"));
                estudiante.setEstado(rs.getString("estado"));
                estudiantes.add(estudiante);
            }
            
        } catch (Exception e) {
            System.out.println("Error: Problemas con el LISTAR");
            System.out.println(e.getMessage());
        }
        return estudiantes;
    }

    @Override
    public Estudiante buscarestudiante(Estudiante estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarestudiante(Estudiante estudiante) {
    	
    	Boolean agregado = false;
    	
    	String consulta = "INSERT INTO estudiante (nombre , apellidos, dni, codigo, estado) values( '" + estudiante.getNombre() +
    			"' , '" + estudiante.getApellidos() + "', '" + estudiante.getDni() + "' , '" + estudiante.getCodigo() + "' , '" +
    			estudiante.getEstado()	+ "' );";
    	
    	try {
    		
    		con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
    		con.close();
            pst.close();
            agregado = true;
    		
		} catch (Exception e) {
			System.out.println("Something were wrong in Insert");
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
    	
    	
    	
    	
    	
    	return agregado;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarestudiante(Estudiante estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarestudiante(int idestudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
