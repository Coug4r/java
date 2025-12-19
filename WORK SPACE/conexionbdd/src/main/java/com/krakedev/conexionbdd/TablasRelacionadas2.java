
package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TablasRelacionadas2 {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","DJI_SPARK" );
			System.out.println("Conexion exitosa!");
			ps = connection.prepareStatement("insert  into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hota)"+"values(?,?,?,?,?,?)");
			ps.setInt(1, 11);
			ps.setString(2, "10018");
			ps.setInt(3, 500);
			ps.setString(4, "D");
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
				ps.setDate(5, fechaSQL);
				ps.setTime(6, t);
				ps.executeUpdate();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
