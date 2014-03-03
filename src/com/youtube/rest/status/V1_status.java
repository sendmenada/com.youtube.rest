package com.youtube.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import java.sql.*;

import com.youtube.dao.*;

//import javax.ws.rs.core.Response;


@Path("/v1/status")
public class V1_status {

	
		private static final String api_version = "00.01.00";
	
		@GET
		@Produces(MediaType.TEXT_HTML)
		public String returnTitle() {
			return "<h2><span style=\"color:#ff0000;\">Web Service</span></h2>";
			
			
		}
		
		@Path("/version")
		@GET
		@Produces(MediaType.TEXT_HTML)
		public String returnVersion() {
			System.out.println("Api Version");
			return "<p>Version:</p>" + api_version;
			
			
		}

		@Path("/database")
		@GET
		@Produces(MediaType.TEXT_HTML)
		public String returnDatabaseStatus() throws Exception {
			
			PreparedStatement query = null;
			String myString = null;
			String returnString = null;
			Connection conn = null;
			
			try {
				
				conn = OracleXE.OracleXEConn().getConnection();
				query = conn.prepareStatement("select to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS') DATETIME " +
				"from sys.dual");
				ResultSet rs = query.executeQuery();
				
				while (rs.next()) {
					myString = rs.getString("DATETIME");
					
				}
				
				query.close();
				
				returnString = "<p>Database Status</p> " +
						"<p>Database Date/Time return: " + myString + "</p>";
				
			
			}
			catch (Exception e) {
				
			
				
				e.printStackTrace();
			}
			finally{
				if (conn != null) conn.close();
				
			}
			
			return returnString;
		}
		
		
		//@PUT
		//public Response putContainer() {
		//	System.out.println("PUT ");
			
			
			//URI uri = uriInfo.getAbsolutePath();
			//Container c = new Container(container, uri.toString());
			
			//Response r = Response.ResponseBuilde name = new (arguments);
			
			//if (!MemoryStore.MS.hasContainer(c)) {
			//	r = Response.created(uri).build();
			//} else {
			//	r = Response.noContent().build();
			//}
			
			//MemoryStore.MS.createContainer(c);
			//return r;
			
			
		//}

}
