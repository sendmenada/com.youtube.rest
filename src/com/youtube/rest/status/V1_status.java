package com.youtube.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
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
			return "<p>Version:</p>" + api_version;
			
			
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
