package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
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
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
