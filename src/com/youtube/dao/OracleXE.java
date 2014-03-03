package com.youtube.dao;

import javax.naming.*;
import javax.sql.*;

public class OracleXE {
	
	private static DataSource OracleXE = null;
	private static Context context = null;
	
	public static DataSource OracleXEConn() throws Exception {
		
		if (OracleXE != null) {
			return OracleXE;
		}
		
		try {
			
			if (context == null) {
				context = new InitialContext();
			}
			
			OracleXE = (DataSource) context.lookup("oraclexe");
			
		}
	
		catch(Exception e) {
			e.printStackTrace();
		}
	
		return OracleXE;
		
	}
	
	
	
	

}
