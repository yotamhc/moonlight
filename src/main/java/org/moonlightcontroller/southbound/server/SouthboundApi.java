package org.moonlightcontroller.southbound.server;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.moonlightcontroller.managers.ConnectionManager;
import org.moonlightcontroller.managers.models.messages.*;
import org.moonlightcontroller.managers.models.messages.Error;

@Path("/message/")
public class SouthboundApi {
	@GET
	@Path("test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		return "Test";
	}

	@POST
	@Path("Hello")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response hello(Hello message) {
		return ConnectionManager.getInstance().handleHelloRequest(message);
	}

	@POST
	@Path("KeepAlive")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response keepalive(KeepAlive message) {
		return ConnectionManager.getInstance().handleKeepaliveRequest(message);
	}
	
	@POST
	@Path("ReadResponse")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response ReadResponse(ReadResponse message) {
		return ConnectionManager.getInstance().handleReadResponse(message);
	}
	
	@POST
	@Path("Error")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response Error(Error message) {
		return ConnectionManager.getInstance().handleErrorMessage(message);
	}

	@POST
	@Path("ListCapabilitiesResponse")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response ListCapabilitiesResponse(ListCapabilitiesResponse message) {
		return ConnectionManager.getInstance().handleListCapabilitiesResponse(message);
	}

	@POST
	@Path("SetParametersResponse")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response SetParametersResponse(SetParametersResponse message) {
		return ConnectionManager.getInstance().handleSetParametersResponse(message);
	}

	@POST
	@Path("GetParametersResponse")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response GetParametersResponse(GetParametersResponse message) {
		return ConnectionManager.getInstance().handleGetParametersResponse(message);
	}

	@POST
	@Path("GlobalStatsResponse")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response GlobalStatsResponse(GlobalStatsResponse message) {
		return ConnectionManager.getInstance().handleGlobalStatsResponse(message);
	}

	@POST
	@Path("WriteResponse")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response WriteResponse(WriteResponse message) {
		return ConnectionManager.getInstance().handleWriteResponse(message);
	}

	@POST
	@Path("SetProcessingGraphResponse")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response SetProcessingGraphResponse(SetProcessingGraphResponse message) {
		return ConnectionManager.getInstance().handleSetProcessingGraphResponse(message);
	}

	@POST
	@Path("Alert")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response Alert(Alert message) {
		return ConnectionManager.getInstance().handleAlert(message);
	}
}
