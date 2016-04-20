package mhdanh.ejbdoc.bussiness;

import javax.ejb.Stateless;
import javax.inject.Inject;

import mhdanh.ejbdoc.annotation.Default;
import mhdanh.ejbdoc.dao.CustomerDaoInterface;

@Stateless
public class CustomerBussiness {
	
	@Inject
	@Default
	private CustomerDaoInterface customerDaoInterface;
	
	public String testCustomerDao() {
		return customerDaoInterface.printName();
	}
}
