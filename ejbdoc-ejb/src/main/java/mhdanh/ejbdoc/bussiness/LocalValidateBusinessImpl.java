package mhdanh.ejbdoc.bussiness;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;

@RequestScoped
@Alternative
public class LocalValidateBusinessImpl implements ValidateBusinessInterface{

	@Override
	public String getBusinessName() {
		return "local business name";
	}

}
