package mhdanh.ejbdoc.resource;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import mhdanh.ejbdoc.bussiness.ValidateBusinessInterface;

@Path("validate")
public class ValidateResource {
	
	@Inject
	private ValidateBusinessInterface validateBusinessInterface;
	
	@GET
	public String getBusinessName() {
		return validateBusinessInterface.getBusinessName();
	}
	
}
