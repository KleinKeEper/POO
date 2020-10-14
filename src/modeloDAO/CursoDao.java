package modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.bd.ConectaBd;
import interfaces.CrudCurso;
import modelo.Curso;
import modelo.Estudiante;

public class CursoDao implements CrudCurso{

	
	ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Curso curso  = new Curso();
	
	@Override
	public List listarCurso() {
		
		ArrayList<Curso> cursos = new ArrayList<>();
        String consulta = " select * from curso ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            
            
            while(rs.next()){
                Curso curso = new Curso();
                curso.setId_curso(rs.getInt("id_curso"));
                curso.setNombre_curso(rs.getString("nombre_curso"));
                curso.setDocente_curso(rs.getString("docente_curso"));
                cursos.add(curso);
            }
            
        } catch (Exception e) {
            System.out.println("Error: Problemas con el LISTAR CURSO");
            System.out.println(e.getMessage());
        }
		// TODO Auto-generated method stub
		return cursos;
	}

	@Override
	public Estudiante buscarCurso(Curso curso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean agregarCurso(Curso curso) {
		// TODO Auto-generated method stub
		return false;
	}

}
