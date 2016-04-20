package mhdanh.ejbdoc.dao;

import javax.ejb.Stateless;

import mhdanh.ejbdoc.annotation.Default;

@Stateless
@Default
public class AnotherCustomerDaoImpl implements CustomerDaoInterface {

	@Override
	public String printName() {
		return "Ho Thi Tuyet Nhung";
	}

}
