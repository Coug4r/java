package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakdev.persistencia.utils.ConexionBDD;
import com.krakedev.persistencia.entidades.Persona;

public class AdminPersona {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersona.class);   
	public static void insertar(Persona per) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar >>>"+per);
		try {
			con= ConexionBDD.conectar("postgres");
			ps = con.prepareStatement("insert  into personas(cedula, nombre, apellido, estado_civil_codigo, numero_hijos, estatura,cantidad_ahorrada, fecha_nacimiento, hora_nacimiento)"+"values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, per.getCedula());
			ps.setString(2, per.getNombre());
			ps.setString(3, per.getApellido());
			ps.setString(4, per.getEstadoCivil().getCodigo());
			ps.setInt(5, per.getNumero_hijos());
			ps.setDouble(6, per.getEstatura());
			ps.setBigDecimal(7,per.getCantidad_ahorrada());
			ps.setDate(8,new java.sql.Date(per.getFecha_nacimiento().getTime()));
			ps.setTime(9, new Time(per.getHora_nacimiento().getTime()));
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
	public static void actualizar(Persona per) throws Exception{
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar >>>"+per);
		try {
			con= ConexionBDD.conectar("postgres");
			ps = con.prepareStatement("update personas set nombre = ?, apellido= ?, estado_civil_codigo=?, numero_hijos=?, estatura=?,cantidad_ahorrada=?, fecha_nacimiento=?, hora_nacimiento=? where cedula = ?");
			ps.setString(1, per.getNombre());
			ps.setString(2, per.getApellido());
			ps.setString(3, per.getEstadoCivil().getCodigo());
			ps.setInt(4, per.getNumero_hijos());
			ps.setDouble(5, per.getEstatura());
			ps.setBigDecimal(6,per.getCantidad_ahorrada());
			ps.setDate(7,new java.sql.Date(per.getFecha_nacimiento().getTime()));
			ps.setTime(8, new Time(per.getHora_nacimiento().getTime()));
			ps.setString(9, per.getCedula());
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
			ps = con.prepareStatement("delete from personas where cedula = ?");
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
}
