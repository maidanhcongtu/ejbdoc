package mhdanh.ejbdoc.dao;

import java.lang.reflect.ParameterizedType;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import mhdanh.ejbdoc.annotation.ForHeaderDB;

@Stateless
public class BaseDao<T> {

	@Inject
	@ForHeaderDB
	private EntityManager em;

	private Class<T> persistentClass;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@SuppressWarnings("unchecked")
	public Class<T> getPersistentClass() {
		if(persistentClass == null){
			persistentClass = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		} 
		return persistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}
	
	
	public static void main(String []args) {
		RoomDao roomDao = new RoomDao();
		System.out.println(roomDao.getPersistentClass());
	}

}
