package mhdanh.ejbdoc.resource;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import mhdanh.ejbdoc.bussiness.CustomerBussiness;

@Path("customers")
public class CustomerResource {
	
	@Inject
	private CustomerBussiness customerBussiness;
	
	@Path("test")
	@GET
	public String test() {
		return customerBussiness.testCustomerDao();
	}
}
