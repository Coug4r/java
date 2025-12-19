
package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","DJI_SPARK" );
			System.out.println("Conexion exitosa!");
			ps = connection.prepareStatement("insert  into personas(cedula, nombre, apellido, estado_civil_codigo, numero_hijos, estatura,cantidad_ahorrada, fecha_nacimiento, hora_nacimiento)"+"values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, "1102342293");
			ps.setString(2, "Paco");
			ps.setString(3, "Cueva");
			ps.setString(4, "C");
			ps.setInt(5, 2);
			ps.setFloat(6, (float)(1.71));
			ps.setInt(7,400);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2020/03/22 00:5:02";
			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				
				Time t = new Time(fechaMilis);
				System.out.println(t);
				ps.setDate(8, fechaSQL);
				ps.setTime(9, t);
				ps.executeUpdate();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
