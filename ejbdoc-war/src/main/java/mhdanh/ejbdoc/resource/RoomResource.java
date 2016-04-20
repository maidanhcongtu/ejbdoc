package mhdanh.ejbdoc.resource;


import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import mhdanh.ejbdoc.annotation.MyUser;
import mhdanh.ejbdoc.bussiness.RoomBusiness;
import mhdanh.ejbdoc.entity.RoomEntity;
import mhdanh.ejbdoc.model.User;

@Path("rooms")
@Stateless
public class RoomResource {
	
	@Inject
	private RoomBusiness roomBusiness;
	
	@MyUser
	private User myUser;
	
	@POST
	public Object saveRoom() {
		return roomBusiness.saveRoom();
	}
	
	@GET
	@Produces("application/json")
	public List<RoomEntity> getAll() {
		return roomBusiness.getAllRooms();
	}
	
	
	
	@GET
	@Produces("application/json")
	public List<RoomEntity> getAllRoom(@QueryParam("option") String option) {
		if(myUser != null) {
			
		}
		if(option == "name-query") {
			return roomBusiness.getAllRoomsByNameQuery();
		}
		return null;
	}
	
	@DELETE
	@Produces("plain/text")
	public String deleteAll() {
		return "row effected " + roomBusiness.deleteAll();
	}
	
	
}
