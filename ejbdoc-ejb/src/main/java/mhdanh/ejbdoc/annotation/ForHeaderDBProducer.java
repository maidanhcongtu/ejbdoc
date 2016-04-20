package mhdanh.ejbdoc.annotation;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;

@RequestScoped
public class ForHeaderDBProducer {

	@ForHeaderDB
	@Produces
	EntityManager getEm() throws NamingException {
		Context ctx = new InitialContext();
        return (EntityManager) ctx.lookup("java:/ejbdoc_em_tmp");
	}
	
}
