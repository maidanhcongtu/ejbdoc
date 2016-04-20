package mhdanh.ejbdoc.annotation;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

import mhdanh.ejbdoc.model.User;

@RequestScoped
public class MyUserProducer {
	
	@Produces
	@MyUser
	public User caiGiCungDc() {
		User user = new User();
		user.setId(1);
		user.setUsername("mhdanh");
		user.setPassword("123");
		user.setBirthdate(new Date());
		return user;
	}

}
