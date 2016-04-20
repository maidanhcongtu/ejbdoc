package mhdanh.ejbdoc.resource;

import java.util.Set;

import javax.ejb.EJB;
import javax.ejb.EJBs;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import mhdanh.ejbdoc.annotation.MyUser;
import mhdanh.ejbdoc.bussiness.UserBussiness;
import mhdanh.ejbdoc.model.User;

@Path("user")
@Stateless
public class UserResource{
	
	@Inject
	@MyUser
	private User user;
	
	@Inject
	private UserBussiness userBussiness;
	
	@GET
	@Path("{id}")
	public User getUser(@PathParam("id") int id) {
		return user;	
	}
	
	@GET
	@Path("hello")
	public String sayHello(){
		return userBussiness.sayHello();
	}
	
}
