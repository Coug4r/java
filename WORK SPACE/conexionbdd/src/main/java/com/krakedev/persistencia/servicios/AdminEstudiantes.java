package com.krakedev.persistencia.servicios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakdev.persistencia.utils.ConexionBDD;
import com.krakedev.persistencia.entidades.Estudiante;
public class AdminEstudiantes {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersona.class);   
	public static void insertar(Estudiante est) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Estudiante a insertar >>>"+est);
		try {
			con= ConexionBDD.conectar("postgres");
			ps = con.prepareStatement("insert  into estudiantes(cedula, nombre, apellido, email, fecha_nacimiento, codigo_profesor)"+"values(?,?,?,?,?,?)");
			ps.setString(1, est.getCedula());
			ps.setString(2, est.getNombre());
			ps.setString(3, est.getApellido());
			ps.setString(4, est.getEmail());
			ps.setDate(5, new java.sql.Date(est.getFecha_nacimiento().getTime()));
			ps.setInt(6, est.getCodigoProfesor().getCodigo());
			ps.executeUpdate();
		} catch (Exception e) {
			///loggear el error
			LOGGER.error("Error al insertar", e);
			//Mostrar Error al ususario
			throw new Exception("Error al insertar");
		}finally {
			//Cerrar Conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	public static void actualizar(Estudiante est) throws Exception{
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Estudiante a Actualizar >>>"+est);
		try {
			con= ConexionBDD.conectar("postgres");
			ps = con.prepareStatement("update estudiantes set nombre = ?, apellido= ?, email=?, fecha_nacimiento=?, codigo_profesor=? where cedula = ?");
			ps.setString(1, est.getNombre());
			ps.setString(2, est.getApellido());
			ps.setString(3, est.getEmail());
			ps.setDate(4, new java.sql.Date(est.getFecha_nacimiento().getTime()));
			ps.setInt(5, est.getCodigoProfesor().getCodigo());
			ps.setString(6, est.getCedula());
			ps.executeUpdate();
			LOGGER.debug("Update exitoso");
		} catch(Exception e){
			///loggear el error
			LOGGER.error("Error al Actualizar", e);
			//Mostrar Error al ususario
			throw new Exception("Error al Actualzar");
		}finally {
			//Cerrar Conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	public static void eliminar(String cedula) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Cedula a eliminar >>>"+cedula);
		try {
			con= ConexionBDD.conectar("postgres");
			ps = con.prepareStatement("delete from estudiantes where cedula = ?");
			ps.setString(1, cedula);
			ps.executeUpdate();
			LOGGER.debug("DELETE exitoso");
		} catch(Exception e){
			///loggear el error
			LOGGER.error("Error al Eliminar", e);
			//Mostrar Error al ususario
			throw new Exception("Error al Eliminar");
		}finally {
			//Cerrar Conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}	
	public static Estudiante buscarPorCedula(String cedulaIn) throws Exception {
		Estudiante p = null;
		Connection con=null;
		PreparedStatement ps;
		ResultSet rs = null;
		try {
			con= ConexionBDD.conectar("postgres");
			ps=con.prepareStatement("select * from estudiantes where cedula = ?");
			ps.setString(1,cedulaIn);
			rs = ps.executeQuery();
			if(rs.next()) {
				String nombrerec = rs.getString("nombre");
				String cedula = rs.getString("apellido");
				p = new Estudiante();
				p.setNombre(nombrerec);
				p.setCedula(cedula);
				return p;
			}else {
				return null;
			}
		} catch (Exception e) {	
			LOGGER.error("Error al consultar por nombre!", e);
			throw new Exception("Error al consultar por nombre!");
		}finally {
			//Cerrar Conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	public static ArrayList<Estudiante> buscarPorNombre(String nombre) throws Exception{
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		Connection con=null;
		PreparedStatement ps;
		ResultSet rs = null;
		try {
			con= ConexionBDD.conectar("postgres");
			ps=con.prepareStatement("select * from estudiantes where nombre like ?");
			ps.setString(1,"%"+nombre + "%");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String nombrerec = rs.getString("nombre");
				String cedula = rs.getString("cedula");
				Estudiante e = new Estudiante();
				e.setNombre(nombrerec);
				e.setCedula(cedula);
				estudiantes.add(e);
			}
		} catch (Exception e) {	
			LOGGER.error("Error al consultar por nombre!", e);
			throw new Exception("Error al consultar por nombre!");
		}finally {
			//Cerrar Conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		return estudiantes;
	}
}
