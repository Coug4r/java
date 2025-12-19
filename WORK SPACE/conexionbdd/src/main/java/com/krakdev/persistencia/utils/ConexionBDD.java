package com.krakdev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ConexionBDD {
	private static final Logger LOGGER = LogManager.getLogger(ConexionBDD.class);   
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/";
	private static final String USER = "postgres";
	private static final String PASSWORD = "DJI_SPARK";
	
	public static Connection conectar(String bdd) throws Exception{
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL+bdd,USER,PASSWORD );
			LOGGER.debug("Conexion exitosa!");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error de infraestructura!");
			throw new Exception("Error en la infraestructura!");
		} catch(SQLException e) {
			LOGGER.error("Error en la connexion, revise usuario y clave!");
			throw new Exception("Error en la connexion, revise usuario y clave!");
		}
		return connection;
	}
}
