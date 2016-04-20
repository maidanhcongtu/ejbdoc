package mhdanh.ejbdoc.dao;

import javax.ejb.Stateless;

@Stateless
public class CustomerDaoImpl implements CustomerDaoInterface{

	@Override
	public String printName() {
		return "Mai Ho";
	}

}
