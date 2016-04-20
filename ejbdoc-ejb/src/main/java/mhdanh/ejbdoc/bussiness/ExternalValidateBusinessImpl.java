package mhdanh.ejbdoc.bussiness;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;

@RequestScoped
@Alternative
public class ExternalValidateBusinessImpl implements ValidateBusinessInterface {

	@Override
	public String getBusinessName() {
		return "external business name";
	}

}
